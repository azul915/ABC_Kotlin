package LeetCode

fun test(): String = "EasyAcceptanceUnder50"

fun twoSum(nums: IntArray, target: Int): IntArray {
    var m = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (m.containsKey(complement)) {
            return intArrayOf(m[complement]!!, i)
        }
        m[nums[i]] = i
    }
    return intArrayOf()
}
