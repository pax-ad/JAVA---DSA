package Arraylist;
import java.util.ArrayList;

import java.util.Collections;

public class Sorting {
    public static void main(String args[]){
        //similar to creating object
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);

        thik(list);
    }
    
    public static void thik(ArrayList<Integer> list){
        Collections.sort(list); //becarful of the s in the ending.
        System.out.println(list);
        System.out.println("Now in descending order");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
