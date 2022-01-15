package todo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.*;

public class Mainpane {
    JPanel outer, todo, doing, done, out_todo, out_doing, out_done, in_todo, in_doing, in_done, in_todo_title, in_doing_title, in_done_title;
    JButton add_todo, add_doing, add_done;
    JLabel title_todo, title_doing, title_done;
    public Mainpane(JFrame frame) {

        /**
         * Proper Layout and Look
         */

        // For Listener
        MyActionListener myActionListener = new MyActionListener();

        Border blackline = BorderFactory.createLineBorder(Color.black);
        title_todo = new JLabel("TODO");
        title_done = new JLabel("DONE");
        title_doing = new JLabel("DOING");

        add_todo = new JButton("+");
        add_todo.putClientProperty("id", Integer.valueOf(0));
        add_todo.addActionListener(myActionListener);
        add_doing = new JButton("+");
        add_doing.putClientProperty("id", Integer.valueOf(1));
        add_doing.addActionListener(myActionListener);
        add_done = new JButton("+");
        add_done.putClientProperty("id", Integer.valueOf(2));
        add_done.addActionListener(myActionListener);

        outer = new JPanel();
        outer.setBorder(blackline);
        outer.setLayout(null);

        out_todo = new JPanel();
        out_todo.setBorder(blackline);
        out_doing = new JPanel();
        out_doing.setBorder(blackline);
        out_done = new JPanel();
        out_done.setBorder(blackline);

        // set panel layouts to null
        out_todo.setLayout(new BorderLayout());
        out_doing.setLayout(new BorderLayout());
        out_done.setLayout(new BorderLayout());

        // set panel bounds
        out_todo.setBounds(40, 40, 210, 350);
        out_doing.setBounds(290, 40, 210, 350);
        out_done.setBounds(540, 40, 210, 350);

        in_todo = new JPanel();
        in_todo.setBorder(blackline);
        in_doing = new JPanel();
        in_doing.setBorder(blackline);
        in_done = new JPanel();
        in_done.setBorder(blackline);
        
        in_doing.setLayout(new BorderLayout());
        in_todo.setLayout(new BorderLayout());
        in_done.setLayout(new BorderLayout());

        in_todo_title = new JPanel();
        in_doing_title = new JPanel();
        in_done_title = new JPanel();

        in_todo_title.setLayout(new FlowLayout(FlowLayout.LEFT));
        in_doing_title.setLayout(new FlowLayout(FlowLayout.LEFT));
        in_done_title.setLayout(new FlowLayout(FlowLayout.LEFT));

        in_todo_title.add(title_todo);
        in_todo_title.add(add_todo);
        in_doing_title.add(title_doing);
        in_doing_title.add(add_doing);
        in_done_title.add(title_done);
        in_done_title.add(add_done);
        
        todo = new JPanel();
        todo.setLayout(null);
        todo.setBounds(40, 60, 210, 350);
        // todo.setBackground(Color.black);
        doing = new JPanel();
        doing.setLayout(null);
        doing.setBounds(290, 60, 210, 350);
        // doing.setBackground(Color.black);
        done = new JPanel();
        done.setLayout(null);
        done.setBounds(540, 60, 210, 350);
        // done.setBackground(Color.black);
        
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
}


class MyActionListener implements ActionListener {
    int id;
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        id = (int) b.getClientProperty("id");
        System.out.println(id);
    }

    
}