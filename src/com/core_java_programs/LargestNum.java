package com.core_java_programs;
import java.util.Scanner;
public class LargestNum {
    public static void main(String args[]) {
        int x,y,z;
        int max;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Three Numbers :   \nx = ");
        x=scanner.nextInt();
        System.out.print("y = ");
        y=scanner.nextInt();
        System.out.print("z = ");
        z=scanner.nextInt();

        max=x;
        if (y>max){
            max=y;
        }
        if (z>max){
            max=z;
        }
        System.out.println("Largest Number = "+max);
    }
}
