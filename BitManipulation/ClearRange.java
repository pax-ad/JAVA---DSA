package BitManipulation;

public class ClearRange {

    //clearing range of bits

    public static void main(String[] args) {
        System.out.println(Rangebit(10,2,4));
        
    }

    public static int Rangebit(int n,int i,int j ){
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitmask = a|b;
        return n & bitmask;

    }
    
}
