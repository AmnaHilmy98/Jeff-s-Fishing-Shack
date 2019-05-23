package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LogMenuController {

    @FXML
    public void mainMenu(ActionEvent event) throws Exception {

        Parent mainMenu = FXMLLoader.load(getClass().getResource("../views/HomePage.fxml"));
        Scene mainMenuScene = new Scene(mainMenu);
        Stage mainMenuWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mainMenuWindow.setScene(mainMenuScene);
        mainMenuWindow.show();

    }

    @FXML
    private void updateInfoWindow(ActionEvent event) throws Exception {

            Parent updateInfoWindow = FXMLLoader.load(getClass().getResource("../views/UpdateInfo.fxml"));
            Scene updateInfoWindowScene = new Scene(updateInfoWindow);
            Stage updateInfoWindowWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            updateInfoWindowWindow.setScene(updateInfoWindowScene);
            updateInfoWindowWindow.show();

    }

    @FXML
    private void purchaseWindow(ActionEvent event) throws Exception {

            Parent purchaseWindow = FXMLLoader.load(getClass().getResource("../views/Store.fxml"));
            Scene purchaseWindowScene = new Scene(purchaseWindow);
            Stage purchaseWindowWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            purchaseWindowWindow.setScene(purchaseWindowScene);
            purchaseWindowWindow.show();

    }
}
