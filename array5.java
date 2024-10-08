// rotating an array with using extra space

import java.util.*;

public class array5 {
    static int[] rotate(int[] arr, int k){
        int n= arr.length;
        k = k%n;
        int [] ans = new int[n];
        int j =0;

        for(int i =n-k; i<n; i++ ){
            ans[j++] = arr[i];

        }
        for(int i =0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
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
        System.out.print("enter the elements of array:");
        for(int i =0 ; i< n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("enter k:");
        int k = sc.nextInt();

        int[] ans = rotate(arr,k);
        System.out.println("array after rotation");
        printArray(ans);
    }
}
