package TwoDarray;

public class SortedMatrix {
    public static void main (String [] args){
          int matrix[][] = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};
           

          Search(matrix,30);
          Bsearch(matrix, 30);
          Staircase(matrix, 80);
    }


    // brute force Time : O(n^2)
    public static int Search(int matrix[][],int key){
     
       
        for (int i = 0 ; i < matrix.length ; i++){
            for(int j = 0; j< matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("Founde at index " + i + "," + j);
                    // returning the index;
                }
            }
        }
        return -1; //key not found
    }

    //bineary search approach Time :O(logn)
  public static int Bsearch(int[][] matrix, int key) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Convert 1D index to 2D indices
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == key) {
                
                System.out.println("found at: " + row + "," + col);
             
            } else if (matrix[row][col] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    // stair case approach Time complexity :O(n)

    public static boolean Staircase(int matrix[][],int key){
        int row = 0,col = matrix[0].length-1; //corner ka upper wala box

        while(row < matrix.length && col >= 0){
            if (matrix[row][col] == key){
               if(matrix[row][col] == key){
                System.out.println("Found at (" + row + ", " + col + ")"); // i wrote this System.out.println("found at: " + row + "," + col);
                return true; // yaha SOP mein jo likha hai wo clear nahi tha uski wajah se endless loop lag gaya tha
                } 
            }

            else if(key < matrix[row][col]){
                col-- ; 
            }
            else{
                row++;
            }
        }
        System.out.println("key not FOund!");
        return false;
    }


    
}
