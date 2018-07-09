package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SteamClass {
	//JDK 1.7
	
		public 	List<PriorityCustomer> getPriority(List<Customer> cus){
			List<PriorityCustomer> ls=new ArrayList<PriorityCustomer>();
			for(Customer cs:cus){
				if(cs.getCustomerPurchases()>2000){
					ls.add(new PriorityCustomer(cs.getCustomerId(),cs.getCustomerName(),"Gold"));
				}
			}
			return ls;
			
		}

		public static 	List<PriorityCustomer> getPriority1(List<Customer> cus){
			List<PriorityCustomer> ls=cus.stream().map(temp->{
				if(temp.getCustomerPurchases()>2000){
					return new PriorityCustomer(temp.getCustomerId(),temp.getCustomerName(),"Gold");
				}
				return null;
			}).collect(Collectors.toList());
			
			return ls;
			
			
		}
		
		
		public static 	List<PriorityCustomer> getPriority2(List<Customer> cus){
			
			return cus.stream().filter(temp->(temp.getCustomerPurchases()>2000)).map(temp->{
				return new PriorityCustomer(temp.getCustomerId(),temp.getCustomerName(),"Gold");
			
			
		}).collect(Collectors.toList());
			
		}
		
		public static 	List<PriorityCustomer> getPriority3(List<Customer> cus){
			List<PriorityCustomer> ls=cus.stream().map(temp->{
				return new PriorityCustomer(temp.getCustomerId(),temp.getCustomerName(),
						temp.getCustomerPurchases()<1900? "silver":
							temp.getCustomerPurchases()>2000 &&
							temp.getCustomerPurchases()<5000?"gold":"platinum");
				
						
			}).collect(Collectors.toList());
			return ls;
		}
		
		
	public static void main(String[] args) {
		List<Customer> cus=new ArrayList<Customer>();
		cus.add(new Customer(23,"raj",234.66,"se"));
		cus.add(new Customer(25,"ram",236.66,"ba"));
		cus.add(new Customer(27,"saj",2367,"se"));
		cus.add(new Customer(21,"baj",2344,"sd"));
		cus.add(new Customer(29,"laj",6000,"sd"));
		getPriority1(cus).forEach(System.out::println);
		System.out.println("---------------------------------");
		getPriority2(cus).forEach(System.out::println);
		System.out.println("---------------------------------");
		getPriority3(cus).forEach(System.out::println);
		
	}

}
