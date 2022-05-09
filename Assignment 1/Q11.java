/* Q11. As given there are two sample methods: First one returns the sum of 
two numbers a and b and second one returns the subtraction of a and b. if 
a-b is negative then return value would be 0. Use ternary operator to call 
these two methods. If a>b then ternary should call sum(a,b) but if a<b 
then ternary operator should call sub(a,b). Eventually print the result of 
the ternary operation on variable a and b.
Note: Ternary operator can call a method even for true and false values
*/

class Q11{
    public static void main(String args[]){
    	System.out.println("Question 11");
    		System.out.println("Deepank  Pushpad  _F_  20011452");
    	int a=30,b=20;
        int c=a>b?sum(a,b):sub(a,b);
        System.out.println(c);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        if(a-b<0)
            return 0;
        return a-b;
    }
}