package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int custId;
	private String custName;
	private List<Customer> customer;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.customer=new ArrayList<Customer>();
		
		
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", customer=" + customer + "]";
	}
	
	public void addReferences(Customer custm){
		this.customer.add(custm);
	}
	
	public void removeReferences(Customer custm){
		this.customer.remove(custm);
	}
	
	
	
}
