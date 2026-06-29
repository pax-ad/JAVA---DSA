package BitManipulation;

public class Updatingibit {

    public static void main(String[] args) {
        System.out.println(Update(10, 2, 1));
        System.out.println(Update1(10,2,1));
        
    }
     public static int  Cleari (int n,int i){
        int bitmask = ~(1 <<i);
        return n & bitmask;
       
    }

     public static int Setti(int n,int i ){
     
        int bitmask = 1 << i ;
        return n | bitmask;

        }

    public static int Update(int n , int i , int newbit){
        if(newbit == 0){
            return Cleari(n,i);
        }
        else{
            return Setti(n,i);
        }
        
    }

    //another approach
    public static int Update1(int n , int i , int newBit){
     n = Cleari(n,i); 
    int Bitmask = newBit << i ;
    return n | Bitmask;
    }
    
}
