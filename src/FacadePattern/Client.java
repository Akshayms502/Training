package FacadePattern;

public class Client {

	public static void main(String[] args) {
		FacadeCar myCar=new FacadeCar();
		
		myCar.hachBackDrive();
		myCar.sedanDrive();
		myCar.suvDrive();

	}

}
