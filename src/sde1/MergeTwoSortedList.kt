package sde1

fun main(){
    
    val l1 = LinkNode(1, LinkNode(3, LinkNode(5)))
    val l2 = LinkNode(2, LinkNode(4, LinkNode(6)))

    // Using Recursion
    // Time Complexity O(N) / Space Complexity O(N)
    var mList = mergeTwoList(l1,l2)
    while (mList != null){
        print("${mList.v} -> ")
        mList = mList.next
    }
    println("null")

}

fun mergeTwoList(l1: LinkNode?, l2: LinkNode?): LinkNode? {

    if (l1 == null) return l2
    if (l2 == null) return  l1

    return if (l1.v < l2.v){
        l1.next = mergeTwoList(l1.next,l2)
        l1
    }else{
        l2.next = mergeTwoList(l1,l2.next)
        l2
    }
}


data class LinkNode(
    val v: Int,
    var next: LinkNode?= null
)
