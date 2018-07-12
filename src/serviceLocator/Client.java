package serviceLocator;

public class Client {

	public static void main(String[] args) {
		Service dbService=ServiceLocator.getService("db");
		dbService.execute();
		
		Service erpService=ServiceLocator.getService("erp");
		erpService.execute();
		
		
		dbService=ServiceLocator.getService("db");
		dbService.execute();

	}

}
