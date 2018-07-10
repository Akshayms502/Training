package day23;

public class Person {
	
	private int pid;
	private String name;
	private int salary;
	
	
	
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", salary=" + salary + "]";
	}
	public Person(int pid, String name, int salary) {
		super();
		this.pid = pid;
		this.name = name;
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
