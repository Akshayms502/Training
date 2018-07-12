package ObserverPattern;

import java.util.Observer;

public interface IObservable {
	public void addUser(IObserver observer);
	public void remove(IObserver observer);
	
	public void notifyObserver();

}
