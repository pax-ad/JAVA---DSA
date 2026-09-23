package DivandConq;

public class intro {
       // search in Rotated sorted array
       /*input : sorted related array with distinct number (in aascendign orders).IT is rotated at a pivot point.Find the index of given element.
       target = 0 
       output = 4
       linear search O(n)
       divide and Conquer n(logn) -> modified bineary search
       IMP there are lot's of cases in this Q you need to be vary of
       */


       /*visualize two lines both are having +ve slope , l1 and l2 .
       Our elements are on them half on l1 and remaining half on l2 or as per our mid
       then if mid lies on l1 then there are more two cases of where the mid is either on left side or right. 
       similar with the l2 */

       public static void main(String args[]){
              int arr [] = {4,5,6,7,0,1,2};
              int target = 0;
              int tarIdx = search(arr, target, 0, arr.length-1);
              System.out.println(tarIdx);
              
              
       }

       public static int search(int arr[], int tar, int si,int ei){
              //base case
              if(si>ei){
                     return -1;
              }

              //work
              int mid = si + (ei-si)/2;

              //case found
              if(arr[mid] == tar){
                     return mid;
              }

              //mid on l1
              if(arr[si] <= arr[mid]){
                     //case a : left
                     if(arr[si]<= tar && tar <= arr[mid]){
                            return search(arr,tar,si,mid);
                     }
                     else{
                            //case b :right
                           return search(arr,tar,mid+1,ei);
                     }
              }

              //mid on l2
              if(arr[mid] <=tar && tar<=arr[ei]){
                     return search(arr,tar,mid+1,ei);
              }
              else{
                     //case d: left
                     return search(arr, tar, si, mid+1);
              }
       }

       }

