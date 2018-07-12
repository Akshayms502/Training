package StratergicPattern;

public class CreditCard implements Payment{
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateExpiry;
	private double discount;
	private String bankName;
	

	
	
	
	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", cardNumber=" + cardNumber + ", cvv=" + cvv + ", dateExpiry=" + dateExpiry
				+ ", discount=" + discount + ", bankName=" + bankName + "]";
	}





	public CreditCard(String name, String cardNumber, String cvv, String dateExpiry, double discount, String bankName) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateExpiry = dateExpiry;
		this.discount = discount;
		this.bankName = bankName;
	}





	@Override
	public void pay(int amount) {
		if(this.bankName.equalsIgnoreCase("hdfc")){
			amount=(int) (amount-(amount*0.1));
			System.out.println("paying with hdfc and got discount"+amount);
		}else{
			System.out.println("paid amount of "+amount);
		}
		
	}

}
