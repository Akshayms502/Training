package day22;

public interface IEmployee {
	public void salary();
	
	default void noOfHours(){
		System.out.println("every emp work for 10hrs");
	}

}
