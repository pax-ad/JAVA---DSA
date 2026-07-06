package Recursion;

public class FOccurence {
    
    //checking first occurence using recursion

    public static void main(String[] args){

        int [] nums = {8,3,6,9,5,10,2,5,3};
        System.out.println(Occurence(nums, 5,0));

    }

    public static int Occurence(int[] nums , int key,int i){
      
        if(nums[i] == key){
            return i;
        }
        if(nums[i] == nums.length-1){
            return -1;
        }
           
        return Occurence(nums, key,i+1);      
    }
    
    //last Occurence
    



    }
