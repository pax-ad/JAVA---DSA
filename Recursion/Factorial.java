package Recursion;

public class Factorial {

    //factorial of a number using recursion
    public static int fact(int n){
        if(n==0){
            return 1; // when n is zero gives 1.
        }

        int fn = fact(n-1);  
        int fa = n * fn; //calculating factorial 
        return fa;
    }
    
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
//time and space complexity for this is O(n) since for each lvl in call stack we have one variable.