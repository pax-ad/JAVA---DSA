package Practice;

public class Q1 {
    //programme for reversing a array in place

    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        reverse(num);
    }

    public static void reverse(int[] num){
        int start = 0;
        int last = num.length-1;
        while(start<last){
            int temp = num[last];
            num[last] = num[start];
            num[start] =temp;
            start++;
            last--;
        }
    }
    
    }

