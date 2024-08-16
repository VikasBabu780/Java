// print a matrix of n*n in spiral order
import java.util.*;

public class TwoDArrays6 {
    static void printMatrix(int[][] matrix){
        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] printMatrixSpiral(int n){
        int topRow =0,leftCol =0,bottomRow = n-1, rightCol = n-1;
        int matrix[][] = new int[n][n];
        
        int count =1;
        while(count <= n*n){
            for(int j =leftCol; j<= rightCol && count <= n*n; j++){
                matrix[topRow][j] = count;
                count++;
            }
            topRow++;

            for(int i =topRow; i<=bottomRow && count <= n*n; i++){
                matrix[i][rightCol] = count;
                count++;
            }
             rightCol--;

            for(int j = rightCol; j>= leftCol && count <= n*n; j--){
                matrix[bottomRow][j] = count;
                count++;

            }
            bottomRow--;

            for(int i = bottomRow; i>= topRow && count <= n*n; i--){
                matrix[i][leftCol] = count;
                count++;
            }
            leftCol++;
        }
        return matrix;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();

        int matrix[][] = printMatrixSpiral(n);
        printMatrix(matrix);
        
    }
    
}
