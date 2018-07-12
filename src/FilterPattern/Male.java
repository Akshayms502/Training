package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class Male implements ICriteria {

	@Override
	public List<Person> meetCriteria(List<Person> person) {
		List<Person> male=new ArrayList<Person>();
		for(Person temp:person){
			if(temp.getSex().equalsIgnoreCase("male")){
				male.add(temp);
			}
		}
		return male;
	}

}
