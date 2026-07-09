package Practice;

public class Q6 {
    
    //printing max subarray sum

    public static void main(String[] args) {
        int [] num = {1,-2,6,-1,3};
        maxSub(num);

    }

    public static void maxSub(int num[]){
        int cs = 0 ;
        int ms = Integer.MIN_VALUE;
        int prefix []= new int[num.length];
        prefix[0] = num[0];

        //calulating the prefix array
        for(int i = 1; i < num.length ; i++){
            prefix[i] = prefix[i-1]+ num[i];
        }

        for(int i =0 ; i < num.length ; i++){
            int start = i;
            for(int j = i ; j < num.length ; j++){
                int end =j ;

                //most cruical line 
               // cs = start == 0 ? prefix[end]:prefix[end] - prefix[start-1];
               if(start ==0){
                cs=prefix[end]; //when we are starting the cs is same as the element.
               }
               else{
                cs = prefix[end] - prefix[start-1];
               }
            }

            if(cs>ms){
                ms=cs; //for chanigng our max 
            }

        }
        System.out.println("Max sum is : " + ms);
    }
}
