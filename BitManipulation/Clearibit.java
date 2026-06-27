package BitManipulation;

public class Clearibit {
    
    public static void main(String[] args) {
        
       Clear(10, 1);

    }
        //clearing i th bit

    public static void  Clear (int n,int i){
        int bitmask = ~(1 <<i);
        System.out.println(n&bitmask);
       
    }


}
