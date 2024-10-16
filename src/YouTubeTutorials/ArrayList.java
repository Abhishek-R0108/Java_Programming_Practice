package YouTubeTutorials;

import java.util.Collections;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        list.add(100);
        list.add(200);
        System.out.println("The ArrayList is : "+list);
        int element = list.get(0);
        System.out.println(element);
        list.add(1, 67);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("The sorted ArrayList are : "+list);
        //set
        list.set(0, 12);
        System.out.println(list);
    }
}
