import javax.swing.*;
import java.awt.*;
// simplest JForm creation ever
// 'show()' do MAGIC
public class Main extends JFrame{

    Main(){
        add(new JButton("1"));
        add(new JButton("1"));
        add(new JButton("1"));
        add(new JButton("1"));
        add(new JButton("1"));
        add(new JButton("1"));
        setSize(300,300);
        setLayout(new GridLayout());
        show();

    }
    public static void main(String[] args){
        new Main();
    }
}

