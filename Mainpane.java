package todo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Mainpane {
    JPanel outer, todo, doing, done, out_todo, out_doing, out_done, in_todo, in_doing, in_done;
    public Mainpane(JFrame frame) {
        JLabel title_todo = new JLabel("TODO");
        JLabel title_done = new JLabel("DONE");
        JLabel title_doing = new JLabel("DOING");

        outer = new JPanel();
        outer.setLayout(null);

        JPanel out_todo = new JPanel();
        JPanel out_doing = new JPanel();
        JPanel out_done = new JPanel();

        // set panel layouts to null
        out_todo.setLayout(null);
        out_doing.setLayout(null);
        out_done.setLayout(null);

        // set panel bounds
        out_todo.setBounds(40, 40, 210, 350);
        out_todo.setBackground(Color.red);
        out_doing.setBounds(290, 40, 210, 350);
        out_doing.setBackground(Color.green);
        out_done.setBounds(540, 40, 210, 350);
        out_done.setBackground(Color.blue);

        in_todo = new JPanel();
        in_doing = new JPanel();
        in_done = new JPanel();
        
        in_doing.setLayout(new BorderLayout());
        in_todo.setLayout(new BorderLayout());
        in_done.setLayout(new BorderLayout());
        

        todo = new JPanel();
        todo.setLayout(new BorderLayout());
        todo.setBackground(Color.white);
        doing = new JPanel();
        doing.setLayout(new BorderLayout());
        doing.setBackground(Color.white);
        done = new JPanel();
        done.setLayout(new BorderLayout());
        done.setBackground(Color.white);
        
        in_todo.add(title_todo, BorderLayout.NORTH);
        in_todo.add(todo, BorderLayout.CENTER);
        
        in_doing.add(title_doing, BorderLayout.NORTH);
        in_doing.add(doing, BorderLayout.CENTER);
        
        in_done.add(title_done, BorderLayout.NORTH);
        in_done.add(done, BorderLayout.CENTER);
        
        out_todo.add(in_todo);
        out_doing.add(in_doing);
        out_done.add(in_done);

        // add panels to outer panel
        outer.add(out_todo);
        outer.add(out_doing);
        outer.add(out_done);

        outer.setBackground(Color.black);
        
        frame.add(outer);
        
    }
}
