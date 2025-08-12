package sde1.java;

import java.util.Stack;

public class SortString {

    public static void main(String[] args){

        String str = "edcba";
        sortedString(str);

    }

    private static void sortedString(String str){

        Stack<Character> stack = new Stack<>();
        Stack<Character> tempStack = new Stack<>();

        // append first character
        stack.push(str.charAt(0));

        for (int i = 1; i < str.length(); i++){
            int a = str.charAt(i);
            int b = (int)((char)stack.peek());

            // if greater or equal add to stack
            if ((a - b) >= 1 || a == b){
                stack.push(str.charAt(i));
            }else if ((b - a) >= 1){ // if small then add to tempStack
                // push all greater elements
                while ((b - a) >= 1){
                    // push
                    tempStack.push(stack.peek());
                    stack.pop();

                    // push till stack is not empty
                    if (!stack.isEmpty()){
                        b = (int)((char)stack.peek());
                    }else {
                        break;
                    }
                }

                // push i-th character to stack
                stack.push(str.charAt(i));

                // push tempStack back to stack
                while (!tempStack.isEmpty()){
                    stack.push(tempStack.peek());
                    tempStack.pop();
                }
            }
        }

        // print stack in reverse order
        String ans = "";
        while (!stack.isEmpty()){
            ans = stack.peek() + ans;
            stack.pop();
        }
        System.out.println(ans);

    }

}
