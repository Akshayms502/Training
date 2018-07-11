package SingletonPatternDay3;

public class TestingLazyClient {
	public static void main(String[] args) {
		
		TestingLazy singleton=TestingLazy.getInstance();
		System.out.println(singleton.hashCode());

		singleton=TestingLazy.getInstance();
		System.out.println(singleton.hashCode());
		
		singleton=TestingLazy.getInstance();
		System.out.println(singleton.hashCode());
		
	}
}
