package todo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


/**
 * Hello world!
 */
public final class AppPane implements MouseMotionListener {

    // Panels and frame
    JFrame mainFrame = new JFrame();
    int mouseX = 0, mouseY = 0;
    private AppPane() {
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
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        new AppPane();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
