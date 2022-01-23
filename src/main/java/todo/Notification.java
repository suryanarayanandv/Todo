package todo;

import java.awt.*;
import java.awt.TrayIcon.MessageType;

public class Notification {
    String event;
    /**
     * Notification Constructor
     * @throws AWTException
     */

    public Notification(String event) {
        this.event = event;
    }

    public void throwMessage() throws AWTException, InterruptedException {
        SystemTray tray = SystemTray.getSystemTray();
        Image icon = Toolkit.getDefaultToolkit().createImage("/image/icon.png");
        TrayIcon trayIcon = new TrayIcon(icon, "ToDo");
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("ToDo Remainder");
        tray.add(trayIcon);
        trayIcon.displayMessage("ToDo Remainder", "TASK:" + event , MessageType.INFO);
        trayIcon.wait(100);
    }   
}
