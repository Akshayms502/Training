package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class Test implements ICriteria{

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		List<Person> maleOrMarried=new ArrayList<Person>();
		for(Person temp:person){
			if(temp.getSex().equalsIgnoreCase("male") || temp.getMaritalStatus().equalsIgnoreCase("married")){
				maleOrMarried.add(temp);
			}
		}
		return maleOrMarried;
	}

}
