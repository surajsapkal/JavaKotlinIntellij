package sde1.java;

public class ReverseNumber {

    public static void main(String[] args){

        int n = 1234;
        System.out.println("Reversed Number: " + reverseNumber(n));

    }

    private static int reverseNumber(int n){

        int revNum = 0;
        while (n != 0){
            int rem = n % 10;

            revNum = revNum * 10 + rem;

            n /= 10;
        }

        return revNum;
    }

}
