import LeetCode.*


fun main() {
    listOf<IntArray>(
        intArrayOf(3,4,5,1,2),
        intArrayOf(2,1,3,4),
        intArrayOf(1,2,3)
    ).map { checkAnother(it) }.apply { println(this) }
}
