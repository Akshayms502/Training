package SingletonPatternDay3;

import java.lang.reflect.Constructor;

//program to access singleon(eager) through reflection

public class Reflection {

	public static void main(String[] args)  {
		Singleton s1=Singleton.getInstance();
		Singleton s2=null;
		Singleton s3=null;
		
		
		Constructor[]  con=Singleton.class.getDeclaredConstructor();
		
		for(Constructor cons: con){
			cons.setAccessible(true);
			s1=(Singleton) cons.newInstance();
			s2=(Singleton) cons.newInstance();
			break;
		}
		System.out.println("new instance"+s1.hashCode());
		System.out.println("new instance"+s2.hashCode());
	}

}
