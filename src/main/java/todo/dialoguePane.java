package todo;

import javax.management.timer.Timer;
import javax.swing.*;

import javafx.scene.control.DatePicker;

public class dialoguePane {
    public dialoguePane() {
        JTextField eventName = new JTextField();
        DatePicker datePicker = new DatePicker();

        Object[] message = {
                "Username:", eventName,
                "Date:", datePicker
        };

        int option = JOptionPane.showConfirmDialog(null, message, "ADD", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (eventName.getText().equals("h") && datePicker.getPromptText().equals("h")) {
                System.out.println("Login successful");
            } else {
                System.out.println("login failed");
            }
        } else {
            System.out.println("Login canceled");
        }
    }
}
