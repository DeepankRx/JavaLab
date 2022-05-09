/* 5Q. WAP in Java which would contain 8 objects of a Class Employee.  
Employee contains name, age, department, salary. Your program would 
be able to calculate the total salary to be paid in each department. Use 
constructors to create these 8 objects and Scanner to take inputs.
Restrictions:
1- Minimum 8 objects [can be created manually with parameterized 
constructors with Scanner input]
2- Departments are, A, B, C, D: minimum 4 departments [String Type]
3- If the Salary exceeds more than 30,000, then the default salary 
would be 25000 of any of the employee
4- Use array of objects, instead of using multiple 8 objects separately
Use: 
Employee arr[] = new Employee[8];
And
arr[i].department.equals("A");
*/



import java.util.Scanner;
public class Q05 {

	public static void main(String[] args) {
		
		System.out.println("Question 05");
			System.out.println("Deepank  Pushpad  _F_  20011452");
		System.out.println("\t");
		
		Employee arr[] = new Employee[8];
		String s;
		int age;
		String depart;
		int salary;
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Enter the detail of "+(i+1)+" Employee");
			s = in.nextLine();
			age = in.nextInt();
			depart = in.next();
			salary = in.nextInt();
			
			arr[i] = new Employee(s, age, depart, salary);
			
		}
		//check total salary
		Employee result = new Employee();
		result.total_salary();
		
	}

}

class Employee
{
	String name;
	int age;
	String Department;
	int salary;
	static int total_sal = 0;
	
	Employee()
	{
		//Default one
	}
	Employee(String s, int a, String depart, int sal)
	{
		name = s;
		age = a;
		Department = depart;
		if(sal > 30000)
		{
			salary = 25000;
		}
		else
		{
			salary = sal;
		}
		total_sal += sal;
	}
	
	void total_salary()
	{
		System.out.println("Total salary is "+total_sal);
	}
	
}