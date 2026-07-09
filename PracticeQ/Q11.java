package PracticeQ;

public class Q11 {
    //checking array is sorted or not

    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        System.err.println(Sorted(num));
        System.out.println(Osorted(num));
    }

    public static boolean Sorted(int num[]){
        for(int i = 0; i < num.length;i++){
            for(int j = i + 1 ; j <=num.length-1;j++){
                if(num[i]<num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    //time compleaxity O(^2)
    
 //optimal way
 public static boolean Osorted(int num[]){
    //edge case array having single element is always sorted
     if (num == null || num.length <= 1) {
        return true;
    }


    for(int i = 0 ; i < num.length-1;i++){
        if(num[i]>num[i+1]){
            return false;
        }
    }
    return true; // edge case not covered in this bcz loop will treat it as null case.
 }
}
