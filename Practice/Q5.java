package Practice;
public class Q5 {
    
    //printing sub array


    public static void main(String[] args) {
        int num[]={-2,1,-3,4,-1,2,1,-5,4};
    Subarray(num);
    }

    public static void Subarray(int[] num){
        for(int i = 0 ; i <num.length ; i++){
            int start = i ;
            for(int j = i; j < num.length ; j++){
                int end = j;
                for(int k = start; k <=end ; k++){
                    System.out.println(num[k]+ " ");
                }
                System.out.println(); // space between pairs
             }
             System.out.println(); //
        }
    }
    }
        

    

