/* Q3- Given an interface in1 which includes a method display which takes 
an integer as input .
interface In1
{
 void display(int p);
}
Task is to write a class testClass which implements interface In1 and has 
a method named display which takes an integer as an input p and the 
display method should be able to tell if the number is prime or not?
- The main method should not be in testClass, create a separate class for 
that.
*/

import java.util.*;

	interface In1{
		
		public void display(int p);
	}

	class testClass implements In1{
		public void display(int p)
		{
			int counter=0;
			for(int i=1;i<=p;i++) {
				if(p%i==0)
				counter=counter+1;
			}
			if(counter==2)
				System.out.println("Number is prime");
			else
				System.out.println("Number is not prime");
		}
	}

	public class Q03 {

		public static void main(String [] agrs) {
		Scanner in =new Scanner(System.in);
		
		System.out.println("Question 03");
			System.out.println("Deepank  Pushpad  _F_  20011452");
		System.out.println("\t");
		System.out.println("Enter the number to be checked");
		int n=in.nextInt();
		
		testClass obj=new testClass();
		obj.display(n);
	  }
		
	}