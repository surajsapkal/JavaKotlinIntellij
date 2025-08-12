package sde1.java;

import java.util.HashMap;

public class FirstNonRepeatingChar {

    public static void main(String[] args){

        String string = "aabbcdde";
        System.out.println("Non Repeating Char: " + nonRepeatingChar(string));

    }

    private static char nonRepeatingChar(String string){

        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] chaArr = string.toCharArray();

        for (char c : chaArr){
            hashMap.put(c,hashMap.getOrDefault(c,0) + 1);
        }

        for (char c : chaArr){
            if (hashMap.get(c) == 1){
                return c;
            }
        }

        return '_';

    }

}
