package sde1.java;

public class SwapTwoNum {

    public static void main(String[] args){

        int a = 2;
        int b = 4;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swap Nums: a=" + a + " b=" + b);

    }

}
