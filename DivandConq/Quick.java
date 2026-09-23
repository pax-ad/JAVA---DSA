package DivandConq;

public class Quick {
    
    //Quick sort 

    public static void main(String args[]){
        int arr [] = {6,3,9,8,2,5};
        quicksort(arr, 0, arr.length-1);
        Printarr(arr);
        
    }

    public static void quicksort(int arr[], int si, int ei){
        if(si >= ei){
            return; //base case
        }

        //last element - piviot point
        int pIdx = partition(arr,si,ei);
        quicksort(arr, si, pIdx -1 ); //left
        quicksort(arr, pIdx + 1 , ei); //right

    }

       public static int  partition(int arr [], int si ,int ei ){
            int pivot = arr[ei];
            int i = si -1 ; //to make place for elements smaler than pivot

            for(int j = si; j <ei ; j ++){
                if(arr[j] <= pivot){
                    i ++ ; 
                    //swap
                    int temp = arr[j];
                    arr[j] = arr [i];
                    arr[i] = temp;

                }
            }
                i++ ;
                int temp = pivot ;
                arr[ei] = arr[i]; //pivot =arr[i] don't do this. 
                arr[i] = temp ;
                return i ;
            
        }

        public static void Printarr(int arr[]){
            for(int i = 0 ; i < arr.length ; i ++){
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }

        //be careful with worst case imp when pivot is always the smallestor the largest element.
    }

