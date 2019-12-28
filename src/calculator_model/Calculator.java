package calculator_model;

import util.Observable;

public class Calculator extends Observable {
	public int number;
	
	public void add(int n) {
		this.number += n;
		this.notifyObservers();
	}
	
	public void subtract(int n) {
		this.number -= n;
		this.notifyObservers();
	}
	
	public void divide(int n) {
		this.number /= n;
		this.notifyObservers();
	}
	
	public void multiply(int n) {
		this.number *= n;
		this.notifyObservers();
	}
}
