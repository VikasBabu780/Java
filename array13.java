//prefix sum or running sum array

import java.util.*;

public class array13 {
    static void printArray(int[] arr){
        for(int i = 0;i<arr.length; i++){
           System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[]arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0]= arr[0];

        for(int i =1; i<n; i++){
            pref[i] = pref[i-1]+arr[i];

        }
        return pref;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array:");
        int n= sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the " +n+ " elements:");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] pref = makePrefixSumArray(arr);
        printArray(pref);

    }
    
}
