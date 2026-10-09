package Arraylist;
import java.util.ArrayList;
public class Multi {
    //storing array list in array list

    public static void main (String args[]){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>(); //storing the AL in AL

        ArrayList<Integer> list = new ArrayList<>(); //AL that is stored 
        list.add(1); list.add(2); //adding element [1,2] in list.
        mainlist.add(list); // adding list at index 1.

        ArrayList<Integer> list2 = new ArrayList<>(); // list 2
        list2.add(3); list2.add(4); //adding element [3,4] in list.
        mainlist.add(list2);  // adding list2 at index 2.
 
        for (int i =0 ;i < mainlist.size();i++){
            ArrayList<Integer> currlist = mainlist.get(i); // mainlist ke i th index pe puri ki puri ke list store ki hai
            for(int j =0 ; j < currlist.size();j++){
                System.out.println(currlist.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);

    }
}
