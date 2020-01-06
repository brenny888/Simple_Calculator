package application;

import calculator_controller.ButtonController;
import calculator_model.Calculator;
import calculator_view.Screen;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorApplication extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		//MODEL
		Calculator calculator = new Calculator();
		
		//VIEW
		Screen screen = new Screen();
		calculator.attach(screen);
		
		//CONTROLLER
		ButtonController bc = new ButtonController(calculator, screen);
		
		//GUI
		GridPane calculatorUI = new GridPane();
		calculatorUI.setGridLinesVisible(true);
		
		Button addition = new Button();
		addition.setMinWidth(75);
		addition.setText("+");
		addition.setOnAction(bc);
		Button subtraction = new Button();
		subtraction.setMinWidth(75);
		subtraction.setText("-");
		subtraction.setOnAction(bc);
		Button multiplication = new Button();
		multiplication.setMinWidth(75);
		multiplication.setText("x");
		multiplication.setOnAction(bc);
		Button division = new Button();
		division.setMinWidth(75);
		division.setText("/");
		division.setOnAction(bc);
		Button evaluate = new Button();
		evaluate.setMinWidth(150);
		evaluate.setText("=");
		evaluate.setOnAction(bc);
		
		calculatorUI.add(screen, 0, 0);
		calculatorUI.add(addition, 0, 1);
		calculatorUI.add(subtraction, 1, 1);
		calculatorUI.add(multiplication, 0, 2);
		calculatorUI.add(division, 1, 2);
		calculatorUI.add(evaluate, 0, 3);
		
		GridPane.setColumnSpan(screen, GridPane.REMAINING);
		GridPane.setColumnSpan(evaluate, GridPane.REMAINING);
		
		Scene scene = new Scene(calculatorUI);
		stage.setMinHeight(135);
		stage.setMinWidth(150);
		stage.setTitle("Calculator");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
