package FilterPattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Testing implements ICriteria{
	
	private ICriteria firstCriteria;
	private ICriteria secondCriteria;
	
	public Testing(ICriteria firstCriteria,ICriteria secondCriteria){
		super();
		this.firstCriteria=firstCriteria;
		this.secondCriteria=secondCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		List<Person> addList=firstCriteria.meetCriteria(person);
		 List<Person> addList2=secondCriteria.meetCriteria(person);
		  
	//	 for(Person val:addList2){
	//	 if(!addList.contains(val)){
	//	 addList.add(val);
	//	 }
		 
		 addList.addAll(addList2);
		 Set<Person> x=new HashSet<Person>(addList);
		 return new ArrayList<Person>(x);
		 
//	}
//return addList;
	}
}
