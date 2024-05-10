package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.scene.control.PasswordField;

public class MainSceneController {
	@FXML
    private Button login_btn;

    @FXML
    private PasswordField pw;

    @FXML
    private TextField uname;

	// Event Listener on Button[#login_btn].onAction
	@FXML
	public void loginBtnClicked(ActionEvent event) throws IOException {
		
		Alert alert  = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Alert !");
		
		
		if(uname.getText().isEmpty() && pw.getText().isEmpty()) {
			alert.setContentText("Please enter the Username and Password");
			alert.showAndWait();
		}else if(uname.getText().isEmpty()) {
			alert.setContentText("Please enter the Username");
			alert.showAndWait();
		}else if(pw.getText().isEmpty()) {
			alert.setContentText("Please enter the Password");
			alert.showAndWait();
		}else if(uname.getText().equals("sanuja") && pw.getText().equals("123")) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondScene.fxml"));
	        Parent newRoot = loader.load();
	        Scene scene = new Scene(newRoot);
	        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Plane Management System");
	        primaryStage.show();
		}else {
			alert.setContentText("Incorrect Username or Password");
			alert.showAndWait();
		}
		
	}
}
