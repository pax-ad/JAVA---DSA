package Strings;

import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
         sc.close();

    }

    public static boolean isPalindrome(String str){
        for(int i = 0 ; i < str.length(); i++){
            int n = str.length();
            if( str.charAt(i) != str.charAt(n-1-i) ) //first index comparison with last index
                {
                return false;
            }
        }
        return true;

    }
    
}
