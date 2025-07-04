package sde1

/*You are given an array prices where prices[i] is the price of a stock on day i.
You must find the maximum profit you can achieve by buying on one day and selling on another later day.
You can only buy once and sell once.
Input: prices = [7,1,5,3,6,4]
Output: 5 // Buy on day 2 (price=1), sell on day 5 (price=6)*/

fun main() {

    val intArr = intArrayOf(7,1,5,3,6,4)
    println("Max Profit: ${buySellStockMaxProfit(intArr)}")

}

private fun buySellStockMaxProfit(prices: IntArray): Int {

    var minPrice = prices[0]
    var maxProfit = 0

    for (price in prices){
        if (price < minPrice){
            minPrice = price
        }else{
            maxProfit = maxOf(maxProfit, price - minPrice)
        }
    }

    return maxProfit

}