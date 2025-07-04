package sde1.java;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    /*You’re given an array of integers and a target. Find two distinct indices whose values add up to the target.
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    So answer = [0, 1]*/

    public static void main(String[] args){

        int[] intArr = {6,3,4};
        int target = 10;

        System.out.println("Indices: " + Arrays.toString(twoSum(intArr,target)));

    }

    private static int[] twoSum(int[] intArr, int target) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < intArr.length; i++){
            int comp = target - intArr[i];
            if (hashMap.containsKey(comp)){
                return new int[] {hashMap.get(comp),i};
            }
            hashMap.put(intArr[i],i);
        }

        return new int[] {-1, -1};

    }

}
