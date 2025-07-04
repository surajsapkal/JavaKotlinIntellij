package sde1

/*Move Zeros (FAANG)

You’re given an array. Move all the zeroes to the end while keeping the order of the non-zero elements the same.

Input:  [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]*/

fun main(){

    val intArr = intArrayOf(0,1,0,3,12)

    moveZeros(intArr)

    println("Move Zeros: ${intArr.joinToString()}")

}

fun moveZeros(intArr: IntArray) {
    var insertPos = 0

    for(num in intArr){
       if (num != 0){
           intArr[insertPos] = num
           insertPos++
       }
    }

    for (i in insertPos..<intArr.size){
        intArr[i] = 0
    }
}
