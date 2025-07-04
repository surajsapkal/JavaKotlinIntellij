package Patterns

fun main(){

    pattern1()
}

private fun pattern1(){
    val n = 6
    for (i in 0..n){
        for (j in 0..n){
            if (i == 0 || j == 0 || i == n || j == n || i == j || i+j == n){
                print(" * ")
            }else{
                print("   ")
            }
        }
        println("")
    }

}