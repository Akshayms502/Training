package mvcPattern;

public class Client {

	public static void main(String[] args) {
		Employe model=new Employe(101,"ram");
		StarView view=new StarView();
		EmployeeController con=new EmployeeController(model,view);
		con.updateView("star");
		
		
				

	}
	

}
