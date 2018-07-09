package mypackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaExample {
	public static void main(String[] args){
		int num1=0;
		List<Integer> num=Arrays.asList(20,10,5,35,50);
		//for jdk 1.7
		for(int x:num){
			System.out.println(x);
		}
		System.out.println("-----------------------------------------");
		//for jdk 1.5
		for(int i=0;i<num.size();i++){
			System.out.println(num.get(i));
		}
		System.out.println("-----------------------------------------");
		//for lamda way1
		num.forEach(temp->System.out.println(temp)); 
		System.out.println("-----------------------------------------");
		//way2
		num.forEach(System.out::println);
		System.out.println("-----------------------------------------");
		
		//internal working
		num.forEach(new Consumer<Integer>(){        //Consumer is a ananomyous function it has only one functional interface accept

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
		});
	
		
		for(int x:num){
			num1+=x;
		}
		System.out.println(num1);
		
		System.out.println(num.stream().map(e->e*2).reduce((res,e)->res+e));
	}

	
	
}
