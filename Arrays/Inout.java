package Arrays;
import java.util.*;
public class Inout {
    //how to take basic input and output class array in java

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Physics : ");
       
        
        int [] marks = new int[5];
        marks[0] = sc.nextInt();
        System.out.println("Your physics marks : " + marks[0]);
        
    }
}
