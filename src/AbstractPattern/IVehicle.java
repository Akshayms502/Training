package AbstractPattern;

public interface IVehicle {
 void speed();
 void paintCar(IColor col);
}

class Audi implements IVehicle{

	@Override
	public void speed() {
		System.out.println("speed"+"350km");
		
	}

	@Override
	public void paintCar(IColor col) {
		col.printCar();
		
	}
	
}

class Bmw implements IVehicle{

	@Override
	public void speed() {
		System.out.println("speed is 250km");
		
	}

	@Override
	public void paintCar(IColor col) {
		col.printCar();
		
	}
	
}
