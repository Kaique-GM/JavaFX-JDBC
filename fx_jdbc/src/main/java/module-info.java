module com.javafx_jdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;

    opens com.javafx_jdbc.GUI to javafx.fxml;
    opens com.javafx_jdbc.model.entities to javafx.base;

    opens com.javafx_jdbc to javafx.fxml;

    exports com.javafx_jdbc;
}
