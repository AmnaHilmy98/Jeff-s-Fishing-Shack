package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StaffLogMenuController {
    @FXML
    public void mainMenu(ActionEvent event) throws Exception {

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

    public void viewCustomersWindow(ActionEvent event) {
        try {
            Parent viewCustomersWindow = FXMLLoader.load(getClass().getResource("../views/ViewCustomers.fxml"));
            Scene viewCustomersWindowScene = new Scene(viewCustomersWindow);
            Stage viewCustomersWindowWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            viewCustomersWindowWindow.setScene(viewCustomersWindowScene);
            viewCustomersWindowWindow.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewPurchasesWindow(ActionEvent event) {
        try {
            Parent viewPurchasesWindow = FXMLLoader.load(getClass().getResource("../views/ViewPurchases.fxml"));
            Scene viewPurchasesWindowScene = new Scene(viewPurchasesWindow);
            Stage viewPurchasesWindowWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            viewPurchasesWindowWindow.setScene(viewPurchasesWindowScene);
            viewPurchasesWindowWindow.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewProductsWindow(ActionEvent event) {
        try {
            Parent viewProductsWindow = FXMLLoader.load(getClass().getResource("../views/ViewProducts.fxml"));
            Scene viewProductsWindowScene = new Scene(viewProductsWindow);
            Stage viewProductsWindowWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            viewProductsWindowWindow.setScene(viewProductsWindowScene);
            viewProductsWindowWindow.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
