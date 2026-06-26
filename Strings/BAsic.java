package Strings;

import java.util.Scanner;

public class BAsic {
    //basic string programe

    public static void main (String [] args ){
        //strings are immutable in java
        Scanner sc = new Scanner (System.in);
        String First_name,Last_name;
        First_name = sc.nextLine();
        Last_name = sc.nextLine();
        System.out.println("FULL NAME : " + (First_name + " " + Last_name) ); // concatentation of string
        sc.close();
        System.out.println(First_name.length());
        
        

    }
    
}
