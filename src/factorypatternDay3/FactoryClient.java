package factorypatternDay3;

public class FactoryClient {

	public static void main(String[] args) {
		Car car=Car.getCar(CarName.MARUTHI);
				car.drive();
	
	car=Car.getCar(CarName.BMW);
			car.drive();
}

}
