package TwoDarray;

import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter 9 numbers (1-9):");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                int num = sc.nextInt();

                if (num >= 1 && num <= 9) {
                    arr[i][j] = num;
                } else {
                    System.out.println("Please enter a number between 1 and 9");
                    j--; // repeat the same position
                }
            }
        }

        System.out.println("\nMatrix:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
} 
