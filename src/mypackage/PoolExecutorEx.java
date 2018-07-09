package mypackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PoolExecutorEx {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor=Executors.newSingleThreadExecutor();
		executor.execute(new Runnable(){

			@Override
			public void run() {
				System.out.println("hi lamda");
				
			}
			
		});
		executor.shutdown();
		
		//lamda
		
		ExecutorService executor1=Executors.newSingleThreadExecutor();
		
		executor1.execute(()->{
			System.out.println("hi lamda 8");
		});
		executor1.shutdown();
		
		//callable work
		ExecutorService executor2=Executors.newSingleThreadExecutor();
		Set<Callable<String>> cal=initializeCollable();
	//	String result=executor2.invokeAny(cal);
	//	System.out.println("result"+result);
		List<Future<String>> result=executor2.invokeAll(cal);
		for(Future temp:result){
			System.out.println(temp.get());
		}
		
		executor2.shutdown();
		
		

	}
	
	public static Set<Callable<String>> initializeCollable(){
		Set<Callable<String>> cal=new HashSet<Callable<String>>();
		cal.add(()->"1st callable");
		cal.add(()->"2st callable");
		cal.add(()->"3st callable");
		cal.add(()->"4st callable");
		cal.add(()->"5st callable");
		cal.add(()->"6st callable");
		
		cal.add(new Callable<String>(){
			public String call() throws Exception{
				return "calllable thread";
			}
		});
		
		cal.add(()->{ return "complex called business logic";});
		return cal;
		
		
	}

}
