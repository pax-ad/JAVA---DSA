package TwoDarray;

public class SpiralMatrix {
    
    public static  void main(String [ ] args){
        int matrix[] [] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
                            
        printSpiral(matrix);                    
    }

    public static void printSpiral(int matrix[][]){
        int startRow = 0 ;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1; //second array or second dimension ( m x n) ki bhasha mein ya toh m ke ya n ke 
    
            while (startRow <= endRow && startCol<= endCol) 
                {
                    //top boundary
                    for(int j = startCol;j<=endCol;j++){
                        System.out.println(matrix[startRow][j]+ " ");
                    }

                    //right
                    for(int i = startRow; i <=endRow;i++){
                        System.out.println(matrix[i][endCol]+ " ");
                    }

                    //bottom
                    for(int j = endCol-1; j >=startCol;j--){
                        if(startRow == endRow){
                           break; // odd like 3x3 matrix mein center element miss ho sakta hai ya double bar print ho sakta hia isliye ye use kiya hia
                        }

                        System.out.println(matrix[endRow][j]+" ");
                    }

                    //left
                    for(int i = endRow-1;i>=startRow; i--){
                        if(startCol == endCol){
                           break; // odd like 3x3 matrix mein center element miss ho sakta hai ya double bar print ho sakta hia isliye ye use kiya hia
                        }
                        System.out.println(matrix[i][startCol]+ " ");
                    }

                    startCol++;
                    startRow++;
                    endCol--;
                    endRow--;
                
            }
            
            
           System.out.println();
    
    
    }
}
