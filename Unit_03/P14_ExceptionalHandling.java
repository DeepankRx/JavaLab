
import java.util.Scanner;
public class P14_ExceptionalHandling {
	public static void main(String arg[]){
		exception o =new exception();
		 o.Basicexception();
		 o.outofbound();
		 //o.stack(2);
		 o.mixmatch();
	}
}
class exception{
	
	exception()
	{}
	Scanner sc=new Scanner(System.in);
 void Basicexception() {
	int a=10;
	int b=0;
	try {
		int c=a/b;
		System.out.print(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
		System.out.println("exception 2 catch");
	}
	catch(Exception e) {
		
		System.out.println(e);
		System.out.println("exception catch");
	}

}
 static void stack(int a)
	{
		try{
			while(a>0)
		{
			stack(a++);
		}
		}
 	catch(Exception ex) {
 	
 		System.out.println("exception catch in overflow");
	}}
 void outofbound()
 {
	 int arr[] = {1,2,3,4};
	 try
	 {
		 int x=arr[6];
		 System.out.println(x);
		 
	 }
	 catch(Exception ex)
	 {
		 System.out.println("out of bound");
	 }
 }
 void mixmatch() {
	 try{
		 int x=sc.nextInt();
	 }
	 catch(Exception e) {
		  System.out.println("found error");
 
 }
 }
}