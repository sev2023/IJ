import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{
    static String myText = "";
    @Override
    public void actionPerformed(ActionEvent e){
        myText = "ACTION!!!";
    }

    static String s1 = "";
    Main(){
        s1 = "doMain";
    }

    public static void main(String[] args){
        var f = new Main();

        var btn1 = new JButton(s1);
        f.add(btn1);
        f.setSize(300,300);
        f.setVisible(true);
    }
}

