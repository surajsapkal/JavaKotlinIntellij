
/*Find the First Non-Repeating Character

Question: Given a string, find the first non-repeating character.

Example:
📌 Input: "aabbcdd"
📌 Output: "c"*/

fun main(){

    val str = "aabbcdd"

    // Using HashMap
    // Time Complexity O(N) / Space Complexity O(1) - since only 26 letters
    println("NonRepeating Char: "+nonRepChar(str))

    // Using Int Array
    println("NonRepeating Char 2: "+nonRepChar2(str))
}


fun nonRepChar(str: String): Char {

    val map = hashMapOf<Char,Int>()

    for (char in str.toCharArray()){
        map[char] = map.getOrDefault(char,0) + 1
    }

    for (char in str.toCharArray()){
        if (map[char] == 1){
            return char
        }
    }

    return  '_'

}

fun nonRepChar2(str: String): Char {

    val intArr = IntArray(26)

    for (char in str.toCharArray()){
        intArr[char - 'a']++
    }

    for (char in str.toCharArray()){
        if (intArr[char - 'a'] == 1){
            return char
        }
    }

    return  '_'
}