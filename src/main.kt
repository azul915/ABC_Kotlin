import LeetCode.*
import kotlin.test.assertEquals

fun main() {
    listOf(
        Pair<IntArray, Boolean>(intArrayOf(3,4,5,1,2), true),
        Pair<IntArray, Boolean>(intArrayOf(2,1,3,4), false),
        Pair<IntArray, Boolean>(intArrayOf(1,2,3), true)
    ).forEach { assertEquals(it.second, LeetCode.check(it.first)) }
}
