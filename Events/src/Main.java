import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame myJF = new JFrame();
        JLabel myJL = new JLabel("THis is my labela");
        myJL.setBounds(20,1,200,30);

        JButton myJBtnStart = new JButton("THis is START");
        myJBtnStart.setBounds(20,50,160, 40);


        //---------- ADD COMPONENTS

        myJF.add(myJL);
        myJF.add(myJBtnStart);

        myJF.setSize(300,300);
        myJF.setDefaultCloseOperation(3);
        myJF.setLayout(null);
        myJF.setVisible(true);
    }
}