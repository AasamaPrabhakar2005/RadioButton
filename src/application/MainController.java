package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class MainController {
	@FXML
	RadioButton rb1;
	@FXML
	RadioButton rb2;
	@FXML
	Button btn1;
	@FXML
	Button btn2;
	@FXML
	Label lbl;

	public void radioSelect(ActionEvent e) {
		String message = "";
		if (rb1.isSelected()) {
			message += rb1.getText();
		}
		if (rb2.isSelected()) {
			message += rb2.getText();
		}
		lbl.setText(message);
	}

	public void maleClicked(ActionEvent e) {
		//System.out.println("Maleselect");
		String message = "";
		if (rb1.isSelected() == false) {
			rb1.setSelected(true);
			message += rb1.getText();
			lbl.setText(message);
		}
	}

	public void femaleClicked(ActionEvent e) {
		//System.out.println("femaleselect");
		String message = "";
		if (rb2.isSelected() == false) {
			rb2.setSelected(true);
			message += rb2.getText();
			lbl.setText(message);
		}
	}
}
