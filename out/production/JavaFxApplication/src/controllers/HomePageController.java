package controllers;

import model.User.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class HomePageController {

    public static User loggedInUser;

    public static Stage dialogStage = new Stage();
    public static Scene scene;

    @FXML
    public void mainMenu(ActionEvent event) throws Exception{

            Parent mainMenu = FXMLLoader.load(getClass().getResource("../views/HomePage.fxml"));
            Scene mainMenuScene = new Scene(mainMenu);
            Stage mainMenuWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            mainMenuWindow.setScene(mainMenuScene);
            mainMenuWindow.show();

    }

    @FXML
    private void register(ActionEvent event) throws Exception {

        Parent register = FXMLLoader.load(getClass().getResource("../views/Registration.fxml"));
        Scene registerScene = new Scene(register);
        Stage registerWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        registerWindow.setScene(registerScene);
        registerWindow.show();

    }

    @FXML
    public void loginWindow(ActionEvent event) throws Exception{

            Parent loginWindow = FXMLLoader.load(getClass().getResource("../views/Login.fxml"));
            Scene loginWindowScene = new Scene(loginWindow);
            Stage loginWindowWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginWindowWindow.setScene(loginWindowScene);
            loginWindowWindow.show();

    }

    @FXML
    private void newsletterSignUpWindow(ActionEvent event) throws Exception {

        Parent newsletterSignUp = FXMLLoader.load(getClass().getResource("../views/NewsletterSignUp.fxml"));
        Scene newsletterScene = new Scene(newsletterSignUp);
        Stage newsletterWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        newsletterWindow.setScene(newsletterScene);
        newsletterWindow.show();

    }



    public static void dialog(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }


}
