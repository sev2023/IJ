import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Calc extends JFrame implements ActionListener {
//https://www.geeksforgeeks.org/java-swing-simple-calculator/
    static JFrame f;
    static JTextField display;
    // fields to store operands and operator
    String s0,s1,s2;

    Calc(){
        s0 = "";
        s1 = "";
        s2 = "";
    }

    public void actionPerformed(ActionEvent e)
    {

    }
}
