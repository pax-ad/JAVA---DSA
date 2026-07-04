package Recursion;

public class Intro {
    
    //recursion is a process in which a function calls itself directly or indirectly. 
    // The corresponding function is called as recursive function. 
    // Recursion is used to solve complex problems by breaking them down into simpler sub-problems. 
    // It is a divide and conquer approach.


    //printing number drom n to 1

    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

        public static void main(String[] args) {
            printNum(5);
        }
    
}
