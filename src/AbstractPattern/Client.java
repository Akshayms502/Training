package AbstractPattern;

public class Client {

	public static void main(String[] args) {
		AbstarctFactory fact=FactoryProducer.getFactory("vehicle");
		IColor x1=FactoryProducer.getFactory("color").getColor("blue");
		IVehicle v1=fact.getVehicle("audi");
		v1.speed();
		v1.paintCar(x1);
		
		IVehicle v2=fact.getVehicle("Bmw");
		v2.speed();
		
		IColor x2=FactoryProducer.getFactory("color").getColor("red");
		x2.printCar();
		

	}

}
