package calculator_view;

import util.Observable;
import util.Observer;
import calculator_model.Calculator;
import javafx.scene.control.TextField;;

public class Screen extends TextField implements Observer{

	@Override
	public void update(Observable o) {
		this.setText(((Calculator)o).toString());
	}
	
	
}
