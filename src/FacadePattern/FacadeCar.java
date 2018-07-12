package FacadePattern;

public class FacadeCar {
	private HachBack hbc;
	private Sedan sedan;
	private Suv suv;
	public FacadeCar() {
		this.hbc = new HachBack();
		this.sedan = new Sedan();
		this.suv = new Suv();
	}
	
	public void hachBackDrive(){
		hbc.drive();
	}
	public void sedanDrive(){
		sedan.drive();
	}
	public void suvDrive(){
		suv.drive();
	}
	
	
	

}
