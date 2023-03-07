import java.util.Scanner;
//  1.If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
//  2.If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
//  3.If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
//  4.The year is a leap year (it has 366 days).
//  5.The year is not a leap year (it has 365 days).


public class Main {
    public static void main(String[] args) {
        String boo = "";
        int iYr = 0;
        System.out.print("Enter year: ");
        try{
            String sYr = new Scanner(System.in).nextLine();
            iYr = Integer.parseInt(sYr);
        }
        catch (Exception exc){
            System.out.print("WRONG INPUT !");
            System.exit(0);
        }

        if(iYr % 4 != 0 || ((iYr % 400 != 0) && (iYr % 100 == 0))) boo = "not ";
        System.out.print("Year " + iYr + " is " + boo + "a leap year." );
    }
}