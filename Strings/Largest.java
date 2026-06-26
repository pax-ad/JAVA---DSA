package Strings;

public class Largest {
    //printing largest string

    public static void main(String[] args) {
     
        String [] fruits = { "apple","mango","banana"};
        String largest = fruits[0];
        for(int i =1 ; i < fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }

        }
        System.out.println(largest);
    }

   
    //comapre.to 
    //lexiographic
    //compare.to ignore case
    
}
