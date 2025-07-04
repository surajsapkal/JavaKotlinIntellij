
import jdk.internal.org.jline.utils.Colors.s

/*Reverse a String

Question: Reverse a given string.

Example:
📌 Input: "hello"
📌 Output: "olleh"*/

fun main(){
    val str = "suraj"

    // Using Reverse For loop
    // Time Complexity  O(N²) / Space Complexity O(N)
    println("Reversed String: "+reverseString(str))

    // Using Recursion
    // Time Complexity  O(N) / Space Complexity O(N)
    println("Reversed String: "+reverseString2(str))

    // Using Two Pointer
    // Time Complexity  O(N) / Space Complexity O(N)
    println("Reversed String: "+reverseString3(str))
}


fun reverseString(str: String): String {

    var revStr = ""

    for (i in str.length-1 downTo 0){
        revStr += str[i]
    }

    return revStr
}

fun reverseString2(str: String): String{
    if (str.isEmpty()) return str
    return  reverseString2(str.substring(1)) + str[0]
}

fun reverseString3(str: String): String{
    val arr: CharArray = str.toCharArray()
    var left = 0
    var right = arr.size - 1
    while (left < right) {
        val temp = arr[left]
        arr[left++] = arr[right]
        arr[right--] = temp
    }
    return String(arr)
}