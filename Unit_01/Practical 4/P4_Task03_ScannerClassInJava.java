package UNIT_1.Practical_4;
import java.util.Scanner;
/*when user take input from the console !
 * nextline() Read user input [to read Strings]
 *next () read next token from the input entered by the user
 *nextBoolean() Reads a boolean value from the user
 *nextByte()
 *nextDouble()
 *nextFloat()
 *nextInt()
 *nextLong()
 *nextShort()
 * */
public class p4_Task03_ScannerClassInJava {
	public static void main(String[] args)
	{
		Scanner myObj1=new Scanner(System.in);//create a Scanner object
		Scanner myObj2=new Scanner(System.in);
		
		//read THE FIRST-Token:(_ space bar)
		String firstName= myObj1.next();
		System.out.println("Name is: " +firstName + "\n");
		
		String name =myObj2.nextLine();//(\n)
		String name2=myObj2.nextLine();//(\n)
		
		System.out.println("Name is: "+name + "\n");
		System.out.println("Name is:"+ name2 +"\n");
		
		boolean b=myObj2.nextBoolean();
		System.out.println(b + "\n");
		
		myObj1.close();
		myObj2.close();
	}
}   