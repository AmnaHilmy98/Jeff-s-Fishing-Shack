package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static controllers.HomePageController.dialog;
import static controllers.HomePageController.dialogStage;
import static controllers.HomePageController.loggedInUser;

public class UpdatePasswordController {

    @FXML
    private TextField newPassword;


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
    private void updatePassword(ActionEvent event) throws Exception { //is this the same as update password?

        try {

            int rowsAffected = loggedInUser.updatePassword(newPassword.getText());;

            if (rowsAffected != 0) {
                dialog("Success", "Password update was successful");
                Node node = (Node) event.getSource();
                dialogStage = (Stage) node.getScene().getWindow();
                dialogStage.close();
                Scene scene = new Scene((Parent) FXMLLoader.load(getClass().getResource("../views/LogMenu.fxml")));

                dialogStage.setScene(scene);
                dialogStage.show();

            }

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
