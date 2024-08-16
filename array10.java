//sorting two pointer methods

import java.util.Scanner;

public class array10 {
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

    static void sortZerosAndOnes(int arr[]){
        int n = arr.length;

        int left =0,right =n-1;
        while(left<right){
            if(arr[left] == 1 && arr[right] ==0){
                swapInArray(arr,left,right);
                left++;
                right--;

            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the "+n+" elements:");
        for(int i =0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        sortZerosAndOnes(arr);
       printArray(arr);
        
    }
    
}
