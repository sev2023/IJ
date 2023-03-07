import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action implements ActionListener {
    static String s1="";
    static String s2="";
    static String oper="";

    @Override
    public void actionPerformed(ActionEvent e) {
        String fromBtn = e.getActionCommand();
        switch(fromBtn){
            case "C":
                s1 = "";
                s2 = "";
                oper = "";
                break;
            case ".":
                if(s1.indexOf('.') < 0)
                    s1 = s1 + fromBtn;
                break;
            case "+":
                s2 = s1;
                s1 = "";
                oper = " + ";
                break;
            case "-":
                s2 = s1;
                s1 = "";
                oper = " - ";
                break;
            case "*":
                s2 = s1;
                s1 = "";
                oper = " * ";
                break;
            case "/":
                s2 = s1;
                s1 = "";
                oper = " / ";
                break;
            case "Equal":
                if(s2.equals(""))
                    break;
                if (oper.equals(" + "))
                    s1 = String.valueOf(Double.parseDouble(s2) + Double.parseDouble(s1));
                else if (oper.equals(" - "))
                    s1 = String.valueOf(Double.parseDouble(s2) - Double.parseDouble(s1));
                else if (oper.equals(" * "))
                    s1 = String.valueOf(Double.parseDouble(s2) * Double.parseDouble(s1));
                else if (Double.parseDouble(s1) == 0) // NO zero division
                    break;
                else if (oper.equals(" / "))
                    s1 = String.valueOf(Double.parseDouble(s2) / Double.parseDouble(s1));
                s2 = "";
                oper = " = ";
                break;
            default:
                if(oper.equals("= ")){
                    s1 = "";
                    oper = "";
                }
                s1 = s1 + fromBtn;
        }
        Main.display.setText(s2 + oper + s1);
    }
}
