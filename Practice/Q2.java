package Practice;

public class Q2 {
    //finding the largest element 

    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
     System.out.println( Largest(num));
    }

    public static int Largest(int num[]){
         int  biggest = Integer.MIN_VALUE;
        for(int i = 0; i <num.length;i++){
            if(biggest<num[i]){
                biggest = num[i];
            }
        }
        return biggest;
    }

}
