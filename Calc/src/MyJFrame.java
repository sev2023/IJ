import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame {
    // CONSTRUCTOR - 'anonymous' JF
    public MyJFrame(){
        //super("This is title..");
        setDefaultCloseOperation(3);
        setSize(300,300);
        setLayout(new GridLayout(4,1));
        setVisible(true);

        var lb1 = new JLabel("abcde");
        add(lb1);

        add(new JButton("1"));
        add(new JButton("2"));
        var btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lb1.setText("333");
            }
        });
        add(btn3);
    }
}
