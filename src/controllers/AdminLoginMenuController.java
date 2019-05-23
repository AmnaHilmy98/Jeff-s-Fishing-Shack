package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminLoginMenuController {

    @FXML
    public void mainMenu(ActionEvent event) throws Exception {

            Parent mainMenu = FXMLLoader.load(getClass().getResource("../views/HomePage.fxml"));
            Scene mainMenuScene = new Scene(mainMenu);
            Stage mainMenuWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            mainMenuWindow.setScene(mainMenuScene);
            mainMenuWindow.show();

    }

    public void viewCustomersWindow(ActionEvent event) throws Exception{

            Parent viewCustomers = FXMLLoader.load(getClass().getResource("../views/ViewCustomers.fxml"));
            Scene viewCustomersScene = new Scene(viewCustomers);
            Stage viewCustomersWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            viewCustomersWindow.setScene(viewCustomersScene);
            viewCustomersWindow.show();

    }

    public void viewStaffWindow(ActionEvent event) throws Exception{

            Parent viewStaff = FXMLLoader.load(getClass().getResource("../views/ViewStaff.fxml"));
            Scene viewStaffScene = new Scene(viewStaff);
            Stage viewStaffWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            viewStaffWindow.setScene(viewStaffScene);
            viewStaffWindow.show();

    }

    public void viewProductsWindow(ActionEvent event) throws Exception{

            Parent viewProducts = FXMLLoader.load(getClass().getResource("../views/ViewProducts.fxml"));
            Scene viewProductsScene = new Scene(viewProducts);
            Stage viewProductsWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            viewProductsWindow.setScene(viewProductsScene);
            viewProductsWindow.show();

    }

    public void viewPurchasesWindow(ActionEvent event) throws Exception{

            Parent viewPurchases = FXMLLoader.load(getClass().getResource("../views/ViewPurchases.fxml"));
            Scene viewPurchasesScene = new Scene(viewPurchases);
            Stage viewPurchasesWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            viewPurchasesWindow.setScene(viewPurchasesScene);
            viewPurchasesWindow.show();

    }
}
