module com.ijse.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.ijse.test to javafx.fxml;
    exports com.ijse.test;
}