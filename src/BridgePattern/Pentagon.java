package BridgePattern;

public class Pentagon extends Shape{

	public Pentagon(IColor color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void applyColor() {
		System.out.println("applying color"+getColor());
		getColor().applyColor();
	}
	
	

}
