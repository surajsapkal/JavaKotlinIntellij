package sde1.java;
import java.util.HashSet;
import java.util.Set;

/*Given an integer array nums, return true if any value appears at least twice in the array, and false if every element is distinct.
Input: nums = [1, 2, 3, 4]
Output: false

Input: nums = [1, 2, 3, 1]
Output: true*/

public class ContainsDuplicate {

    public static void main(String[] args){

        int[] intArr = {1, 2, 3, 1};
        System.out.println("Duplicate Contains: " + duplicateContains(intArr));

    }

    private static Boolean duplicateContains(int[] intArr){

        Set<Integer> see = new HashSet<>();

        for (int num : intArr){
            if (see.contains(num)) return true;
            see.add(num);
        }

        return false;

    }

}
