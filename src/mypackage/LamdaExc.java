package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaExc{
public static void main (String[] args){
	List<Customer> cus=new ArrayList<Customer>();
	cus.add(new Customer(23,"raj",234.66,"se"));
	cus.add(new Customer(25,"ram",236.66,"ba"));
	cus.add(new Customer(27,"saj",2367,"se"));
	cus.add(new Customer(27,"saj",256,"se"));
	cus.add(new Customer(21,"baj",2344,"sd"));
	cus.add(new Customer(29,"laj",6000,"sd"));


Comparator<Customer> c=Comparator.comparing(Customer::getCustomerName).thenComparing(Customer::getCustomerPurchases);
Collections.sort(cus,c);
cus.forEach(System.out::println);
}
}
