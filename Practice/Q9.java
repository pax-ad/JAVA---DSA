package Practice;

public class Q9 {
    //linear search

    public static void main(String[] args) {
        int num[]= {2,3,4,5,6,};
        Linear(num,6);
    }

    public static int Linear(int [] num,int key ){
        for(int i = 0 ; i < num.length ; i++){
            if(key == num[i]){
                System.out.println("Found key at index : " + i);
            }
            
    }
    return -1;
    }

}
