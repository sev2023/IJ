import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        //AWT myAwt = new AWT();

        // Swing JFrame setup
        JFrame myJF = new JFrame();

        myJF.setSize(400,500);
        myJF.setDefaultCloseOperation(3);
        myJF.setLayout(null);
        myJF.setResizable(false);
        myJF.setVisible(true);
        myJF.getContentPane().setBackground(new Color(107, 134, 151));

        // Label to hold calc display
        JLabel JLdisplay = new JLabel("...0");
        JLdisplay.setBounds(50,20,300,30);
        //JLdisplay.setOpaque(true);
        JLdisplay.setBackground(new Color(177, 188, 173));

        // Add components to Frame
        myJF.add(JLdisplay);
    }
}