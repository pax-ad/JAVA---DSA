package DivandConq;

public class mergesort {
    
 // merge sort 
    public static void main(String[] args) {
        int num[]= {6,3,9,5,2,8};
        mergeSort(num, 0, num.length-1);
        PrintArr(num);


    }


    public static void mergeSort(int num[],int si,int ei){
        if(si >= ei){
            return; //base case
        }

        //working
        int mid = (si + ei)/2 ;
        mergeSort(num, si, mid); //recursive call to solve the left part
        mergeSort(num, mid+1, ei); //for right part
        merge(num,si,mid,ei); //for merging
    }

    //merigng the array
    public static void merge(int num[],int si,int mid,int ei){
        int temp[] = new int[ei -si + 1]; //auxilary array

        //we are making iterators
        int i = si; //left
        int j = mid +1; //right 
        int k = 0 ; //for our temp

        while(i<=mid && j<=ei){
            if(num[i] <= num[j])
                // = ensure that duplicate variable sustain their positions.
            {
                temp[k]= num[i];
                i++;
            }
            else{
                temp[k]=num[j];
                j++;
            }
            k++;
        }    
            //left part
            while(i<=mid){
                temp [k++] = num[i++];
            }

            //right part
            while(j<=ei){
                temp[k++] = num [j++];
            }

            //copy temp to original array
            for(k=0,i= si; k< temp.length; k++,i++){
                num[i] = temp [k] ;
            }
        }

        public static void PrintArr(int num[]){
            for(int i = 0 ; i < num.length ; i++){
                System.out.println(num[i]+ " ");
            }
            System.out.println();
        }
        


}
