package Arrays;

public class Linear {
    public static void main(String[] args){
        int [] numbers = {9,4,5,8,2,7,1};
        LINEAR(numbers, 2);
       
    }

    //linear approach
    public static void LINEAR(int[] numbers,int key) { // be carful while writing key is not an array
        boolean found = false;

        //iterating through loop
        for(int i = 0; i < numbers.length;i++){
            if(numbers[i]==  key){
                System.out.println("Your Key is at index: " + i);
                found =true;
                break;
            }
        }

        if(!found){ //can't write else over here , since it then belongs to condition numbers[i]== key which shows key is found but our else shows key is not found printing many time.
            System.out.println("Key is not found!");
        }

    }

}

