package SingletonPatternDay3;

public class TestingLazy {
private static final TestingLazy instance=new TestingLazy();
	
	private TestingLazy(){
		System.out.println("constructor is called");
	}

	
	public static TestingLazy getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}

}
