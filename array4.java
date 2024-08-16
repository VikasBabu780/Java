// reversing array without creating another array

import java.util.*;

public class array4 {
    static void swapInArray(int arr[],int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reversearray(int[] arr){
        int i =0 , j =arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }

    }

    static void printArray(int[] arr){
        for(int i = 0;i<arr.length; i++){
           System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter teh size of array:");
        int n = sc.nextInt();
         
        int arr[] = new int[n];
        System.out.println("enter the elements of array:");
        for(int i =0 ; i< n; i++){
            arr[i] = sc.nextInt();
        }

        reversearray(arr);
        printArray(arr);
    }
}
