package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.User.User;
import services.AuthenticationService;

import java.io.IOException;

import static controllers.HomePageController.dialog;

public class RegistrationController {

    @FXML
    private PasswordField password;
    @FXML
    private TextField name;
    @FXML
    private TextField email;
    @FXML
    private TextArea address;

    private Stage dialogStage = new Stage();
    private Scene scene;

    @FXML
    public void mainMenu(ActionEvent event){

        try {
            Parent mainMenu = FXMLLoader.load(getClass().getResource("../views/HomePage.fxml"));
            Scene mainMenuScene = new Scene(mainMenu);
            Stage mainMenuWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            mainMenuWindow.setScene(mainMenuScene);
            mainMenuWindow.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void newCustomer(ActionEvent event) {

        AuthenticationService auth = new AuthenticationService();
        User registeredUser = auth.register(new User(name.getText(), email.getText(), password.getText(), address.getText()));

        try {
            if (registeredUser != null) {
                Node node = (Node) event.getSource();
                dialogStage = (Stage) node.getScene().getWindow();
                dialogStage.close();
                scene = new Scene((Parent) FXMLLoader.load(getClass().getResource("../views/Login.fxml")));

                dialogStage.setScene(scene);

                dialogStage.show();
            } else {
                dialog("Failed", "Please enter a password with a minimum of 8 characters with at least two non-alphabetic (i.e., not A-Z) characters");
            }

            //connection1.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @FXML
    public void loginWindow(ActionEvent event) {

        try {
            Parent loginWindow = FXMLLoader.load(getClass().getResource("../views/Login.fxml"));
            Scene loginWindowScene = new Scene(loginWindow);
            Stage loginWindowWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginWindowWindow.setScene(loginWindowScene);
            loginWindowWindow.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
