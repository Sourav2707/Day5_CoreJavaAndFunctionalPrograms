package com.core_java_programs;
import java.util.Random;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        double head = 0, tail = 0;
        double limit = 0.5;
        System.out.println("Enter the number of time the coin to be flipped");
        Scanner sc = new Scanner(System.in);
        int flip = sc.nextInt();
        if (flip > 0)
        {
            for (int i = 0; i < flip; i++)
            {
                Random random = new Random();
                double output = random.nextDouble(0, 2);
                if (output > limit)
                {
                    System.out.println("Head");
                    head += 1;
                }
                else
                {
                    System.out.println("Tail");
                    tail += 1;
                }
            }
            double headPer = (head / flip) * 100;
            double tailPer = (tail / flip) * 100;
            System.out.println("The percentage of head is "+headPer);
            System.out.println("The percentage of tail is "+tailPer);
        }
        else
        {
            System.out.println("Invalid input only positive integers are allowed");
        }
    }
}
