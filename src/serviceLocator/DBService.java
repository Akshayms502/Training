package serviceLocator;

public class DBService implements Service{

	@Override
	public String getName() {
		
		return "db";
	}

	@Override
	public void execute() {
		
		System.out.println("WE ARE EXECUTING DB SERVICE");
	}
	

}
