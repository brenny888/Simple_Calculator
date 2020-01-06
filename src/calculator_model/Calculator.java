package calculator_model;

import util.Observable;

public class Calculator extends Observable {
	private double number;
	private char operation;
	
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
	
	public void evaluate(double n) {
		if (this.operation == '+') {
			add(n);
		}
		
		if (this.operation == '-') {
			subtract(n);
		}
		
		if (this.operation == 'x') {
			multiply(n);
		}
		
		if (this.operation == '/') {
			divide(n);
		}
	}
	
	public void setNumber(double n) {
		this.number = n;
		notifyObservers();
	}
	
	public void setOperation(char op) {
		this.operation = op;
	}
	
	public String toString() {
		return String.valueOf(this.number);
	}
}
