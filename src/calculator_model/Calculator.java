package calculator_model;

import util.Observable;

public class Calculator extends Observable {
	public double number;
	
	public void add(double n) {
		this.number += n;
		this.notifyObservers();
	}
	
	public void subtract(double n) {
		this.number -= n;
		this.notifyObservers();
	}
	
	public void divide(double n) {
		this.number /= n;
		this.notifyObservers();
	}
	
	public void multiply(double n) {
		this.number *= n;
		this.notifyObservers();
	}
	
	public String toString() {
		return String.valueOf(this.number);
	}
}
