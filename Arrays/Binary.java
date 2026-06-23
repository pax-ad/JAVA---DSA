package Arrays;

public class Binary {
    public static void main(String[] args){
        int num []={2,4,6,8,9,10,12};
        
        System.out.println("Your key is at index: " + BinarySearch(num, 10));

    }

    public static int BinarySearch(int[] num,int key){
        int start = 0, end = num.length -1; // we talking about the index
        
            while(start<=end){
                int mid = (start + end ) / 2 ;
            
            if (num[mid] == key) {
                    return mid;
            }
             if( num[mid] < key){ //right
                start = mid + 1;
            }
            else {
                end = mid-1; // left
            }
        }        

        return -1;
    }
}
