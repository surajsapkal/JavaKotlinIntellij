
/*Find the Index of Target in a Sorted Array (Binary Search)

Question: Given a sorted array and a target value, return the index of the target using binary search.

Example:
📌 Input: arr = [1, 3, 5, 7, 9], target = 5
📌 Output: 2*/

fun main(){

    val intArr = intArrayOf(1,2,3,4,5,6)
    val target = 4

    // Using Iterative Binary Search
    // Time Complexity O(logN) / Space Complexity O(1)
    println("Index of target: ${binarySearch(intArr,target)}")

    // Using Recursive Binary Search
    // Time Complexity O(logN) / Space Complexity O(logN) due to recursion
    println("Index of target: ${recursiveBinarySearch(intArr,target,0,intArr.size -1)}")
}


fun binarySearch(intArr: IntArray, target: Int): Int {

    var left = 0
    var right = intArr.size - 1

    while (left <= right){

        var mid = (left + right) / 2

        if (intArr[mid] == target) return mid

        if (intArr[mid] < target){
            left = mid + 1
        }else{
            right = mid - 1
        }
    }

    return -1
}

fun recursiveBinarySearch(intArr: IntArray, target: Int, left: Int, right: Int): Int {

    if (left > right) return -1
    val mid = (left + right) / 2

    return when{
        intArr[mid] == target -> mid
        intArr[mid] < target -> recursiveBinarySearch(intArr,target, mid + 1, right)
        else -> recursiveBinarySearch(intArr,target,left,right - 1)
    }
}