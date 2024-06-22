/*You must read an integer, a double, and a String from stdin,
then print the values according to the instructions in the
Output Format section below.

Input Format

There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String.

Output Format

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin. */
package Programs;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scanner.nextInt();
        System.out.println("Enter the number with datatype double:");
        double b = scanner.nextDouble();
        /*If you use the nextLine() method immediately following the nextInt() method,
        recall that nextInt() reads integer tokens*/
        scanner.nextLine();
        System.out.println("Enter any string:");
        String c = scanner.nextLine();

        System.out.println("OUTPUT: \n");

        System.out.println("String:" + c);
        System.out.println("Double:" + b);
        System.out.println("Int:" + a);
    }
}
