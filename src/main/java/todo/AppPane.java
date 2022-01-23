package todo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public final class AppPane implements MouseMotionListener {

    // Panels and frame
    JFrame mainFrame = new JFrame();
    int mouseX = 0, mouseY = 0;
    public AppPane() {
        mainFrame.setLayout(new BorderLayout());
        ImageIcon icon = new ImageIcon("src/main/resources/icon.png");
        mainFrame.setIconImage(icon.getImage());
        new Menubar(mainFrame);
        new Mainpane(mainFrame);
        // new dialoguePane();
        mainFrame.setSize(800, 500);
        mainFrame.setResizable(true);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        mainFrame.addMouseMotionListener(this);
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppPane();
            }
        });
        // UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
        // for (UIManager.LookAndFeelInfo look : looks) {
        //     System.out.println(look.getClassName());
        // }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}