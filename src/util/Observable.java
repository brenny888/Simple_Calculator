package util;
import java.util.ArrayList;

public class Observable {
	public ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer o) {
		this.observers.add(o);
	}
	
	public void detach(Observer o) {
		this.observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(this);
		}
	}
}
