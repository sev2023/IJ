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
        JButton[] btns = new JButton[10];
        for(int i=0; i<10; i++) {
            btns[i] = new JButton(Integer.toString(i));
            form.add(btns[i]);
        }

        var btnDot = new JButton(".");
        var btnC = new JButton("C");
        var btnPlus = new JButton("+");
        var btnEqual = new JButton("Equal");



        form.add(btnDot);
        form.add(btnC);
        form.add(btnPlus);
        form.add(btnEqual);

        form.setSize(300,200);
        form.setLayout(new FlowLayout());
        form.setVisible(true);


    }
}

