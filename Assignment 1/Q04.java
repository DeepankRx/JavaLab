/* Q4. Create a multi-level inheritance hierarchy from ClassOne, ClassTwo, 
ClassThree classes.
ClassOne contains one, single parameterized constructor
ClassTwo contains only a default constructor
ClassThree contains one, single parameterized constructor and a default 
constructor.
Create an object of top child class and make sure the constructor 
execution will take place according to respective multi-level inheritance 
hierarchy.
ClassThree obj = new ClassThree(1);
ClassThree obj = new ClassThree();
*/


public class Q04 {


		public static void main(String[] agrs) {
	    
			System.out.println("Question 04");
			System.out.println("Deepank  Pushpad  _F_  20011452");
			System.out.println("\t");
			
			System.out.println("Call Made For Parameterized Constructor");
			ClassThree obj =new ClassThree(1);
	        
			System.out.println("\n");
			System.out.println("Call Made for Non-Parametrized Constructor");
	        ClassThree obj1=new ClassThree();
	   
		}
	}

	class ClassOne{
		
		ClassOne(int a){
		
			System.out.println("One's Parameterized Constructor");
		}
	}

	class ClassTwo extends ClassOne{
		
		ClassTwo(){
			super(1);
			System.out.println("Two's Default Constructor");
		}
	}

	class ClassThree extends ClassTwo{
		
		ClassThree(){
		
			System.out.println("Three's Default Constructor");
		}
		
		ClassThree(int b){
			
			System.out.println("Three's Parameterized Constructor");
		}
	}
