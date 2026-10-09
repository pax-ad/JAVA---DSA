package Arraylist;
import java.util.ArrayList;

public class Operations
 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //adding elements
        list.add(1); //0 index
        list.add(1,9); // first index 
        list.add(4); // 2 index
        //list.set(5,10); throws an indexoutofboundexception
        list.add(6);
        list.add(7);
        


        //printing arraylist
        for(int i= 0 ; i <list.size();i++){
            System.out.println(list.get(i) + " ");
        }
        System.out.println(" ");

        //reverseof arraylist
        for(int i = list.size()-1;i>=0;i--){
            System.out.println(list.get(i) + " ");
        }


    }
}
