package sde1.java;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Given an integer array nums, return an array output such that
output[i] is equal to the product of all the elements of nums except nums[i],
without using division, and in O(n) time.

Input:  nums = [1, 2, 3, 4]
Output:        [24, 12, 8, 6]

Explanation:
- output[0] = 2 * 3 * 4 = 24
- output[1] = 1 * 3 * 4 = 12
- output[2] = 1 * 2 * 4 = 8
- output[3] = 1 * 2 * 3 = 6*/

public class ProductOfArrayExceptSelf {

    public static void main(String[] args){

        int[] nums = {1, 2, 3, 4};
        System.out.println("Product Array: " + Arrays.toString(productOfArrayExceptSelf(nums)));

    }

    private static int[] productOfArrayExceptSelf(int[] nums){

        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;

        for (int i = 1; i < n; i++){
            result[i] = result[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n-1; i >= 0; i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;

    }

}
