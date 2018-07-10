package day22;

public interface IDepartment {
	public void workLocation();
	
	default void noOfHours(){
		System.out.println("work for 8 hrs");
		
	}
	
	public static void commonUtility(){
		System.out.println("all will have bg");
	}

}
