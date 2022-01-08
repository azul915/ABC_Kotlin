import LeetCode.*
import kotlin.test.assertEquals

fun main() {

//    class Input989(val num: IntArray, val k: Int)
//    class Output989(val o: List<Int>)
//    listOf(
//        Pair<Output989, Input989>(Output989(listOf(1,2,3,4)), Input989(intArrayOf(1,2,0,0), 34)),
//        Pair<Output989, Input989>(Output989(listOf(4,5,5)), Input989(intArrayOf(2,7,4), 181)),
//        Pair<Output989, Input989>(Output989(listOf(1,0,2,1)), Input989(intArrayOf(2,1,5), 806)),
//        // Pair<Output989, Input989>(Output989(listOf(1,0,0,0,0,0,0,0,0,0,0)), Input989(intArrayOf(9,9,9,9,9,9,9,9,9,9), 1)),
//        // Pair<Output989, Input989>(Output989(listOf(1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,5,7,9)), Input989(intArrayOf(1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3), 516)),
//    ).forEach { assertEquals(it.first.o, addToArrayForm(it.second.num, it.second.k)) }

    listOf<Pair<IntArray, Int>>(
        Pair<IntArray, Int>(intArrayOf(3,6,1,0),1),
        Pair<IntArray, Int>(intArrayOf(1,2,3,4), -1),
        Pair<IntArray, Int>(intArrayOf(1),0),
    ).forEach { assertEquals(it.second , dominantIndex(it.first)) }
}
