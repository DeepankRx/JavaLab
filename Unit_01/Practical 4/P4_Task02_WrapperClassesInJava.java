package UNIT_1.Practical_4;
/*
 * the wrapper class in java provides the mechanism to convert primitive into object and object into primitive
 * why?
 * Because we want to use predefined methods of those objects
 * -boolean data types --> Boolean obj :--> obj.toString();
 * */
public class P4_Task02_WrapperClassesInJava {
	public static void main(String[]  args)
	{
	//converting int into integer
	int a=20;
	
	String s=""+a+"";
	Integer i=Integer.valueOf(a);
	Integer j=a;//autoboxing,now compiler will write Integer,valueOf(a) internally;
	System.out.println(a+ " " + i + " "+ j+s);
	System.out.println(i.toString());
	//a.toString() can not be done due to a is int not object
	//Autoboxing : converting Objects to primitives
	byte b=10;
	Byte byteobj=b;
	System.out.println(byteobj);
	byte bytevalue =byteobj;
	System.out.println(bytevalue);
	}
	
}