//to print suare of array in non dcreasing order

import java.util.*;

public class array12 {
    static int[] sortSquares(int[] arr){
        int n= arr.length;
        int left =0, right = n-1;
        int [] ans = new int[n];
        int k=0;

        while(left <= right ){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    static void printArray(int[] arr){
        for(int i = 0;i<arr.length; i++){
           System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    static void swapInArray(int arr[],int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[]arr){
        int n = arr.length;
        int left=0, right = n-1;
        while(right> left){
            swapInArray(arr,left,right);
            left++;
            right--;
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
        int[] ans = sortSquares(arr);
        reverse(ans);
        printArray(ans);
    }
}
