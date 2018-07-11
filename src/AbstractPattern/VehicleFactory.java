package AbstractPattern;

public class VehicleFactory extends AbstarctFactory{

	@Override
	public IVehicle getVehicle(String vehicle) {
		if(vehicle.equals("audi")){
			return new Audi();
	}else if(vehicle.equals("Bmw")){
		return new Bmw();
	}
		return null;
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
