import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{
    static String s1 = "";
    static String s2 = "";
    static String oper = "";

    @Override // this could be in separate class
    public void actionPerformed(ActionEvent e){
        String fromBtn = e.getActionCommand(); // buton value
        switch(fromBtn){
            case "C":
                s1 = "";
                s2 = "";
                oper = "";
                break;
            case ".":
                if(s1.indexOf('.') < 0)
                    s1 = s1 + fromBtn;
                break;
            case "+":
                s2 = s1;
                s1 = "";
                oper = " + ";
                break;
            case "-":
                s2 = s1;
                s1 = "";
                oper = " - ";
                break;
            case "*":
                s2 = s1;
                s1 = "";
                oper = " * ";
                break;
            case "/":
                s2 = s1;
                s1 = "";
                oper = " / ";
                break;
            case "Equal":
                if(s2.equals(""))
                    break;
                if (oper.equals(" + "))
                    s1 = String.valueOf(Double.parseDouble(s2) + Double.parseDouble(s1));
                else if (oper.equals(" - "))
                    s1 = String.valueOf(Double.parseDouble(s2) - Double.parseDouble(s1));
                else if (oper.equals(" * "))
                    s1 = String.valueOf(Double.parseDouble(s2) * Double.parseDouble(s1));
                else if (Double.parseDouble(s1) == 0) // NO zero division
                    break;
                else if (oper.equals(" / "))
                    s1 = String.valueOf(Double.parseDouble(s2) / Double.parseDouble(s1));
                s2 = "";
                oper = "= ";
                break;
            default:
                if(oper.equals("= ")){
                    s1 = "";
                    oper = "";
                }
                s1 = s1 + fromBtn;
        }
        display.setText(s2 + oper + s1);
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
        var btn4 = new JButton("4");
        var btn5 = new JButton("5");
        var btn6 = new JButton("6");
        var btn7 = new JButton("7");
        var btn8 = new JButton("8");
        var btn9 = new JButton("9");
        var btn0 = new JButton("0");
        var btnDot = new JButton(".");

        var btnPlus = new JButton("+");
        var btnMin = new JButton("-");
        var btnMult = new JButton("*");
        var btnDiv = new JButton("/");

        var btnC = new JButton("C");
        btnC.setBackground(new Color(250,180,180));
        var btnEqual = new JButton("Equal");
        btnEqual.setBackground(new Color(240,240,140));

        btn1.addActionListener(new Main());
        btn2.addActionListener(new Main());
        btn3.addActionListener(new Main());
        btn4.addActionListener(new Main());
        btn5.addActionListener(new Main());
        btn6.addActionListener(new Main());
        btn7.addActionListener(new Main());
        btn8.addActionListener(new Main());
        btn9.addActionListener(new Main());
        btn0.addActionListener(new Main());
        btnDot.addActionListener(new Main());

        btnPlus.addActionListener(new Main());
        btnMin.addActionListener(new Main());
        btnMult.addActionListener(new Main());
        btnDiv.addActionListener(new Main());

        btnEqual.addActionListener(new Main());
        btnC.addActionListener(new Main());

        form.add(btn1);
        form.add(btn2);
        form.add(btn3);
        form.add(btn4);
        form.add(btn5);
        form.add(btn6);
        form.add(btn7);
        form.add(btn8);
        form.add(btn9);
        form.add(btn0);
        form.add(btnDot);

        form.add(btnPlus);
        form.add(btnMin);
        form.add(btnMult);
        form.add(btnDiv);

        form.add(btnC);
        form.add(btnEqual);

        form.setSize(300,300);
        form.setLayout(new FlowLayout());
        form.setVisible(true);
    }
}

