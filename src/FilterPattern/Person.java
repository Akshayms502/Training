package FilterPattern;

public class Person {
	private String name;
	private String sex;
	private String maritalStatus;
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getSex() {
		return sex;
	}
	protected void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	protected String getMaritalStatus() {
		return maritalStatus;
	}
	protected void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public Person(String name, String sex, String maritalStatus) {
		super();
		this.name = name;
		this.sex = sex;
		this.maritalStatus = maritalStatus;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", maritalStatus=" + maritalStatus + "]";
	}
	
	

}
