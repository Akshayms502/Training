package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("lohit","male","married"));
		list.add(new Person("ram","male","married"));
		list.add(new Person("sri","female","married"));
		list.add(new Person("megha","female","single"));
		list.add(new Person("deepa","female","single"));
		list.add(new Person("akshay","male","single"));
		
		
		ICriteria criteria=new Male();
		
		criteria.meetCriteria(list).forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		
		ICriteria criteria1=new Female();
		
		criteria1.meetCriteria(list).forEach(System.out::println);
		
		System.out.println("------------------------------------------");
		
		ICriteria criteria2=new Married();
		
		criteria2.meetCriteria(list).forEach(System.out::println);
		System.out.println("------------------------------------------");
		
		ICriteria criteria3=new Test();
		
		criteria3.meetCriteria(list).forEach(System.out::println);
		System.out.println("-------------------------------------------------");
		///male and single
		
		ICriteria x=new Testing(criteria,criteria2);
		x.meetCriteria(list).forEach(System.out::println);

	}

}
