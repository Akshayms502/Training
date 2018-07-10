package day23;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class RandomFilter {
	public static void main(String[] args) {
		int random=ThreadLocalRandom.current().nextInt(100,200);
		
		
		Random x=new Random();
		x.ints(10,100,200).forEach(System.out::println);
		
		Predicate<Integer> val=i-> i>165; 
		
		System.out.println("------------------------------");
		//sorted order
		x.ints(10,100,200).sorted().forEach(System.out::println);
		//x.ints(10,100,200).anyMatch((IntPredicate) val);
		
		//without using random using jdk 1.8
		
		Stream.iterate(10,i->i+1).limit(20).sorted().forEach(System.out::println);
		
	}

}
