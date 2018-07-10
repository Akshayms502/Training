package day21;

import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Person> ls=Arrays.asList(
				new Person(101,"Mashroom"),
				new Person(102,"sachin"),
				new Person(103,"sridhar"),
				new Person(104,"chethan")
				
				);
		ls.forEach(System.out::println);
		PersonConsumer x=new PersonConsumer();
		ls.forEach(x);
	}

}
