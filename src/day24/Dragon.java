package day24;

public class Dragon {
	private String name;
	private String country;
	private int count;
	
	
	@Override
	public String toString() {
		return "Dragon [name=" + name + ", country=" + country + ", count=" + count + "]";
	}
	public Dragon(String name, String country, int count) {
		super();
		this.name = name;
		this.country = country;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	

}
