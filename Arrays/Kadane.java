package Arrays;

public class Kadane {

    public static void kadane(int num[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < num.length; i++) {
        currSum += num[i];

        if (currSum > maxSum) {
            maxSum = currSum;
        }

        if (currSum < 0) {
            currSum = 0;
        }
    }

    System.out.println("Maximum subarray sum is: " + maxSum);
}
    
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        kadane(num);
    }
}
