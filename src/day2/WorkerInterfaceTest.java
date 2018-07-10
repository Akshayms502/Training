package day2;

public class WorkerInterfaceTest {

	public static void main(String[] args) {
		
		Runner runner=new Runner();
		
		runner.execute(new WorkerInterface(){

			@Override
			public void doSomeWork() {
				System.out.println("we are doing some work");
				
			}
			
		});
		
		//java 8 way
		
		runner.execute(()->System.out.println("we are doing some work"));
		
		

	}

}
