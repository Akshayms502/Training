package SingletonPatternDay3;


class Company{
	private Company(){
		System.out.println("callled");
	}
	public static Company getInstance(Company com){
		if(com==null){
			return new Company();
		}
		return com;
	}
	
}

class Emp{
	int empId;
	String empName;
	Company company;
}

public class SingleClient1 {
	
	public static void main(String[] args){
		Company company=null;
		
		company=Company.getInstance(company);
		Emp emp1=new Emp();
		emp1.empId=10;
		emp1.empName="ankit";
		emp1.company=company;
		System.out.println(emp1.company.hashCode());
		
		Emp emp2=new Emp();
		emp2.empId=10;
		emp2.empName="ankit";
		emp2.company=company;
		System.out.println(emp2.company.hashCode());
	}
	

}
