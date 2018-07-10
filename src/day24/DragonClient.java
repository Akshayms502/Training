package day24;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonClient {

	public static void main(String[] args) {
		List<Dragon> dragon=Stream.of(
				new Dragon("errol","usa",15),
				new Dragon("errol","usa",33),
				new Dragon("firman","usa",5),
				new Dragon("hasal","france",12),
				new Dragon("icefire","france",3)
				).collect(Collectors.toList());

		
		Map<String,Long> mapCount=dragon.stream().
				collect(Collectors.groupingBy(Dragon::getName,
				Collectors.counting()		
						));
		System.out.println(mapCount);
		
		System.out.println("-------------------------------");
		
		Map<String, Integer> sumOfDragon=dragon.stream().
				collect(Collectors.groupingBy(Dragon::getName,
				Collectors.summingInt(Dragon::getCount)		
						));
		//report of sum of dragons
		sumOfDragon.forEach(
				(k,v)->{
					System.out.println("dragon name"+k+",Number of dragons"+v);
				}
				);
		
		Double ls=dragon.stream().collect(Collectors.averagingInt(Dragon::getCount));
		System.out.println(ls);
		
		int ls1=dragon.stream().collect(Collectors.maxBy());
		
		//todo
		//write java 8 snippet to find the stats of the dragonlist
		//should display sum/avg/min/max/ of dragons
		//find the dragons by country and keep the names of dragons of different countries in the list/set
		//
	}
	
	

}
