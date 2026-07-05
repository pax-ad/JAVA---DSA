package Recursion;

public class Fibonacci {
    
    //fiboncci series using recursion
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fn = fib(n-1);  
        int fn1 = fib(n-2);
        int f = fn + fn1; //calculating fibonacci
        return f;
    }

    public static void main(String [] args){
        System.out.println(fib(6));
    }
}

/*
Time complexity : O(2^n) bcz of structutre as of tree. for every n , it depends on other two values ,(n-1) and (n-2)
Space = O(n)


*/
