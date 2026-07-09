package Practice;
public class Q5 {
    
    //printing sub array


    public static void main(String[] args) {
        int num[]={-2,1,-3,4,-1,2,1,-5,4};
    Subarray(num);
    }

    public static  void Subarray(int num[]){
        for (int i = 0; i < num.length; i++) // iterate for the first elemnt
         {int start = i;
            for(int j = i; j < num.length; j++) //making pairs
            { int end = j;
                for(int k = i; k <= end; k++)
                    {
                    System.out.print(num[k]+" ") ;// combining the all pairs;
                }
                System.out.println();
            }
        }
        System.out.println("Sub array printed");
    }
        
}
    

