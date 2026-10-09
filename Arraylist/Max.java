package Arraylist;
import java.util.ArrayList;

public class Max {

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(20);
        list.add(5);
        list.add(30);
        list.add(8);
        list.add(9);

        Findmax(list);
    }


public static void Findmax(ArrayList<Integer> list){
        //for all test casess
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

    int max =Integer.MIN_VALUE;
    for(int i = 0 ; i < list.size();i++){
        if(list.get(i) > max){
            max=list.get(i);
        }
    }
    System.out.println(max);

  }
}
