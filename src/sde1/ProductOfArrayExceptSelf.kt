package sde1

/*Given an integer array nums, return an array output such that
output[i] is equal to the product of all the elements of nums except nums[i],
without using division, and in O(n) time.

Input:  nums = [1, 2, 3, 4]
Output:        [24, 12, 8, 6]

Explanation:
- output[0] = 2 * 3 * 4 = 24
- output[1] = 1 * 3 * 4 = 12
- output[2] = 1 * 2 * 4 = 8
- output[3] = 1 * 2 * 3 = 6*/

fun main(){

    val nums = intArrayOf(1, 2, 3, 4)
    println("Product Array: ${productOfArrayOfExceptSelf(nums).contentToString()}")

}

fun productOfArrayOfExceptSelf(nums: IntArray): IntArray {
    val n = nums.size
    var result = IntArray(n)
    result[0] = 1

    // Prefix product
    for (i in 1 until n){
        result[i] = result[i - 1] * nums[i -1]
    }

    var suffix = 1
    // Suffix product
    for (i in n - 1 downTo 0){
        result[i] *= suffix
        suffix *= nums[i]
    }

    return result
}
