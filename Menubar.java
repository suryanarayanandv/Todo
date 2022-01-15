package todo;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Menubar extends JMenuBar {
    public Menubar(JFrame mainFrame) {
        JMenuBar bar = new JMenuBar();
        JMenu settings = new JMenu("Settings");
        JMenu info = new JMenu("Info");

        // Listeners
        settings.addActionListener((l) -> {
            // change main pane to settings panel
        });
        info.addActionListener((l) -> {
            // info panel
        });

        bar.add(settings);
        bar.add(info);

        mainFrame.add(bar, BorderLayout.NORTH);
    }
}
