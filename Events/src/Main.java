import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        class IListener implements ItemListener{
            @Override
            public void itemStageChanged(ItemEvent e){
                boolean btnSelected = e.getStateChange() == ItemEvent.SELECTED;

                // cast selected button to "ansBtn"
                AbstractButton absBtn = (AbstractButton)  e.getItemSelectable();

                // cast event action to "lang"
                String lang = absBtn.getActionCommand();

                String state;
                if(btnSelected) state = "selected";
                else state = "unselected";
                String msg = lang + " option was " + state;

                //Show message dialog
                // JOptionPane.showMessageDialog(msg)

            }

            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        }


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