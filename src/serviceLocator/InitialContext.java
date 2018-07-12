package serviceLocator;

public class InitialContext {

	public Object lookup(String jndiName){
		if(jndiName.equalsIgnoreCase("db")){
			System.out.println("lloking for db service and creating");
			return new DBService();
		}else if(jndiName.equalsIgnoreCase("erp")){
			System.out.println("looking for erp service");
			return new ErpService();
		}
		return null;
	}
	
	
	
}
