package sde1.java;

/*Given an integer array nums, find the contiguous subArray (containing at least one number)
which has the largest sum and return its sum.
Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
SubArray: [4, -1, 2, 1] → Sum = 6 (this is the best path)*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxSubArray {

    public static void main(String[] args){

        int[] intArr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Max SubArray: " + maxSubArray(intArr));

    }

    private static int maxSubArray(int[] intArr){

        int currentSum = intArr[0];
        int maxSum = intArr[0];

        for(int i = 1; i < intArr.length; i++){

            currentSum = Math.max(intArr[i], currentSum + intArr[i]);
            maxSum = Math.max(maxSum,currentSum);

        }

        return maxSum;

    }

}
