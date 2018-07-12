package StratergicPattern;

public class Ewallet implements Payment{
	
	private String email;
	private String password;
	private String walletName;
	
	
	

	




	public Ewallet(String email, String password, String walletName) {
		super();
		this.email = email;
		this.password = password;
		this.walletName = walletName;
	}




	@Override
	public String toString() {
		return "Ewallet [email=" + email + ", password=" + password + ", wallletName=" + walletName + "]";
	}




	@Override
	public void pay(int amount) {
		if(this.walletName.equalsIgnoreCase("paytm")){
			amount=(int) (amount-(amount*0.1));
			System.out.println("you are paying through paytm "+amount);
		}else{
			System.out.println("amount paid"+amount);
		}
		
	}

}
