package serviceLocator;

public class ErpService implements Service {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "erp";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("executing erp service");
	}

}
