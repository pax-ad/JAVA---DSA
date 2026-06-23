package Arrays;

public class Largest {
    
    public static void main(String[] args){
        int[] num = {2,4,6,8,10,12};
       
        System.out.println("largest numbers is : " + Big(num) );
    }

    public static int Big(int[] num){
         int Large = Integer.MIN_VALUE; // remember this "Interger.MIN_VALUE" for largest
        for(int i =0;i<num.length;i++){
           
             if(Large < num[i]){ //cautious of the greater than and smaller than.
                Large = num[i];
              
            }

        }
        return Large;
      
    }


}
