package Practice;
public class Q4 {
    //two sum array 

    //leetcode number 1

    public static void main(String[] args) {
        int num[]={2,7,11,15};
        int key ;
        Sum(num,9);
    
    }

   public static void Sum(int [] num , int key){
    for(int i = 0 ; i < num.length ; i++){
        for(int j = i+1 ; j < num.length ; j++){
            if(num[i] + num [j] == key){
                System.err.println( "[" + i + "," + j + "]" );
            }
        }
    }
   }
    }

