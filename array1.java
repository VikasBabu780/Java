
import java.util.*;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("enter the length of array:");
        int n= sc.nextInt();

        int nums[] = new int[n];

        System.out.println("enter the " + n+ " elements:");
        for(int i =0 ; i< nums.length; i++){
            nums[i] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                nums[i] = Integer.MIN_VALUE;    
            }
        }

        for(int i =0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                
            }
        }
        System.out.println(max);

    }
    
}
