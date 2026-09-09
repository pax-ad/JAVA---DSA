package Arrays;

public class MaxSubarray {
    // approach : with concept of max and min integer value
    
    public static void main(String[] args) {
        int[] num = {10, -20, 30, 40, -10, 50};
        Subarray(num);
    }

    public static void Subarray(int[] num) {
        int maxSum = Integer.MIN_VALUE, start = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) sum += num[k];

                if (sum > maxSum) {
                    maxSum = sum;
                    start = i;
                }
            }
        }

        System.out.print("Max Subarray: [ ");
        for (int sum = 0, k = start; sum != maxSum; k++) {
            sum += num[k];
            System.out.print(num[k] + " ");
        }
        System.out.println("]\nMax Sum: " + maxSum);
    }
}

