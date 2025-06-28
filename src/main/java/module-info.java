module com.ijse.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ijse.test to javafx.fxml;
    exports com.ijse.test;
}