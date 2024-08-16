// q times quetions asked if number is present or not

import java.util.*;

public class array7 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of n:");
    int n = sc.nextInt();
     int arr[] = new int[n];

     System.out.println("enter the elements of array:");
     for(int i =0; i<arr.length; i++){
        arr[i] = sc.nextInt();
     }

     System.out.print("enter the value of q:");
     int q = sc.nextInt();
     while(q != 0 ){
        System.out.print("enter the number to be searchrd:");
        int number = sc.nextInt();
        for(int i=0; i< arr.length; i++){
            if(arr[i] == number){
                System.out.println("number is found at index " + i );
            } else{
                System.out.println("number is not found at index " + i);
            }
        }
        q--;
     }
  }
   
}
