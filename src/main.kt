 import leetCode.*
 import kotlin.test.assertEquals


 fun main() {
     assertEquals(listOf(1,2,3,4), addToArrayForm(intArrayOf(1,2,0,0), 34))
     assertEquals(listOf(4,5,5), addToArrayForm(intArrayOf(2,7,4), 181))
     assertEquals(listOf(1,0,2,1), addToArrayForm(intArrayOf(2,1,5), 806))
     assertEquals(listOf(1,0,0,0,0,0,0,0,0,0,0), addToArrayForm(intArrayOf(9,9,9,9,9,9,9,9,9,9), 1))
}