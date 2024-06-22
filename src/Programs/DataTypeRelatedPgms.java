//Diff btw Primitive and Object oriented(Non-Primitive) Datatype.
package Programs;

import java.util.Arrays;

public class DataTypeRelatedPgms {
    public static void main(String[] args) {
        // Primitive Data types
        /*When a primitive data type is stored, it is the stack that the values
        will be assigned. When a variable is copied then another copy of the
        variable is created and changes made to the copied variable will not reflect
        changes in the original variable.*/

        int a = 30;
        int b = a; // value changed to 30
        System.out.println("a = " +a);
        System.out.println("b = " +b);

        // we will set the new value of b
        b = 20;
        System.out.println("The new value set to B should not affect the value A");
        System.out.println("a = " +a);
        System.out.println("b = " +b);

        //NON-PRIMITIVE DATA TYPE
        /*In Object data type although two copies will be created they both will point
        to the same variable in the heap, hence changes made to any variable will reflect
        the change in both the variables.*/

        int[] c = {10, 20, 30, 40};
        int[] d = c;
        System.out.println("The array values of c and d before:");
        System.out.println("C = " + Arrays.toString(c));
        System.out.println("D = " + Arrays.toString(d));

        System.out.println("The array values of c and d after:");
        d[2] = 15;
        System.out.println("C = " + Arrays.toString(c));
        System.out.println("D = " + Arrays.toString(d));
    }
}
