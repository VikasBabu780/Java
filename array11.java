// sorting even and odd
import java.util.*;

public class array11 {
    static void swapInArray(int arr[],int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr){
        for(int i = 0;i<arr.length; i++){
           System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    static void sortEvenOdd(int arr[]){
        int n = arr.length;

        int left = 0, right =n-1;
        while(left<right){
            if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
                 swapInArray( arr ,left, right);
                 left++;
                 right--;
            }
            if(arr[left] % 2 == 0){
                left++;

            }
            if(arr[right] % 2 != 0){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array:");
        int n = sc.nextInt();
        
        System.out.println("enter the " + " elements:");
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        sortEvenOdd(arr);
        printArray(arr);
        
    }
    
}
