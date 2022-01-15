package todo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


/**
 * Hello world!
 */
public final class App implements MouseMotionListener {

    // Panels and frame
    JFrame mainFrame = new JFrame();
    int mouseX = 0, mouseY = 0;
    private App() {
        mainFrame.setLayout(new BorderLayout());
        new Menubar(mainFrame);
        new Mainpane(mainFrame);
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
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        App todo = new App();

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        System.out.println(mouseX + " " + mouseY);
    }
}
