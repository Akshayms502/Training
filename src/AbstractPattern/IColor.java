package AbstractPattern;

public interface IColor {
	void printCar();
}

class Red implements IColor{

	@Override
	public void printCar() {
		System.out.println("car color red");
		
	}
	
}

class Blue implements IColor{

	@Override
	public void printCar() {
		System.out.println("car color blue");
		
	}
	
}


