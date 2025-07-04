package sde1.java;

import java.util.Arrays;

/*Move Zeros (FAANG)

You’re given an array. Move all the zeroes to the end while keeping the order of the non-zero elements the same.

Input:  [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]*/

public class MoveZeros {

    public static void main(String[] args){

        int[] intArr = {0,1,0,3,12};
        moveZeros(intArr);
        System.out.println("Move Zeros: " + Arrays.toString(intArr));

    }

    private static void moveZeros(int[] intArr){

        int insertPos = 0;

        for (int num : intArr){
            if (num != 0){
                intArr[insertPos] = num;
                insertPos++;
            }
        }

        for (int i = insertPos; i < intArr.length; i++){
            intArr[i] = 0;
        }

    }

}
