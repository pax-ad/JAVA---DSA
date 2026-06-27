package BitManipulation;



public class EvenorOdd {
    
    public static void main(String[] args) {
        OddorEven(3);
    }


       
       
       public static void OddorEven(int n){
        //odd number has LSB->1
        //even number has LSB->0
        int bitmask = 1 ;
        if( (n & bitmask) ==0) //yaha (n & bitmask) mein agar brackets nahi lagai thi toh type compatible nahi thi
            {
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
    
    }

}
