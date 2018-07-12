package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class Married implements ICriteria{

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		List<Person> married=new ArrayList<Person>();
		for(Person temp:person){
			if(temp.getMaritalStatus().equalsIgnoreCase("married")){
				married.add(temp);
			}
		}
		return married;
	}

}
