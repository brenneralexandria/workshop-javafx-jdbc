package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	public static Stage currentStage(ActionEvent event) {
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}
	
	public static Integer TryParseToInt(String stc) {
		try {
		return Integer.parseInt(stc);
	}
		catch (NumberFormatException e) {
			return null;
		}
	}
}