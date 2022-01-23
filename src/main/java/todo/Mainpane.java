package todo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.*;

public class Mainpane implements ActionListener{
    JPanel outer, doing, out_todo, out_doing, out_done, in_todo, in_doing, in_done, in_todo_title, in_doing_title, in_done_title, todo, done;
    JButton add_todo, add_doing, add_done;
    JLabel title_todo, title_doing, title_done;
    public Mainpane(JFrame frame) {

        /**
         * Proper Layout and Look
         */

        Border blackline = BorderFactory.createLineBorder(Color.black);
        title_todo = new JLabel("TODO");
        title_done = new JLabel("DONE");
        title_doing = new JLabel("DOING");

        add_todo = new JButton("+");
        add_todo.putClientProperty("id", Integer.valueOf(0));
        add_todo.addActionListener(this);
        add_doing = new JButton("+");
        add_doing.putClientProperty("id", Integer.valueOf(1));
        add_doing.addActionListener(this);
        add_done = new JButton("+");
        add_done.putClientProperty("id", Integer.valueOf(2));
        add_done.addActionListener(this);

        outer = new JPanel();
        outer.setBorder(blackline);
        outer.setLayout(null);
        
        out_todo = new JPanel();
        out_todo.setBorder(blackline);
        // out_todo.setBackground(Color.CYAN);
        out_doing = new JPanel();
        out_doing.setBorder(blackline);
        // out_doing.setBackground(Color.CYAN);
        out_done = new JPanel();
        out_done.setBorder(blackline);
        // out_done.setBackground(Color.CYAN);

        // set panel bounds
        out_todo.setBounds(40, 40, 210, 350);
        out_doing.setBounds(290, 40, 210, 350);
        out_done.setBounds(540, 40, 210, 350);

        in_todo = new JPanel();
        in_todo.setBorder(blackline);
        in_todo.setLayout(new BorderLayout());
        in_doing = new JPanel();
        in_doing.setBorder(blackline);
        in_doing.setLayout(new BorderLayout());
        in_done = new JPanel();
        in_done.setBorder(blackline);
        in_done.setLayout(new BorderLayout());


        // set panel layouts to null
        out_todo.setLayout(new BorderLayout());
        out_doing.setLayout(new BorderLayout());
        out_done.setLayout(new BorderLayout());

        in_todo_title = new JPanel();
        in_todo_title.setLayout(new BorderLayout());
        in_doing_title = new JPanel();
        in_doing_title.setLayout(new BorderLayout());
        in_done_title = new JPanel();
        in_done_title.setLayout(new BorderLayout());

        in_todo_title.setLayout(new FlowLayout(FlowLayout.LEFT));
        in_doing_title.setLayout(new FlowLayout(FlowLayout.LEFT));
        in_done_title.setLayout(new FlowLayout(FlowLayout.LEFT));

        in_todo_title.add(title_todo);
        in_todo_title.add(add_todo);
        in_todo_title.setBorder(blackline);
        in_doing_title.add(title_doing);
        in_doing_title.add(add_doing);
        in_doing_title.setBorder(blackline);
        in_done_title.add(title_done);
        in_done_title.add(add_done);
        in_done_title.setBorder(blackline);
        
        todo = new JPanel();
        todo.setLayout(new BoxLayout(todo, BoxLayout.Y_AXIS));
        done = new JPanel();
        done.setLayout(new BoxLayout(done, BoxLayout.Y_AXIS));
        doing = new JPanel();
        doing.setLayout(new BoxLayout(doing, BoxLayout.Y_AXIS));
        
        in_todo.add(in_todo_title, BorderLayout.NORTH);
        in_todo.add(todo, BorderLayout.CENTER);
        
        in_doing.add(in_doing_title, BorderLayout.NORTH);
        in_doing.add(doing, BorderLayout.CENTER);
        
        in_done.add(in_done_title, BorderLayout.NORTH);
        in_done.add(done, BorderLayout.CENTER);

        out_todo.add(in_todo);
        out_doing.add(in_doing);
        out_done.add(in_done);

        // add panels to outer panel
        outer.add(out_todo);
        outer.add(out_doing);
        outer.add(out_done);
        
        frame.add(outer, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        int id = (int) b.getClientProperty("id");
        if (id == 0) {
            new dialoguePane(todo);
        } else if (id == 1) {
            new dialoguePane(doing);
        } else if (id == 2) {
            new dialoguePane(done);
        }
    }
}
