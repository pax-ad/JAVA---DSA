// this programme is only for square (n=m)
package TwoDarray;

public class Diagonal{

public static  void main(String args[]){
    int matrix[] [] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};

        System.out.println("the sum of the Diagonals are : " + DiagonalSum(matrix));
                            System.out.println("the sum of the Diagonals are : " + DiaSum(matrix));
}

//for matrix with even dimensions
public static int DiagonalSum(int matrix[][]){

    int sum = 0;

    for(int i = 0; i < matrix.length ; i ++){
        for(int j = 0;j < matrix[0].length ;j++)//covers all the columns
        {
                //primary diagonal
            if(i==j){
                sum += matrix[i][j];
            }
                //secondary diagonal
            else if(i+j == matrix.length-1) {
                sum += matrix[i][j];
            }   

        }
        
    }
    return sum;

}

//for better time complexity : O(n)
public static int DiaSum(int matrix [][]){

    int sum = 0;

    for (int i = 0 ; i < matrix.length ; i ++){
        //pd
        sum += matrix[i][i];
        //sd
        if(i != matrix.length-1-i); //when i is not equal to j here
        sum+=matrix[i][matrix.length-i-1];
    }

    return sum;

}

}