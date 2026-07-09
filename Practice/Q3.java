package Practice;

public class Q3 {
 
    //finding the smallest element in an array


    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};
        System.out.print(Smallest(num));
    }

    public static int Smallest(int num[]){
        int Small = Integer.MAX_VALUE;
        for(int i = 0; i < num.length; i++){
            if(Small>num[i]){
          Small = num[i];
            }
            
    }
    return Small;
}
}
