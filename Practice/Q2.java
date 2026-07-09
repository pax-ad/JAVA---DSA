package Practice;

public class Q2 {
    //finding the largest element 

    public static void main(String[] args) {
        int num [] = { 1,2,3,4,5,6,7,8};
        System.out.println(Large(num));
    }

    public static int Large(int[] num){
        int Big = Integer.MIN_VALUE;
        for(int i = 0 ; i < num.length ; i ++){
            if(Big < num[i]){
                Big = num[i];
            }
        }
        return Big;
    }
}
