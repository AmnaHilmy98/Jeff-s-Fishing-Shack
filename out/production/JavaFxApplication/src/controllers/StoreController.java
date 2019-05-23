package controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import services.EmailService;


import java.text.DecimalFormat;
import java.util.Optional;


public class StoreController {


    @FXML public TextField rodNo;
    @FXML public TextField reelNo;
    @FXML public TextField hookNo;
    @FXML public TextField fishingLineNo;
    @FXML public TextField swivelNo;
    @FXML public TextField sinkerNo;

    @FXML public RadioButton fishingLine100;
    @FXML public RadioButton fishingLine200;
    @FXML public RadioButton fishingLine300;
    @FXML public RadioButton swivelSmall;
    @FXML public RadioButton swivelMedium;
    @FXML public RadioButton swivelLarge;
    @FXML public RadioButton sinker8;
    @FXML public RadioButton sinker16;
    @FXML public RadioButton sinker24;

    public Label totalBill;

    private double fishingLinePrice;
    private double swivelPrice;
    private double sinkerPrice;
    private double total;

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
    private void checkTotal (ActionEvent event) {

        if (fishingLine100.isSelected()) {
            fishingLinePrice = (double) 500;
        } else if (fishingLine200.isSelected()) {
            fishingLinePrice = (double) 1500;
        } else if (fishingLine300.isSelected()) {
            fishingLinePrice = (double) 2000;
        }

        if (swivelSmall.isSelected()) {
            swivelPrice = (double) 500;
        } else if (swivelMedium.isSelected()) {
            swivelPrice = (double) 1500;
        } else if (swivelLarge.isSelected()) {
            swivelPrice = (double) 2000;
        }

        if (sinker8.isSelected()) {
            sinkerPrice = (double) 500;
        } else if (sinker16.isSelected()) {
            sinkerPrice = (double) 1500;
        } else if (sinker24.isSelected()) {
            sinkerPrice = (double) 2000;
        }

        double rodPrice = 1500;
        double rodSubTotal = Double.parseDouble(rodNo.getText()) * rodPrice;
        double reelPrice = 800;
        double reelSubTotal = Double.parseDouble(reelNo.getText()) * reelPrice;
        double hookPrice = 500;
        double hookSubTotal = Double.parseDouble(hookNo.getText()) * hookPrice;
        double fishingLineSubTotal = Double.parseDouble(fishingLineNo.getText()) * fishingLinePrice;
        double swivelSubTotal = Double.parseDouble(swivelNo.getText()) * swivelPrice;
        double sinkerSubTotal = Double.parseDouble(sinkerNo.getText()) * sinkerPrice;

        total = rodSubTotal + reelSubTotal + hookSubTotal + fishingLineSubTotal + swivelSubTotal + sinkerSubTotal;

        totalBill.setText(Double.toString(total));
    }

        @FXML
        private void purchase (ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Purchase");
        alert.setHeaderText("Total is " + new DecimalFormat("#,###.00").format(total) + "");
        alert.setContentText("Are you sure you want to proceed?");

        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK){

            EmailService emailService = new EmailService();
            emailService.sendEmail();

            System.out.println("Confirmed");
        }/* else {
            // ... user chose CANCEL or closed the dialog
        }*/


    }

}
