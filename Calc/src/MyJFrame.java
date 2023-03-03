import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {
    // CONSTRUCTOR - new way of making JF
    public MyJFrame(){
        //super("This is title..");
        setDefaultCloseOperation(3);
        setSize(300,300);
        setLayout(new FlowLayout());
        setVisible(true);

        add(new JButton("1"));
        add(new JButton("2"));
    }
}
