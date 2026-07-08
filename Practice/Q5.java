public class Q5 {
    
    //printing sub array


    public static void main(String[] args) {
        int num[]={-2,1,-3,4,-1,2,1,-5,4};
    Subarray(num);
    }

    public static  void Subarray(int num[]){
        for (int i = 0; i < num.length; i++) // iterate for the first elemnt
         {
            for(int j = 1; j < num.length; j++) //making pairs
            {
                for(int k = i; k <= j; k++)
                    {
                    System.out.print(num[k]+" ") ;// combining the all pairs;
                }
                System.out.println();
            }
        }
        System.out.println("Sub array printed");
    }
        
}
    

