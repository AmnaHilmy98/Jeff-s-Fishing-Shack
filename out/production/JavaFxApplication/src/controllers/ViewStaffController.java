package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewStaffController {
    @FXML
    public void mainMenu(ActionEvent event) throws Exception {

        try {
            Parent login = FXMLLoader.load(getClass().getResource("../views/HomePage.fxml"));
            Scene loginScene = new Scene(login);
            Stage loginWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginWindow.setScene(loginScene);
            loginWindow.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
