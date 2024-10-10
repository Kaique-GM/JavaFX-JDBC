module com.javafx_jdbc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.javafx_jdbc to javafx.fxml;
    exports com.javafx_jdbc;
}
