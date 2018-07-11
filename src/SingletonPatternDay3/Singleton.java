package SingletonPatternDay3;

import java.io.Serializable;

//eeager singleton
public class Singleton implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6257046575497044022L;
	private static final Singleton instance=new Singleton();
	
	private Singleton(){
		System.out.println("constructor is called");
	}

	
	public static Singleton getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}
	
	//to stop creating instance if already exist
	//this is only when class is serialized and objectInputstream
	protected Object readResolve(){
		return getInstance();
	}
}
