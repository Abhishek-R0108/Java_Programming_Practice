package HackerRankProblemsSolved;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number%2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
