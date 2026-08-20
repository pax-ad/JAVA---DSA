package PracticeQ;
import java.util.*;

public class Q13 {
    //removing duplicate form sorting array

    public static void main(String[] args) {
        int num []={2,3,0,5,0,9,6};
        Move(num);
        System.out.println(Arrays.toString(num));
        
    }

    public static void Move(int[] num){
        
        int insertpos =0;
        for(int i = 0 ; i < num.length;i++){
            int temp;
            if(num[i]!=0){
                temp = num[i];
                num[i] = num[insertpos];
                num[insertpos]=temp;

                insertpos++;
                
            }
        }
    }
}
