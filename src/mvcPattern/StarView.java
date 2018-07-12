package mvcPattern;

public class StarView {

	public  void printEmployee(Employe emp) {
		System.out.println("***********************************************");
		System.out.println(" employee id"+emp.getEmpId());
		System.out.println("employee name"+emp.getEmpName());
		System.out.println("***********************************************");
	}

}
