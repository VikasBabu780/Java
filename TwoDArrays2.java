// transpose of a matrix
import java.util.*;

public class TwoDArrays2 {
    static void printArray(int[][]matrix){
        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
    static void transpose(int[][]mat,int rows, int cols){
        int tran[][] = new int[rows][cols];
        for(int j =0; j<cols; j++){
            for(int i =0; i<rows; i++){
                tran [i][j] = mat[j][i];
            }
        }
        System.out.println("transpose matrix is:");
        printArray(tran);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row and column of matrix 1 :");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];
        System.out.println("enter matrix values:");
        for(int i = 0; i <  rows; i++){
            for(int j = 0; j < cols; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("original matrix is:");
        printArray(a);
        transpose(a,rows,cols);
    }
}