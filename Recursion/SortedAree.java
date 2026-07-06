package Recursion;

public class SortedAree {
    //how to check if an array is sorted or not using recursion
    //we are assuming ascending order sorted

    public static void Check (int[] num){
        int i;
       
        for( i = 0 ; i < num.length-1; i ++){
             if(num[i]<num[i+1]){
                i++;
            }

            System.out.println("array is sorted");
            
        }
    }


        public static void main(String[] args) {
            int [] num = {1,2,4,3,5,};
            Check(num);
        }
    }


    
