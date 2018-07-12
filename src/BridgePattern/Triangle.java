package BridgePattern;

public class Triangle extends Shape{

	public Triangle(IColor color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	public void applyColor(){
		System.out.println("painting color"+getColor());
		getColor().applyColor();
	}

	
}
