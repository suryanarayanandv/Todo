package todo;

import java.awt.Color;
import java.awt.Dimension;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.management.timer.Timer;
import javax.swing.*;
import javax.swing.border.Border;
import javafx.util.Builder;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.TimePicker;

public class dialoguePane {
    JPanel reference;
    String event;
    LocalDate date;
    LocalTime time;
    int year, month, dayofMonth, hour, minute;
    String Date, Time;
    Border blackline = BorderFactory.createLineBorder(Color.black);
    JLabel newEvent = new JLabel("New Event");
    JTextField eventName = new JTextField();
    DatePicker datePicker = new DatePicker();
    TimePicker timePicker = new TimePicker();

    public dialoguePane(JPanel panel) {
        newEvent.setBorder(blackline);
        reference = panel;

        Object[] message = {
                "Event:", eventName,
                "Date:", datePicker,
                "Time:", timePicker
        };

        int option = JOptionPane.showConfirmDialog(null, message, "ADD", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) { // Need to add exceptional cases
            event = eventName.getText();
            date = datePicker.getDate();
            Date = "" + date.getDayOfMonth() + "/" + date.getMonthValue() + "/" + date.getYear();
            time = timePicker.getTime();
            Time = "" + time.getHour() + ":" + time.getMinute();

            System.out.println(event + " " + Date + " " + Time);

            // Attaching Event
            this.attachEvent();
        }
    }

    public void attachEvent() {
        // set the label size 
        newEvent.setPreferredSize(new Dimension(110, 30));
        reference.add(newEvent);
        newEvent.setText("<html>" + event + "<br/>" + Date + "      " + Time + "</html>");
        // refresh the panel
        reference.revalidate();

        /**
         *  Creating the Timer for the event
         */

        new timer(date, time, event);
    }
}
