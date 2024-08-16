// rotate an array 90 degree in clockwise without using extra space
import java.util.*;

public class TwoDArrays3 {
    static void printArray(int[][]matrix){
        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
    static void transposeInPlace(int[][]matrix,int n){
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    static void reverseArray(int[]arr){
        int i =0,j= arr.length-1;
        while(i<j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][]matrix, int n){
        transposeInPlace(matrix,n);
        for(int i=0; i<n; i++){
            reverseArray(matrix[i]);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row and column of matrix 1 :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("enter matrix values:");
        for(int i = 0; i <  r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("original matrix is:");
        printArray(matrix);
        
        
        
        rotate(matrix,r);
        System.out.println("rotated matrix is:");
        printArray(matrix);
    }    
}
