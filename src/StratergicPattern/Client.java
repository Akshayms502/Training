package StratergicPattern;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {
		List<Item> items= Stream.of(
				new Item("IT-01-PEN",30,3),
				new Item("IT-01-Paper",30,3),
				new Item("IT-01-book",30,3),
				new Item("IT-01-bottle",30,3),
				new Item("IT-01-Pendrive",30,3),
				new Item("IT-01-watch",30,3),
				new Item("IT-01-bike",30,3)).collect(Collectors.toList());
		
		ShoppingCart shoppingCart=new ShoppingCart();
	//	shoppingCart.addItem(new Item("IT-01-PEN",30,3));
	//	shoppingCart.addItem(new Item("IT-01-Paper",30,3));
	//	shoppingCart.addItem(new Item("IT-01-bottle",30,3));
	//	shoppingCart.addItem(new Item("IT-01-watch",30,3));
	//	System.out.println("total amount"+shoppingCart.calculateTotal());
	//	Payment paymentStratergy=new Ewallet("akshay@gmail.com","1234","name");
	//	shoppingCart.checkout(paymentStratergy);
				
		
		shoppingCart.addItem(items);
		System.out.println("total amount"+shoppingCart.calculateTotal());
		Payment paymentStratergy=new Ewallet("akshay@gmail.com","1234","paytm");
		shoppingCart.checkout(paymentStratergy);
		
				
		

	}

}
