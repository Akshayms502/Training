package ObserverPattern;

public class Client {

	public static void main(String[] args) {
		IObservable observable=new OnePlus6T();
		IObserver user1=new User(observable,"kumar","oneplus");
		IObserver user2=new User(observable,"watt","oneplus");
		IObserver user3=new User(observable,"ramn","oneplus");
		IObserver user4=new User(observable,"sam","oneplus");
		
		
		observable.addUser(user1);
		observable.addUser(user2);
		observable.addUser(user3);
		observable.addUser(user4);
		
		((OnePlus6T) observable).setArrived(true);
		
		System.out.println("--------------------------------------");
		IObservable observable1=new IphoneX1();
		IObserver usr1=new User(observable1,"kumar","iphone");
		IObserver usr2=new User(observable1,"watt","iphone");
		IObserver usr3=new User(observable1,"ramn","iphone");
		IObserver usr4=new User(observable1,"sam","iphone");
		
		
		observable1.addUser(usr1);
		observable1.addUser(usr2);
		observable1.addUser(usr3);
		observable1.addUser(usr4);
		
		((IphoneX1) observable1).setArrived(true);
		
		
		
		
		

	}

}
