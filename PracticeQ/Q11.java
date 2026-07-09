package PracticeQ;

public class Q11 {
    //checking array is sorted or not

    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        Sorted(num);
    }

    public static void Sorted(int num[]){
        for(int i = 0; i < num.length;i++){
            for(int j = i + 1 ; j <=num.length-1;j++){
                if(num[i]<num[j]){
                    System.out.println("array is  sorted");
                }
            }
        }
    }
    
}
