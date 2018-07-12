package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class Female implements ICriteria{

	public List<Person> meetCriteria(List<Person> person) {
		List<Person> female=new ArrayList<Person>();
		for(Person temp:person){
			if(temp.getSex().equalsIgnoreCase("female")){
				female.add(temp);
			}
		}
		return female;
	}

}
