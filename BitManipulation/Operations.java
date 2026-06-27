package BitManipulation;

public class Operations {
    

    public static void main(String[] args) {
        GEti(7);
        System.err.println(Seti(10, 2));
    }

    //getting i th bit
    public static void GEti(int n ){
        int i_th_bit = 2;
        int bitmask = 1 << i_th_bit; // we are taking left shift with 1 since it doesn't matter shifting with one since it remains one.
        if ((n&bitmask)!=0){
            System.out.println(1); // print the ith place bit is 1 
        }
        else{
            System.out.println(0);
        }
    }
    

    // Setting the i th bit

    public static int Seti(int n,int i ){
     
        int bitmask = 1 << i ;
        return n | bitmask;

        }

    
    }
