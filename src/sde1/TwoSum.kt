package sde1

/*Two Sum (Amazon, Google, Microsoft)

Question: Given an array of integers nums and an integer target, return the indices of the two numbers that add up to target.
Example:

📌 Input: nums = [2, 7, 11, 15], target = 9
📌 Output: [0,1]*/

fun main(){

    val intArr = intArrayOf(6,3,4)
    val target = 10

    // Using HashMap
    // Time Complexity O(N) / Space Complexity O(N)
    println("Indices: ${twoSum(intArr,target).joinToString(",")}")

    // Using Two Pointer (if array is already sorted)
    println("Indices: ${twoSum2(intArr,target).joinToString(",")}")

}


fun twoSum(intArray: IntArray,target: Int): IntArray {

    val map = hashMapOf<Int,Int>()

    for (i in intArray.indices){
        val complement = target - intArray[i]
        if (map.containsKey(complement)) return intArrayOf(map[complement]!!,i)
        map[intArray[i]] = i
    }

    return intArrayOf(-1,-1)
}

fun twoSum2(intArray: IntArray, target: Int): IntArray {

    var left = 0
    var right = intArray.size - 1

    while (left < right){
        val sum = intArray[left] + intArray[right]
        when{
            sum == target -> return intArrayOf(left,right)
            sum > target -> left++
            else -> right--
        }
    }

    return intArrayOf(-1,-1)
}