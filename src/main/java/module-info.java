module com.example.studentmanagementsyst {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentmanagementsyst to javafx.fxml;
    exports com.example.studentmanagementsyst;
}