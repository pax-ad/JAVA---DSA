package Recursion;

public class Problem {
    //printing numbers from 1 to n using recursion

    public static void printNum(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printNum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printNum(5);
    }
}
