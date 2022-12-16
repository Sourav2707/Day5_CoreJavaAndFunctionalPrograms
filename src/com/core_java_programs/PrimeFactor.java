package com.core_java_programs;
import java.util.Scanner;
public class PrimeFactor {
    public static void main(String args[]) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int y = 0;
        int n = sc.nextInt();
        if (n > 0)
        {
            for (int i = 2; i < n; i++)            //factors are only from 2 to the half of the number
            {
                if (n % i == 0)
                {
                    int x = 0;
                    for(int j = 1; j <= i; j++)
                    {
                        if (i % j == 0)
                        {
                            x++;
                        }
                    }
                    if(x == 2)
                    {
                        y = 1;
                        System.out.println(i + " ");
                    }
                }
            }
            if(y == 0)
            {
                System.out.println("There is no prime factor for "+n);
            }
        }
        else
        {
            System.out.println("Invalud input, negative integers are not allowed");
        }
    }
}
