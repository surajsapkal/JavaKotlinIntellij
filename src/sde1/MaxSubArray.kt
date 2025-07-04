package sde1

/*Given an integer array nums, find the contiguous subArray (containing at least one number)
which has the largest sum and return its sum.
Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
SubArray: [4, -1, 2, 1] → Sum = 6 (this is the best path)*/

fun main() {

    val arr = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)

    println("Max SubArray: ${maxSubArray(arr)}")

}


private fun maxSubArray(intArr: IntArray): Int {

    var currentSum = intArr[0]
    var maxSum = intArr[0]

    for (i in 1..< intArr.size){
        currentSum = maxOf(intArr[i], currentSum + intArr[i])
        maxSum = maxOf(maxSum,currentSum)
    }

    return maxSum
}