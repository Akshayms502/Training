package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args){
		Predicate<Integer> greaterThan=i-> i>10;
		Predicate<Integer> lessThan=i->i<10;
		
		List<Integer> intList=Arrays.asList(12,45,23,56,89,10,5);
		System.out.println(greaterThan.test(12));
		
		List<Integer> ge=filteredList(intList,greaterThan);
		ge.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		Predicate<Integer> posNo=i->i>0;
		Predicate<Integer> betweenRange=i->i>0 && i<100;
		
		
		
		Predicate<Integer> cPredicate=posNo.and(betweenRange);
		List<Integer> ge1=filteredList(intList,cPredicate);
		ge1.forEach(System.out::println);
		
		
			
	}
	
	
	public static List<Integer> filteredList(List<Integer> num,Predicate<Integer> predicate){
		List<Integer> flList=new ArrayList<Integer>();
		
		for(Integer temp:num){
			if(predicate.test(temp)){
				flList.add(temp);
			}
			
		}return flList;
	}
	
	
	
	

}
