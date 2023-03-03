import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{
    static String s1 = "";
    static String s2 = "";
    static String oper = "";
    static String result = "";

    @Override // this could be in separate class
    public void actionPerformed(ActionEvent e){
        String fromBtn = e.getActionCommand();
        switch(fromBtn){
            case "C":
                s1 = "";
                s2 = "";
                oper = "";
                break;
            case "+":
                s2 = s1;
                s1 = "";
                oper = " + ";
                break;
            case "Equal":
                if(s2.equals(""))
                    break;
                result = toString(Double.parseDouble(s1) + Double.parseDouble(s2));
                break;
            default:
                s1 = fromBtn + s1;
        }
        display.setText(s2 + oper + s1 + result);
    }

    // this is static accessible from everywhere
    static JFrame form;
    static JTextField display;
    public static void main(String[] args)
    {
        form = new JFrame("Main"); // this is static already declared
        display = new JTextField(20);
        display.setHorizontalAlignment(SwingConstants.RIGHT);

        form.add(display);

        var btn1 = new JButton("1");
        var btn2 = new JButton("2");
        var btn3 = new JButton("3");
        var btnC = new JButton("C");
        var btnPlus = new JButton("+");
        var btnEqual = new JButton("Equal");

        btn1.addActionListener(new Main());
        btn2.addActionListener(new Main());
        btn3.addActionListener(new Main());
        btnPlus.addActionListener(new Main());
        btnEqual.addActionListener(new Main());
        btnC.addActionListener(new Main());

        form.add(btn1);
        form.add(btn2);
        form.add(btn3);
        form.add(btnC);

        form.add(btnPlus);
        form.add(btnEqual);

        form.setSize(300,300);
        form.setLayout(new FlowLayout());
        form.setVisible(true);
    }
}

