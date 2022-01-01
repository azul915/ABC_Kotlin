import LeetCode.*
import kotlin.test.assertEquals


fun main() {
    listOf(
        Pair<Boolean, IntArray>(true, intArrayOf(0,2,1,-6,6,-7,9,1,2,0,1)),
        Pair<Boolean, IntArray>(false, intArrayOf(0,2,1,-6,6,7,9,-1,2,0,1)),
        Pair<Boolean, IntArray>(true, intArrayOf(3,3,6,5,-2,2,5,1,-9,4)),
        Pair<Boolean, IntArray>(false, intArrayOf(1,-1,1,-1))
    ).forEach { assertEquals(it.first, canThreePartsEqualSum(it.second), "${it.second.contentToString()}") }

}
