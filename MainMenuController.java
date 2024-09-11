package Controller;

import Model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainMenuController extends GeneralController {

    //<editor-fold defaultstate="collapsed" desc="ui-variables">
    
    @FXML
    private Button customersBtn;

    @FXML
    private Button logoutBtn;

    @FXML
    private Button appointmentsBtn;
    
    @FXML
    private Button reportsBtn;
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="actions">
    
    @FXML
    void onActionDisplayCustomers(ActionEvent event) {
       displayScreen(event, "/View/ViewCustomerScreen.fxml");
    }

    @FXML
    void onActionDisplayAppointments(ActionEvent event) {
       displayScreen(event, "/View/CalendarScreen.fxml");
    }
    
    @FXML
    void onActionDisplayReports(ActionEvent event) {
        displayScreen(event, "/View/ReportScreen.fxml");
    }

    @FXML
    void onActionLogout(ActionEvent event) {
        User.setCurrentUser(null);
        displayScreen(event, "/View/LoginScreen.fxml");
    }
    
    //</editor-fold>
    
}
