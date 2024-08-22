package com.example.studentmanagementsyst;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField idField;

    @FXML
    private ListView<Student> studentListView;

    @FXML
    private Button addButton;

    @FXML
    private ComboBox<String> presenceComboBox;

    private ObservableList<Student> studentList;

    @FXML
    public void initialize() {
        studentList = FXCollections.observableArrayList();
        studentListView.setItems(studentList);

        presenceComboBox.setItems(FXCollections.observableArrayList("Prezent", "Absent"));
        presenceComboBox.getSelectionModel().selectFirst();
    }

    @FXML
    public void handleAddStudent() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String id = idField.getText();
        String presence = presenceComboBox.getValue(); 

        if (!firstName.isEmpty() && !lastName.isEmpty() && !id.isEmpty()) {
            Student student = new Student(firstName, lastName, id, presence); 
            studentList.add(student);
            clearFields();
        }
    }

    @FXML
    public void handleRemoveStudent() {
        Student selectedStudent = studentListView.getSelectionModel().getSelectedItem();
        if (selectedStudent != null) {
            studentList.remove(selectedStudent);
        }
    }

    private void clearFields() {
        firstNameField.clear();
        lastNameField.clear();
        idField.clear();
        presenceComboBox.getSelectionModel().selectFirst(); 
    }
}
