package Arrays;

public class Reverse {
    
    public static void main (String [] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
       Cycle(num);
        for (int i = 0 ; i < num.length; i++ ){
             System.out.println(num[i]);
        }

    }

    public static void  Cycle(int num[]){
       int start = 0;
       int last = num.length-1;
       while(start<last){
        int temp = num[last];
        num[last] = num[start];
        num[start] = temp;
        start++;    
        last--;
       }
               

    }
}
