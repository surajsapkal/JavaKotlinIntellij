package sde1.java;

import java.util.Arrays;

public class RunningArray {

    public static void main(String[] args){

        int[] nums = {2, 5, 3, 8};
        System.out.println("Running Arrays: " + Arrays.toString(runningArray(nums)));

    }

    private static int[] runningArray(int[] nums){

        for (int i = 0; i < nums.length-1; i++){
            nums[i+1] = nums[i] + nums[i+1];
        }

        return nums;

    }

}
