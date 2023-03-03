import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{
    @Override // this could be in separate class
    public void actionPerformed(ActionEvent e){
        s1 = e.getActionCommand() + s1;
        display.setText(s1);

    }

    // this is static accessible from everywhere
    static JFrame form;
    static JTextField display;
    static String s1 = "";
    public static void main(String[] args)
    {
        form = new JFrame("Main"); // this is static already declared
        display = new JTextField(20);

        form.add(display);

        var btn1 = new JButton("1");
        var btn2 = new JButton("2");
        var btn3 = new JButton("3");

        btn1.addActionListener(new Main());
        btn2.addActionListener(new Main());
        btn3.addActionListener(new Main());

        form.add(btn1);
        form.add(btn2);
        form.add(btn3);

        form.setSize(300,300);
        form.setLayout(new FlowLayout());
        form.setVisible(true);
    }
}

