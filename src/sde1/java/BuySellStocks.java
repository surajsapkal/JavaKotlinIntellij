package sde1.java;

/*You are given an array prices where prices[i] is the price of a stock on day i.
You must find the maximum profit you can achieve by buying on one day and selling on another later day.
You can only buy once and sell once.
Input: prices = [7,1,5,3,6,4]
Output: 5 // Buy on day 2 (price=1), sell on day 5 (price=6)*/

import java.util.Arrays;

public class BuySellStocks {

    /*public static void main(String[] args){

        int[] prices = {7,1,5,3,6,4};
        System.out.println("Max Profit: " + buySellStockMaxProfit(prices));
    }

    private static int buySellStockMaxProfit(int[] prices){

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices){
            if (price < minPrice){
                minPrice = price;
            }else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;

    }*/

    public static void main(String[] args){

        int[] nums = {7,1,5,3,6,4};

        System.out.println("BuySell Profit: " + buySellMaxProfit(nums));

    }

    private static int buySellMaxProfit(int[] prices){

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices){
            if (price < minPrice){
                minPrice = price;
            }else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;

    }

}
