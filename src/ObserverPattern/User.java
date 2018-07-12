package ObserverPattern;

public class User implements IObserver {
	
	private IObservable observable=null;
	private String name;
	private String ObservableName;
	
	
	public User(IObservable observable,String name,String ObservableName){
		this.observable=observable;
		this.name=name;
		this.ObservableName=ObservableName;
	}
	
	public void buyMobile(){
		System.out.println("hurry i have got"+ ObservableName +""+name);
	}
	
	
	@Override
	public void update() {
		buyMobile();
		
	}
	
	public void unSubcribe(){
		observable.remove(this);
	}

}
