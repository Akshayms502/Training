package factorypatternDay3;

public abstract class Car {
	public static Car getCar(CarName carName){
		if(carName==CarName.MARUTHI){
			return new Maruthi();
		}else if(carName==CarName.BMW){
			return new BMW();
		}else if(carName==CarName.MARUTHI){
			return new Audi();
		}
		return null;
		
		
	}
	public abstract void drive();

}
