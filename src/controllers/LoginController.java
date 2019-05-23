package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.User.User;
import services.AuthenticationService;

import static controllers.HomePageController.dialog;
import static controllers.HomePageController.dialogStage;
import static controllers.HomePageController.loggedInUser;

public class LoginController {

    @FXML
    private TextField userName;
    @FXML
    private PasswordField userPassword;

    @FXML
    public void mainMenu(ActionEvent event) throws Exception {

            Parent mainMenu = FXMLLoader.load(getClass().getResource("../views/HomePage.fxml"));
            Scene mainMenuScene = new Scene(mainMenu);
            Stage mainMenuWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            mainMenuWindow.setScene(mainMenuScene);
            mainMenuWindow.show();

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
    private void auth(ActionEvent event) throws Exception {
        AuthenticationService auth = new AuthenticationService();
        loggedInUser = auth.login(new User(userName.getText(), userPassword.getText()));

        if (loggedInUser != null) {

            if(loggedInUser.getType().equals("admin")){
                dialog("Success", "Login Successful");
                Node node = (Node) event.getSource();
                dialogStage = (Stage) node.getScene().getWindow();
                dialogStage.close();
                Scene scene = new Scene((Parent) FXMLLoader.load(getClass().getResource("../views/AdminLogMenu.fxml")));

                dialogStage.setScene(scene);
                dialogStage.show();

            }
            else if(loggedInUser.getType().equals("customer")){
                dialog("Success", "Login Successful");
                Node node = (Node) event.getSource();
                dialogStage = (Stage) node.getScene().getWindow();
                dialogStage.close();
                Scene scene = new Scene((Parent) FXMLLoader.load(getClass().getResource("../views/LogMenu.fxml")));

                dialogStage.setScene(scene);
                dialogStage.show();

            }
            else if(loggedInUser.getType().equals("staff")){
                dialog("Success", "Login Successful");
                Node node = (Node) event.getSource();
                dialogStage = (Stage) node.getScene().getWindow();
                dialogStage.close();
                Scene scene = new Scene((Parent) FXMLLoader.load(getClass().getResource("../views/StaffLogMenu.fxml")));

                dialogStage.setScene(scene);
                dialogStage.show();

            }




        } else {
            dialog("Failed", "Please enter correct Username and Password");
        }
    }

    @FXML
    private void register(ActionEvent event) throws Exception {

        Parent register = FXMLLoader.load(getClass().getResource("../views/Registration.fxml"));
        Scene registerScene = new Scene(register);
        Stage registerWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        registerWindow.setScene(registerScene);
        registerWindow.show();

    }
}
