package Arraylist;

import java.util.ArrayList;

public class Swap2num {

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        swap(list, 0, 1);      

    }

    public static void swap(ArrayList<Integer> list, int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2)); // value of index 1 swapped with value of index 2.
        list.set(idx2,temp);

        System.out.println(list);
    }
    
}
