import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        form.setSize(200,200);
    }

    // this is static accessible from everywhere
    static JFrame form;
    static JTextField display;
    public static void main(String[] args)
    {
        Main m = new Main(); // made only to access ActionListener
        form = new JFrame("Main"); // this is static already declared

        var btn1 = new JButton("1");
        btn1.addActionListener(m);
        form.add(btn1);
        form.setSize(300,300);
        form.setVisible(true);
    }
}

