package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UpdateInfoController {
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

    @FXML
    public void openUpdateEmailWindow(ActionEvent event) {

        try {
            Parent login = FXMLLoader.load(getClass().getResource("../views/UpdateEmail.fxml"));
            Scene loginScene = new Scene(login);
            Stage loginWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginWindow.setScene(loginScene);
            loginWindow.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void updatePasswordWindow(ActionEvent event) {

        try {
            Parent login = FXMLLoader.load(getClass().getResource("../views/UpdatePassword.fxml"));
            Scene loginScene = new Scene(login);
            Stage loginWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginWindow.setScene(loginScene);
            loginWindow.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void updateAddressWindow(ActionEvent event) {

        try {
            Parent login = FXMLLoader.load(getClass().getResource("../views/UpdateAddress.fxml"));
            Scene loginScene = new Scene(login);
            Stage loginWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginWindow.setScene(loginScene);
            loginWindow.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
