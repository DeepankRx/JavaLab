package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num = scanner.nextInt();
	    System.out.println("Factorial Is : "+ fact(num));
    }
   static int fact(int num)
    {
        if(num == 1 || num == 0 )
        {
            return 1;
        }
        return num * fact(--num);
    }
}
