package BitManipulation;

public class Power2 {
    
    //check if a  number is power of 2 or not

    public static void main(String[] args) {
        System.err.println(Check(8));

    }

    public static boolean Check(int n){
    return((n&n-1)==0);
        


    }
}
