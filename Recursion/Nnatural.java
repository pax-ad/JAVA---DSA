package Recursion;

public class Nnatural {
    
    public static int sum(int n ){
         //edge case 
        if(n==1){
            return 1;
        }
        int s = sum(n-1); 
        int S = n + s;
        return S;      
        
       
        }

        public static void main(String[] args) {
            System.out.println(sum(5));
        }
    }

    /*for n = 5 
    s = (5-1) =4
    S = 5+4 =9 */

