import java.util.*;

public class array2 {
    static int firstRepeatingnum(int nums[]){
       
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return nums[i];
                    
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array:");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("enter the elements of array:");
        for(int i =0; i<nums.length; i++){
             nums[i] = sc.nextInt();
        }

    
        
        System.out.println("first repeating number is:"+ firstRepeatingnum(nums));
    }
}
