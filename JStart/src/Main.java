import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{

    static JFrame form;
    static JTextField display;
    public static void main(String[] args){
        form = new JFrame("Main");
        display = new JTextField(20);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        form.add(display);

        // ARRAY!
        String[] btnsTxt = {"1", "2", "3", "4", "5", "6", "7", "8",
                "9", "0", ".", "+", "-", "*", "/", "C", "Equal", "END"};

        JButton[] btns = new JButton[20];
        for(int i=0; i<17; i++) {
            btns[i] = new JButton(btnsTxt[i]);
            btns[i].addActionListener(new Action());
            form.add(btns[i]);
        }

        form.setSize(300,200);
        form.setLayout(new FlowLayout());
        form.setVisible(true);
    }
}

