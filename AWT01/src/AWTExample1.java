import java.awt.*;

public class AWTExample1 extends Frame
{
    // CONSTRUCTOR
    AWTExample1(){
        Button b = new Button();
        b.setBounds(30,100,80,30);
        add(b);

        setSize(300,300);
        setTitle("TITllleee");
        setLayout(null);
        setVisible(true);
    }
}
