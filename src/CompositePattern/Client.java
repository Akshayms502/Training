package CompositePattern;

public class Client {

	public static void main(String[] args) {
		Customer cus1=new Customer(101,"sam");
		Customer cus2=new Customer(102,"ram");
		Customer cus3=new Customer(103,"bam");
		Customer cus4=new Customer(104,"nam");
		Customer cus5=new Customer(105,"mam");
		Customer cus6=new Customer(106,"cam");
		
		Customer cus7=new Customer(107,"vam");
		Customer cus8=new Customer(108,"pam");
		Customer cus9=new Customer(109,"qam");
		
		cus1.addReferences(cus2);
		cus1.addReferences(cus3);
		cus1.addReferences(cus4);
		
		cus2.addReferences(cus5);
		cus2.addReferences(cus6);
		cus2.addReferences(cus7);
		
		cus4.addReferences(cus8);
		cus4.addReferences(cus9);
		
		for(Customer temp:cus1.getCustomer()){
			System.out.println(temp.getCustId()+","+temp.getCustName());
		}
		
	}

}
