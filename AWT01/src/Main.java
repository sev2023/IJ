import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        //AWT myAwt = new AWT();

        JFrame gridJFrame = new JFrame("This is Title");
        gridJFrame.setSize(400, 500);
        gridJFrame.setDefaultCloseOperation(3);
        gridJFrame.setVisible(true);
        gridJFrame.setLayout(new GridLayout(6,4));
        // getContentPane() is Frame's graphical layer
        gridJFrame.getContentPane().setBackground(new Color(136, 169, 193));

        JLabel JLdisplay = new JLabel(".....0");
        JLdisplay.setOpaque(true);
        JLdisplay.setBackground(new Color(194, 208, 222));

        gridJFrame.add(JLdisplay); // this is really added to getContentPane()




    }
}