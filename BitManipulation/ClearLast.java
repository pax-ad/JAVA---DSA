package BitManipulation;

public class ClearLast {
    public static void main(String[] args) {
        System.out.println(Clearinglastibit(15, 2));
    }
    

     //clearing last i bits
    public static int Clearinglastibit(int n , int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
}
