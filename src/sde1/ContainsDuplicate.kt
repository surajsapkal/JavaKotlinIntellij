package sde1

/*Given an integer array nums, return true if any value appears at least twice in the array, and false if every element is distinct.
Input: nums = [1, 2, 3, 4]
Output: false

Input: nums = [1, 2, 3, 1]
Output: true*/

fun main(){

    val intArr = intArrayOf(1, 2, 3, 4,1)
    println("Contains Duplicate: ${containsDuplicate(intArr)}")

}

private fun containsDuplicate(intArr: IntArray): Boolean{

    val seen = mutableSetOf<Int>()

    for (num in intArr){
        if (seen.contains(num)) return true
        seen.add(num)
    }

    return false

}