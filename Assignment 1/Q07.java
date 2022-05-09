/* Q7. WAP to count the total number of calls for a member function: 
display(), from more than one objects and how many times the object is 
created of a class name Employee.
Note: Call display() function from more than 3 objects
*/


public class Q07 {
	
		public static void main(String[] agrs) {
			int j=0;
			System.out.println("Question 07");
				System.out.println("Deepank  Pushpad  _F_  20011452");
			System.out.println("\t");
			
			Employe obj=new Employe();
			j++;
			Employe obj1=new Employe();
			j++;
			Employe obj2=new Employe();
			j++;
			Employe obj3=new Employe();
			j++;
			Employe obj4=new Employe();
			j++;
			Employe obj5=new Employe();
			j++;
			Employe obj6=new Employe();
			j++;
			Employe obj7=new Employe();
			j++;
			Employe obj8=new Employe();
			j++;
			Employe obj9=new Employe();
			j++;
			
			System.out.println("Number of object created="+j);
			
			obj.display();
			obj1.display();
			obj2.display();
			obj3.display();
			obj4.display();
			obj5.display();
			
			System.out.println("Number of calls made="+obj.i);
		}
	}

	class Employe{
		
		static int i=0;
		void display(){
			i++;
		    if(i==1)
			System.out.println(i+"st Call made");
			else if(i==2)
			System.out.println(i+"nd Call made");
			else if(i==3)
			System.out.println(i+"rd Call made");
			else
			System.out.println(i+"th Call made");
		}
	}