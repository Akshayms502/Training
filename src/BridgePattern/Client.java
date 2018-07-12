package BridgePattern;

public class Client {

	public static void main(String[] args) {
		Shape triangle=new Triangle(new Red());
		triangle.applyColor();
		
		Shape pentagon=new Pentagon(new Blue());
		pentagon.applyColor();

	}

}
