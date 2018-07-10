package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import day23.Person;

public class PredicatePerson {

	public static void main(String[] args) {
		
		List<Person> ls=Arrays.asList(
				new Person(101,"Goutham",3000),
				new Person(102,"sachin",4000),
				new Person(103,"sridhar",7000),
				new Person(104,"chethan",9000)
				
				);
		
		Predicate<Person> g=c->c.getSalary()>5000;
		
		List<Person> ls1=filteredList(ls,g);
		ls1.forEach(System.out::print);
		System.out.println("--------------------------------------------");
		List<Person> ls2=filteredList(ls,isSalaryGreater());
		ls1.forEach(System.out::print);

	}

	private static List<Person> filteredList(List<Person> ls, Predicate<Person> g) {
		List<Person> flList=new ArrayList<Person>();
		for(Person x:ls){
			if(g.test(x)){
				flList.add(x);
			}
		}
		return flList;
	}
	
	private static List<Person> filteredList1(List<Person> ls, Predicate<Person> g) {
		return ls.stream().filter(g).collect(Collectors.<Person>toList());
	}
	
	
	public static Predicate<Person> isSalaryGreater(){
		return p->p.getName().equals("sachin")&&
				p.getSalary()>3000;
	}
	
	
	}



