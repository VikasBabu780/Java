// print sum from l to r
import java.util.*;

public class array14 {
    static int[] PrefixSum(int[]arr){
        for(int i =1; i<arr.length; i++){
            arr[i] += arr[i-1];

        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array:");
        int n = sc .nextInt();

        int arr[] = new int[n+1];
        System.out.println("enter the "+n + " elements");
        for(int i =1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the number of quarries to to asked:");
        int q = sc .nextInt(); 

        int[] PrefixSum = PrefixSum(arr);

        while(q-- > 0){
            System.out.println("enter range:");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = PrefixSum[r]  - PrefixSum[l-1];
            System.out.println("Sum :"+ ans);
          
        }

    }
    
}
