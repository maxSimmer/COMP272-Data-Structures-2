import java.lang.reflect.Array;
import java.util.Arrays;

public class sortingInClass {
 
    // initalize array
    
    // sort array

    // create counter and intialize to 0

    // loop through array
    // update counter everytime a NEW value appears

    /** Input: [7, 4, 1, 6, 7, 1]
    
    Output: 4  */

    public static int numUnique (int [] nums) {

        Arrays.sort(nums);
        int count = 0;

        for (int x = 0; x >= nums.length - 2; x++ ){
            if (nums[x] != nums[x+1]) {
                count++;
            }
        }
        return count;
    }

    public static int minDiff(int[] nums) {
        
        Arrays.sort(nums);
        int difference = 0;
        int difference1;
        for (int i = 1; i < nums.length-2; i++) {
            difference1 = Math.abs(nums[i], - nums[i+1]);
            difference = Math.min(difference, difference1);
        }

        return difference;
        
    }

    public static int minSum (int[] nums) {
        int[] array = {8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(nums);
        int n1;
        int n2;
        int minSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 4, 1, 6, 7, 1};
        System.out.println("Number of unique elements: " + numUnique(arr1));

        int[] arr2 = {1, 19, -4, 31, 38, 25, 100};
        System.out.println("Minimum difference: " + minDiff(arr2));

        int[] arr3 = {6, 8, 4, 5, 2, 3};
        System.out.println("Minimum sum: " + minSum(arr3)); 

    }
    
    
}
