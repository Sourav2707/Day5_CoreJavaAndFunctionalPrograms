package com.core_java_programs;
import java.util.Scanner;
public class Harmonics {
    public static void core(int n)
    {
        double harm = 0;
        if (n > 0)
        {
            for (int i = 1; i <= n; i++)
            {
                harm = harm + (1.0 / i);
                if (i == n)
                {
                    System.out.print("1/"+i);
                    break;
                }
                System.out.print("1/"+i+" + ");
            }
            System.out.print("\nThe value of {n}th harmonic number is "+harm);
        }
        else
        {
            System.out.println("Invalid input, n shouldn't be negative");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of harmonic number to be displayed: ");
        int limit = sc.nextInt();
        core(limit);
    }
}
