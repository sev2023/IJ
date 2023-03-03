import javax.swing.*;
import java.awt.*;

public class Calc {
    public static void main(String[] args){

        //MyJFrame myJF = new MyJFrame();

        EventQueue.invokeLater(new Runnable() {
            //@Override
            public void run() {
                new MyJFrame();
            }
        });
    }
}
