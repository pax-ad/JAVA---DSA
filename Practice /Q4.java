public class Q4 {
    //two sum array 

    //leetcode number 1

    public static void main(String[] args) {
        int num[]={2,7,11,15};
        int target;
    
    }

    public static int Sum(int num[],int target){
        for(int i =0 ; i < num.length;i++){
            for(int j= i+1;j<num.length;j++){
                if(num[i]+num[j] == target){
                     System.out.print("["+i+","+j+"]");
                }
            }
            }

          return -1;
        }

    }

