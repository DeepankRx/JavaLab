/* Q6. As given there are two sample methods: First one returns the sum of  
two numbers a and b and second one returns the subtraction of a and b. if 
a-b is negative then return value would be 0. Use ternary operator to call 
these two methods. If a>b then ternary should call sum(a,b) but if a<b 
then ternary operator should call sub(a,b). Eventually print the result of 
the ternary operation on variable a and b.
Note: Ternary operator can call a method even for true and false values
*/


import java.util.*;

public class Q06 {
		  
		public static void main(String[] agrs) {
			
			System.out.println("Question 06");
				System.out.println("Deepank  Pushpad  _F_  20011452");
			System.out.println("\t");
			
			Scanner in =new Scanner(System.in);
			int a,b;
			System.out.println("Enter the numbers on which task is to be performed");
			System.out.print("Enter the value of 'a'=");
			a=in.nextInt();
			System.out.print("Enter the value of 'b'=");
			b=in.nextInt();
			
			Calculate obj=new Calculate();
			int c=(a>b)? obj.sum(a,b) : obj.sub(a,b);
			System.out.println("\t");
			System.out.println("Result="+c);
		}
	}

	class Calculate{

		int  sum(int a,int b) {
			return a+b;
		}
		
		int sub(int c,int d)
		{
			if(c>d)
				return c-d;
			
			else
				return 0;
		}
	}