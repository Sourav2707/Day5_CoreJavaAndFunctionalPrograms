package com.core_java_programs;
import java.util.Scanner;
public class PrimeFactor {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter x=");
        int x=sc.nextInt();
        System.out.print("enter y=");
        int y=sc.nextInt();

        x=x+y; //30
        y=x-y;
        x=x-y;

        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
