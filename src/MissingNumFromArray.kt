
import javax.swing.text.html.HTML

/*Find the missing number in an array (1 to N)

Question: Given an array of size N-1 containing numbers from 1 to N with one missing number, find the missing number.

Example:
📌 Input: [1, 2, 4, 5, 6], N = 6
📌 Output: 3*/

fun main(){

    val arr = arrayOf(1,2,3,5,6)
    val N = 6

    // Using Sum Formula
    // Time Complexity O(N) / Space Complexity O(1)
    println("Missing Num "+missingNum(arr,N))

    // Using XOR
    // Time Complexity O(N) / Space Complexity O(1)
    println("Missing Num "+missingNum2(arr,N))

}


// Using Sum Formula
fun missingNum(arr: Array<Int>, n: Int): Int {
    val total = n * (n + 1) / 2
    var sum = 0
    for (element in arr){
        sum += element
    }

    return total - sum
}

// Using XOR
fun missingNum2(arr: Array<Int>, N: Int): Int {
    var xor1 = 0
    var xor2 = 0

    for (i in 0..N){ xor1 = xor1 xor i }

    for(j in arr){ xor2 = xor2 xor j }

    return xor1 xor  xor2
}