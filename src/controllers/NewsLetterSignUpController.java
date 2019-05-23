package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import services.EmailService;

import static controllers.HomePageController.dialog;
import static controllers.HomePageController.dialogStage;

public class NewsLetterSignUpController {

    @FXML private TextField newsLetterEmail;

    @FXML
    public void mainMenu(ActionEvent event) throws Exception {

            Parent mainMenu = FXMLLoader.load(getClass().getResource("../views/HomePage.fxml"));
            Scene mainMenuScene = new Scene(mainMenu);
            Stage mainMenuWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            mainMenuWindow.setScene(mainMenuScene);
            mainMenuWindow.show();

    }

    @FXML
    public void newsLetterRegister(ActionEvent event) {
        EmailService emailService = new EmailService();

            int rowsAffected = emailService.sendMonthlyNewsLetter(newsLetterEmail.getText());

            if (rowsAffected != 0) {
                dialog("Success", "Thank you for registering for the monthly newsletter service");
                Node node = (Node) event.getSource();
                dialogStage = (Stage) node.getScene().getWindow();
                dialogStage.close();
            }

    }
}
