package UNIT_1.Practical_8;


/* Problem Statement:
P8_String:
(Create separate logic in separate function)
F1 - Check the entered string is palindrome or not?
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.
F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?
 * */

public class P8_String {

    public static void main(String[] args) {

        QuestionsOnString obj = new QuestionsOnString();

        String s1 = new String("75457");
        String s2 = new String("7545a");

        obj.palindromeOrNot(s1);
        obj.reverseOfAString(s1);
        obj.stringEqualOrNot(s1, s2);

    }

}

class QuestionsOnString {

    void palindromeOrNot(String s) {
        // Write Logic Here!
        int start = 0 , end = s.length() - 1;
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                System.out.println("Not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Given string is palindrome");
    }

    void reverseOfAString(String s) {
        // Write Logic Here!
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
        System.out.println("\n");
    }

    void stringEqualOrNot(String s1,String s2) {
        // Write Logic Here!
        if(s1.length()!=s2.length())
        {
            System.out.println("Strings are not equal\n");
            return;
        }
        else
        {
            int start1 = 0;
            int start2 = 0;
            while(start1<s1.length())
            {
                if(s1.charAt(start1)!=s2.charAt(start2))
                {
                    System.out.println("Strings are not equal\n");
                    return;
                }

                start1++;
                start2++;
            }
            System.out.println("Strings are equal");
        }
    }
}