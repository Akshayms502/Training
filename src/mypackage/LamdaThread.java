package mypackage;

import java.io.InterruptedIOException;

public class LamdaThread {

	public static void main(String[] args) {
		new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("thread start");
				
			}
			
		}).start();
		
		
		
		//lamda
		
		new Thread( ()->System.out.println("thread start")).start();;
		
		
		new Thread(()->
		{
			System.out.println("hi lamda");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("lamda is calling");
		}).start();

	}

}
