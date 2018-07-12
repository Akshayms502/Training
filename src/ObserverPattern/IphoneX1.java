package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class IphoneX1 implements IObservable {

	private List<IObserver> user;
	private boolean isArrived=true;
	
	public IphoneX1(){
		user=new ArrayList<IObserver>();
	}

	@Override
	public void addUser(IObserver observer) {
		user.add(observer);
		
	}

	@Override
	public void remove(IObserver observer) {
		user.remove(observer);
		
	}

	@Override
	public void notifyObserver() {
		for(IObserver temp:user){
			temp.update();
		}
		
	}
	public boolean isArrived(){
		return isArrived;
	}
	
	public void setArrived(boolean isArrived){
		this.isArrived=isArrived;
		notifyObserver();
	}

}
