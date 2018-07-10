package day22;

public class ExilantEmployee implements IEmployee ,IDepartment{

	@Override
	public void salary() {
		System.out.println("salary is decided by exp");
		
	}
	
	public void noOfHours(){
		IDepartment.super.noOfHours();
	}
	
	@Override
	public void workLocation() {
		System.out.println("work location");
		
	}

}
