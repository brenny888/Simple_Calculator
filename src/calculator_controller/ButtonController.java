package calculator_controller;

import calculator_model.Calculator;
import calculator_view.Screen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ButtonController implements EventHandler<ActionEvent> {
	
	Calculator calculator;
	Screen screen;
	
	public ButtonController(Calculator calculator, Screen screen) {
		this.calculator = calculator;
		this.screen = screen;
	}

	@Override
	public void handle(ActionEvent e) {
		Button source = (Button)e.getSource();
		String text = source.getText();
		
		if (text == "+") {
			this.calculator.setNumber(Double.valueOf(screen.getText()));
			this.calculator.setOperation('+');
			this.screen.setText("");
			this.screen.requestFocus();
		}
		
		if (text == "-") {
			this.calculator.setNumber(Double.valueOf(screen.getText()));
			this.calculator.setOperation('-');
			this.screen.setText("");
			this.screen.requestFocus();
		}
		
		if (text == "/") {
			this.calculator.setNumber(Double.valueOf(screen.getText()));
			this.calculator.setOperation('/');
			this.screen.setText("");
			this.screen.requestFocus();
		}
		
		if (text == "x") {
			this.calculator.setNumber(Double.valueOf(screen.getText()));
			this.calculator.setOperation('x');
			this.screen.setText("");
			this.screen.requestFocus();
		}
		
		if (text == "=") {
			this.calculator.evaluate(Double.valueOf(screen.getText()));
			this.screen.requestFocus();
		}
	}

}
