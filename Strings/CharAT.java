package Strings;

public class CharAT {

    public static void main(String [] args){
    String str = "Tony_STARk";
    printletter(str);
    }

    public static void printletter(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i) + " "); //prints each letter separately

        }
        System.out.println();
    }
    
}
