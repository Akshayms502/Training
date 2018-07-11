package SingletonPatternDay3;
//working of eeger singleton
public class SingletonClient {

	public static void main(String[] args) {
		Singleton singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());

		singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());
		
		singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());
	}

}
