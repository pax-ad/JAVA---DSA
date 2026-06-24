package TwoDarray;

import java.util.Scanner;

public class Create {
    //java program for intialixation of 2d array
    public static void main(String [] args){
        int nums [][] = new int[3][3];
         Scanner sc = new Scanner(System.in);
       
       for(int i = 0; i < nums.length ; i++ ){
        for(int j =0; j<nums.length ; j++){
            
              nums[i][j] = sc.nextInt();
            
        }
       }
        sc.close();
    }
    
}
