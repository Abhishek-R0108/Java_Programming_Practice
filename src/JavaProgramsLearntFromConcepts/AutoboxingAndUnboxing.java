//This topic comes under WrapperClass.
// Autoboxing - Converting primitive data type into object.
// Unboxing - Converting Object into primitive data type.
package JavaProgramsLearntFromConcepts;

public class AutoboxingAndUnboxing {

    public void Autoboxing() {
        int i = 100;
        Integer i1 = i;
        System.out.println("The Autoboxing value is: " +i1);
    }

    public void Unboxing() {
        Integer iobj = new Integer(100);
        int j = iobj;
        System.out.println("The Unboxing value is: " +j);
    }

    public static void main(String[] args) {

        AutoboxingAndUnboxing obj1 = new AutoboxingAndUnboxing(); //Method call can be called through object
        obj1.Autoboxing();
        obj1.Unboxing();

    }
}
