//This program calculates sum and product of the number given by user.
package HackerRankProblemsSolved;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        int a, b, sum, product;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = input.nextInt();
        System.out.println("Enter the second number:");
        b = input.nextInt();
        sum = a + b;
        product = a * b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        System.out.println("The product of " + a + " and " + b + " is " + product);
        //Average of the sum
        float average = (float)sum/2;
        System.out.println("The average of the sum " + sum + " is " + average);
    }

}
