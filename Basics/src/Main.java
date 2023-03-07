import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String fromAction = e.getActionCommand();
        try{
            double celsius = (Double.parseDouble(fromAction) * 1.2) + 32;
            fahrenheit.setText("  Fahrenheit: " + Double.toString(celsius));
        }
        catch (Exception exc){
            fahrenheit.setText("  Fahrenheit: incorrect input ");
        }
    }

    // ---------------------STATIC CONTENT
    static JFrame form;
    static JLabel fahrenheit;
    public static void main(String[] args) {
        form = new JFrame("Basics");

        form.add(new JLabel("Celsius to Fahrenheit"));
        form.add(new JLabel("-".repeat(60)));
        form.add(new JLabel("Celsius: "));

        var celsius = new JTextField(16);
        celsius.addActionListener(new Main());
        form.add(celsius);

        fahrenheit = new JLabel("  Fahrenheit: ");
        form.add(fahrenheit);


        // ------------------------------------------------FINAL FORM
        form.setLayout(new FlowLayout(FlowLayout.CENTER));
        form.setSize(300,150);
        form.setResizable(false);
        form.setVisible(true);
    }
}