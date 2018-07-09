package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaSort {

	public static void main(String[] args) {
		List<Customer> cus=new ArrayList<Customer>();
		cus.add(new Customer(23,"raj",234.66,"se"));
		cus.add(new Customer(25,"ram",236.66,"ba"));
		cus.add(new Customer(27,"saj",2367,"se"));
		cus.add(new Customer(21,"baj",2344,"sd"));
		cus.add(new Customer(29,"laj",6000,"sd"));
		
		cus.forEach(System.out::println);
		System.out.println("------------------------------------------------------");
		Collections.sort(cus,new Comparator<Customer>(){
			public int compare(Customer o1,Customer o2){
				return o1.getCustomerName().compareTo(o2.getCustomerName());
				
			}
		});
		cus.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------");
		
		cus.sort((Customer c1,Customer c2)->(int)(c1.getCustomerPurchases()-c2.getCustomerPurchases() ));
		cus.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------");
		
		cus.sort((Customer c1,Customer c2)->c1.getCustomerName().compareTo(c2.getCustomerName()));
		cus.forEach(System.out::println);
		
		Comparator<Customer> CusNmae=(c1,c2)->c1.getCustomerName().compareTo(c2.getCustomerName());
		Collections.sort(cus,CusNmae);
		
		cus.sort(CusNmae.reversed());
		
	}

}
