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

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun deleteDuplicates(head: ListNode?): ListNode? {
    var current = head
    while (current?.next != null) {
        if (current.`val` == current?.next?.`val`) {
            current.next = current?.next?.next
        } else {
            current = current.next
        }
    }
    return head
}

class MyStack {

    private var q1 = java.util.ArrayDeque<Int>()

    fun push(x: Int) {
        q1.add(x)
    }

    fun pop(): Int {
        var q2 = java.util.ArrayDeque<Int>()
        while (q1.size > 1) {
            val head = q1.removeFirst()
            q2.add(head)
        }
        val lastOne = q1.removeFirst()
        q1 = q2
        return lastOne
    }

    fun top(): Int {
        var q2 = java.util.ArrayDeque<Int>()
        while (q1.size > 1) {
            val head = q1.removeFirst()
            q2.add(head)
        }
        val lastOne = q1.removeFirst()
        q2.add(lastOne)
        q1 = q2
        return lastOne
    }

    fun empty(): Boolean {
        return q1.size == 0
    }
}

fun isSubsequence(s: String, t: String): Boolean {
    if (s.isEmpty()) return true

    var si = 0
    var ti = 0
    while (si < s.length && ti < t.length) {
        if (s[si] == t[ti]) {
            si++
        }
        ti++

        if (si == s.length) return true
    }
    return false
}

fun climbStairs(n: Int): Int {
    if (n == 1) return 1
    if (n == 2) return 2
    var l = 1
    var m = 2
    var cnt = 2
    var acm = 0
    while (cnt > n) {
        acm = l + m
        l = m
        m = acm
        cnt++
    }
    return acm
}

fun findJudge(n: Int, trust: Array<IntArray>): Int {
    var subject = Array(n + 1) { 0 }
    var trusted = Array(n + 1) { 0 }
    for (t in trust) {
        val subj = t[0]
        val obj = t[1]
        subject[subj]++
        trusted[obj]++
    }
    for (i in 1..n) {
        if (subject[i] == 0 && trusted[i] == n - 1) return i
    }
    return -1
}