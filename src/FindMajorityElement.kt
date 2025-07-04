/*
Find the Majority Element

Question: Given an array of size N, find the element that appears more than N/2 times.

Example:
📌 Input: [3, 3, 4, 2, 3, 3, 3]
📌 Output: 3*/

fun main(){

    val intArr = intArrayOf(1,2,5,2,2,5,5,2,2)

    // Using HashMap
    // Time Complexity O(N) / Space Complexity O(N)
    println("Majority Element: ${majorityElement(intArr)}")

    // Using Boyer-Moore Algorithm
    // Time Complexity O(N) / Space Complexity O(1)
    println("Majority Element: ${majorityElementAlgo(intArr)}")
}


fun majorityElement(intArr: IntArray): Int {
    val map = hashMapOf<Int,Int>()

    for (num in intArr){
        map[num] = map.getOrDefault(num,0) + 1
        if (intArr[num] > intArr.size / 2) return num
    }

    return -1
}

fun majorityElementAlgo(intArr: IntArray): Int{

    var candidate = 0
    var count = 0

    for (num in intArr){
        if (count == 0){
            candidate = num
        }
        count += if (num == candidate) 1 else -1
    }

    return  candidate
}