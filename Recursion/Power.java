package Recursion;

public class Power {

    // normal way to calculate x^n is to multiply x n times. But we can do it in a better way using recursion. We can reduce the number of multiplications by using the property of exponents. If n is even, then x^n = (x^(n/2))^2. If n is odd, then x^n = x * (x^(n-1)). This way we can reduce the number of multiplications to log(n).
    
    //t.C. = O(n) and s.C. = O(n) for this approach. But we can do it in O(log n) time and O(log n) space using the above property of exponents.
    public static int power(int x, int n){
        //base case
        if(n==0){
            return 1;
        }
        int p = power(x,n-1);
        int P = x * p;
        return P;
    }

    public static void main(String[] args) {
        System.out.println(power(2,5));
        int a =2;
        int n =5;
        System.out.println(Optimized_Power(a,n));
    }
    
    // using recursion
    public static int Optimized_Power(int a , int n ){
        if(n==0){
            return 1;
        }
        int halfPower = opitpow(a,n/2); //changes time complexity to O(logn)
        int halfpowersqn = optipow(a,n/2)*optipow(a,n/2);


        // n is odd 
        if (n%2!=0){
            halfpowersqn = a * halfpowersqn;
        }
        return halfpowersq;
    }


}
