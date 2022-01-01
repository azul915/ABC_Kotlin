import LeetCode.*


fun main() {
    listOf<String>("Bob hit a ball, the hit BALL flew far after it was hit.")
        .map { mostCommonWord(it, arrayOf("hit")) }
        .apply { println(this) }
}
