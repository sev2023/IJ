import java.awt.*; // Swing needs this!
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Main {

    // math variable
    public int num1;
    public int ans;
    public int count = 0;

    public static void main(String[] args)
    {
        // buttons size
        int bntW = 58;
        int bntH = 40;


        JFrame calcFrame = new JFrame("This is Title");

        JLabel display = new JLabel("",4); // '4' for Right text alignment
        display.setBounds(20,10,245,40);
        display.setOpaque(true);
        display.setBackground(new Color(189, 210, 231));
        display.setFont(new Font("Arial", Font.BOLD, 18));

        //display.setBorder(BorderFactory.createBevelBorder(1));
        display.setBorder(new EmptyBorder(0,0,0,10));


        JButton btn7 = new JButton("7");
        btn7.setBounds(20,60,bntW,bntH);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "7");
            }
        });

        JButton btn8 = new JButton("8");
        btn8.setBounds(82,60,bntW,bntH);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "8");
            }
        });

        JButton btn9 = new JButton("9");
        btn9.setBounds(144,60,bntW,bntH);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "9");
            }
        });

        JButton btnC = new JButton("C");
        btnC.setBounds(206,60,bntW,bntH);
        btnC.setBackground(SystemColor.red);
        btnC.setForeground(SystemColor.white);
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
        // -----------------------------------------
        JButton btn4 = new JButton("4");
        btn4.setBounds(20,105,bntW,bntH);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "4");
            }
        });

        JButton btn5 = new JButton("5");
        btn5.setBounds(82,105,bntW,bntH);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "5");
            }
        });

        JButton btn6 = new JButton("6");
        btn6.setBounds(144,105,bntW,bntH);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "6");
            }
        });

        JButton btnDivide = new JButton("/");
        btnDivide.setBounds(206,105,bntW,bntH);
        // -----------------------------------------------
        JButton btn1 = new JButton("1");
        btn1.setBounds(20,150,bntW,bntH);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "1");
            }
        });

        JButton btn2 = new JButton("2");
        btn2.setBounds(82,150,bntW,bntH);
        btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText() + "2");
        }
    });

        JButton btn3 = new JButton("3");
        btn3.setBounds(144,150,bntW,bntH);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "3");
            }
        });

        JButton btnMiltiply = new JButton("*");
        btnMiltiply.setBounds(206,150,bntW,bntH);
        // -----------------------------------------------
        JButton btn0 = new JButton("0");
        btn0.setBounds(20,195,bntW,bntH);
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });

        JButton btn00 = new JButton("00");
        btn00.setBounds(82,195,bntW,bntH);
        btn00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "00");
            }
        });

        JButton btnDot = new JButton(".");
        btnDot.setBounds(144,195,bntW,bntH);
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().indexOf('.') < 0){
                    display.setText(display.getText() + ".");
                }
            }
        });

        JButton btnPlus = new JButton("+");
        btnPlus.setBounds(206,195,bntW,bntH);
        // -----------------------------------------------
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

//        display.setText("lkjlkj");
//        String sss = display.getText();

    }
}