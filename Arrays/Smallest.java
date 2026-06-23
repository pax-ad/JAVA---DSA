package Arrays;

public class Smallest {
    
    public static void main(String[] args){
        int[] num = {2,3,4,5,6,7,8,10,1};
        System.out.println("your smallest number is : " + Small(num));
    }

    public static int Small(int num[]){
        int small = Integer.MAX_VALUE;
        for(int i = 0 ; i < num.length ; i ++){
            if(small > num[i]){
                small = num[i];
            }
        }
        return small;
    }
}
