// reversing a array creating another array
import java.util.*;

public class array3 {
    static int[] reversearray(int[] arr){
        int n = arr.length;
       int [] ans = new int[n];
       int j =0;

       for(int i = n-1;i>=0; i--){
        ans[j] = arr[i];
        j++;

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
        System.out.println("enter the elements of array:");
        for(int i =0 ; i< n; i++){
            arr[i] = sc.nextInt();
        }
        
        int [] ans = reversearray(arr);
        printArray(ans);
        
      }
    
}
