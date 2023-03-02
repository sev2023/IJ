import java.awt.*; // Swing needs this!
import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        int bntW = 58;
        int bntH = 40;

        JFrame calcFrame = new JFrame("This is Title");

        JLabel display = new JLabel(" 0 ",4);
        display.setBounds(20,10,245,40);
        display.setOpaque(true);
        display.setBackground(new Color(189, 210, 231));
        display.setFont(new Font("Arial", Font.BOLD, 18));
        //display.setBorder(BorderFactory.createLineBorder(new Color(189, 210, 231), 10));
        display.setBorder(BorderFactory.createBevelBorder(1));


        JButton btn7 = new JButton("7");
        btn7.setBounds(20,60,bntW,bntH);

        JButton btn8 = new JButton("8");
        btn8.setBounds(82,60,bntW,bntH);

        JButton btn9 = new JButton("9");
        btn9.setBounds(144,60,bntW,bntH);

        JButton btnC = new JButton("C");
        btnC.setBounds(206,60,bntW,bntH);
        btnC.setBackground(SystemColor.red);
        btnC.setForeground(SystemColor.white);
        // -----------------------------------------
        JButton btn4 = new JButton("4");
        btn4.setBounds(20,105,bntW,bntH);

        JButton btn5 = new JButton("5");
        btn5.setBounds(82,105,bntW,bntH);

        JButton btn6 = new JButton("6");
        btn6.setBounds(144,105,bntW,bntH);

        JButton btnDivide = new JButton("/");
        btnDivide.setBounds(206,105,bntW,bntH);
        // -----------------------------------------
        JButton btn1 = new JButton("1");
        btn1.setBounds(20,150,bntW,bntH);

        JButton btn2 = new JButton("2");
        btn2.setBounds(82,150,bntW,bntH);

        JButton btn3 = new JButton("3");
        btn3.setBounds(144,150,bntW,bntH);

        JButton btnMiltiply = new JButton("*");
        btnMiltiply.setBounds(206,150,bntW,bntH);
        // -----------------------------------------
        JButton btn0 = new JButton("0");
        btn0.setBounds(20,195,bntW,bntH);

        JButton btn00 = new JButton("00");
        btn00.setBounds(82,195,bntW,bntH);

        JButton btnDot = new JButton(".");
        btnDot.setBounds(144,195,bntW,bntH);

        JButton btnPlus = new JButton("+");
        btnPlus.setBounds(206,195,bntW,bntH);
        // -----------------------------------------
        JButton btnEqual = new JButton("Equal");
        btnEqual.setBounds(20,240,bntW*3+6,bntH);
        btnEqual.setBackground(new Color(16, 124, 16));
        btnEqual.setForeground(SystemColor.white);

        JButton btnMinus = new JButton("-");
        btnMinus.setBounds(206,240,bntW,bntH);


        calcFrame.add(display);
        calcFrame.add(btn7);
        calcFrame.add(btn8);
        calcFrame.add(btn9);
        calcFrame.add(btnC);

        calcFrame.add(btn4);
        calcFrame.add(btn5);
        calcFrame.add(btn6);
        calcFrame.add(btnDivide);

        calcFrame.add(btn1);
        calcFrame.add(btn2);
        calcFrame.add(btn3);
        calcFrame.add(btnMiltiply);

        calcFrame.add(btn0);
        calcFrame.add(btn00);
        calcFrame.add(btnDot);
        calcFrame.add(btnPlus);

        calcFrame.add(btnEqual);
        calcFrame.add(btnMinus);

        // KEEP IT AT THE VERY END !!
        calcFrame.setSize(300, 360);
        calcFrame.setDefaultCloseOperation(3);
        calcFrame.setResizable(false);
        calcFrame.setLayout(null);
        calcFrame.setVisible(true);

    }
}