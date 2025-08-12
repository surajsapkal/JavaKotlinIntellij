package sde1.java;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args){

        String string = "suraj";
        System.out.println("Reversed String: " + reverseString(string));

    }

    private static String reverseString(String string){

        char[] arr = string.toCharArray();

        int left = 0;
        int right= string.length()-1;

         while (left < right){
             char temp = arr[left];
             arr[left++] = arr[right];
             arr[right--] = temp;
         }

         return Arrays.toString(arr);

    }

}
