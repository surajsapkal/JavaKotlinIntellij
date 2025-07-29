package sde1.java;

import java.util.Stack;

public class DecodeString {

    /*Input:  s = "3[a2[c]]"
    Output: "accaccacc"

    Input:  s = "3[a]2[bc]"
    Output: "aaabcbc"*/

    public static void main(String[] args){

        String str = "3[b]2[ac]";
        System.out.println("Decoded String: " + decode(str));

    }

    private static String decode(String string){

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int index = 0;

        while (index < string.length()){

            char ch = string.charAt(index);

            if (Character.isDigit(ch)){

                int count = 0;
                while (Character.isDigit(string.charAt(index))){
                    count = count * 10 + (string.charAt(index) - '0');
                    index ++;
                }
                countStack.push(count);

            } else if (ch == '[') {

                resultStack.push(current);
                current = new StringBuilder();
                index ++;

            } else if (ch == ']') {

                StringBuilder decoded = resultStack.pop();
                int repeat = countStack.pop();

                for (int i = 0; i < repeat; i++){
                    decoded.append(current);
                }
                current = decoded;
                index ++;

            }else{
                current.append(ch);
                index ++;
            }

        }

        return current.toString();

    }

}
