public class Q6 {
    
    //printing max subarray sum

    public static void main(String[] args) {
        int [] num = {1,-2,6,-1,3};
        maxSub(num);

    }

    public static void maxSub(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [num.length];

        prefix[0] = num [0];

        //calulating the prefix array

        for(int i =1; i < prefix.length ; i ++) // Start loop from 1 to avoid prefix[-1] index crash,java mein 0 se index start hote hai
            {
            prefix [i] = prefix[i-1] + num[i];
        }

        for (int i = 0 ; i < num.length;i++){
            int start =i;
            for(int j =i ; j <num.length;j++){
                int end = j;
                currSum = start == 0? prefix[end]: prefix[end] - prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum " + maxSum);
    }
}
