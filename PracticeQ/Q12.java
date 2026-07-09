package PracticeQ;

public class Q12 {
    
    //counting odd or even number in array
    public static void main(String[] args) {
        int num[]= {1,2,3,4,5,6,7,8,9,10};
        EvenorODD(num);
    }

    public static void EvenorODD(int num[]){
        int countE = 0 ;
        int countO = 0 ;

        //edge case for 1
     
        for(int i = 0 ; i< num.length-1;i++){
            if(num[i]==1){
                System.out.println("nor even nor odd");
            }
            if(num[i]%2==0){
                countE ++;
            }
            else{
                countO ++;
            }
        }
        System.out.println(countE);
        System.out.println(countO);
    }
}
