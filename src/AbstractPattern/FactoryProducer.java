package AbstractPattern;

public class FactoryProducer {
	
	public static AbstarctFactory getFactory(String factoryName){
		if(factoryName.equals("vehicle")){
			return new VehicleFactory();
		}else if(factoryName.equals("color")){
			return new ColorFactory();
		}
		return null;
		
	}

}
