package UNIT_1.Practical_7;


/* Problem Statement: P7_SwitchStatements:
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable
 * */

import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
public class P7_SwitchStatement {

    public static void main(String[] args) {

        SwitchStatements obj = new SwitchStatements();
        obj.switchStatements();

    }

}

class SwitchStatements {
    void switchStatements() {
        System.out.println("1.Current Year\n2.Current Month\n3.Current Day\nEnter your choice : ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        Calendar calendar = Calendar.getInstance();
        System.out.println();
        switch (choice)
        {
            case 1:
                System.out.println("Current Year :"+calendar.get(Calendar.YEAR));
                break;
            case 2:
                System.out.println("Current Month :"+calendar.get(Calendar.MONTH));
                break;
            case 3:
                System.out.println("Current Day :"+calendar.get(Calendar.DAY_OF_MONTH));
                break;
            default:
                System.out.println("Not applicable");
        }


        // Write Logic here!

    }
}