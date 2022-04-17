package UNIT_1.Practical_4;

public class P4_Task01_ControlAndConditionalStatementInJava
{
    public static void main(String args[])
    {
        Statements statements = new Statements();
        statements.DecisionMaking();
        statements.LoopsStatements();
        statements.JumpStatements();
    }
}
class Statements
{
    void DecisionMaking()
    {
        int a = 10;
        int b = 20;
        int c = 30;
        int max = 0;
        if(a > b)
        {
            max = a;
        }
        else
        {
            max = b;
        }
        if(max < c)
        {
            max = c;
        }
        System.out.println("Max value is: " + max);
    }
    void LoopsStatements()
    {
        int i=0;
        while(i<=10)
        {
            System.out.println("Value of i: " + i);
            i++;
        }
        System.out.println("\n");
        int j=0;
        do
        {
            System.out.println("Value of j: " + j);
            j++;
        }while(j<=10);
        System.out.println("\n");
        for(int k=0; k<=10; k++)
        {
            System.out.println("Value of k: " + k);
        }
        
    }
    void JumpStatements()
    {
        int i = 0;
        while(i < 10)
        {
            if(i == 5)
            {
                System.out.println("Value of i is: " + i);
            }
            if(i == 7)
            {
                System.out.println("Value of i is: " + i);
                break;
            }
            i++;
        }
    }
}