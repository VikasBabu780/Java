//sorting of 0,1  approach

import java.util.*;

public class array9 {
    static void printArray(int[] arr){
        for(int i = 0;i<arr.length; i++){
           System.out.print(arr[i] +" ");
        }
        System.out.println();
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
        int count = 0;
        for(int i=0 ; i<arr.length; i++){
            if (arr[i] == 0) {
                count++;
                
            }
        }
        for(int i =0; i<count; i++){
            arr[i] = 0;
        }
        for(int i =count; i<arr.length; i++){
            arr[i]= 1;
        }

       printArray(arr);
    }
    
}
