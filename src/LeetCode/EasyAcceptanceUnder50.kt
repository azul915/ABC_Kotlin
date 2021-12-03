package LeetCode

import kotlin.math.max
import kotlin.math.min

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
    if (n < 3) return n

    var array = Array<Int>(n + 1) { if (it < 3) it else 0 }

    for (i in 3..n) {
        array[i] = array[i - 1] + array[i - 2]
    }

    return array[n]
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

fun isValid(s: String): Boolean {
    val bracket = mapOf<Char, Char>(')' to '(', ']' to '[', '}' to '{')
    val stack = mutableListOf<Char>()
    for (char in s) {
        if (char in bracket.values) {
            stack.add(char)
        } else if (stack.isNotEmpty() && bracket[char] == stack.last()) {
            stack.removeAt(stack.lastIndex)
        } else {
            return false
        }
    }
    return stack.size < 1
}

fun rotateString(s: String, goal: String): Boolean {
    return s.length == goal.length && (s + s).contains(goal)
}

fun rotateStringAnotherAnswer(s: String, goal: String): Boolean {
    if (s.length != goal.length) return false
    val b = StringBuilder(s)
    for (char in s) {
        b.deleteCharAt(0)
        b.append(char)
        if (b.toString() == goal) return true
    }
    return false
}

fun reverseStr(s: String, k: Int): String {
    var sm = s.toMutableList()
    for (start in s.indices step 2*k) {
        var left = start
        var right = min(start + k - 1 ,s.length - 1)
        while (left < right) {
            val tmp = sm[left]
            sm[left] = sm[right]
            sm[right] = tmp
            right--
            left++
        }
    }
    return sm.joinToString("")
}

fun readBinaryWatch(turnedOn: Int): List<String> {
    var answer = mutableListOf<String>()

    fun bitCount(num: Int): Int {
        var tmp = num
        var cnt = 0
        while (tmp > 0) {
            cnt += tmp % 2
            tmp /= 2
        }
        return cnt
    }

    for (h in 0..11) {
        for (m in 0..59) {
            if (bitCount(h) + bitCount(m) == turnedOn) {
                answer.add("$h:${if (m < 10) "0$m" else "$m"}")
            }
        }
    }
    return answer
}

fun validPath(n: Int, edges: Array<IntArray>, start: Int, end: Int): Boolean {
    var dests = mutableMapOf<Int, MutableList<Int>>()
    var visited = mutableSetOf<Int>()

    for (edge in edges) {
        val from = edge[0]
        val to = edge[1]
        dests[from]?.let {
            it.add(to)
        } ?: run {
            dests[from] = mutableListOf(to)
        }
        dests[to]?.let {
            it.add(from)
        } ?: run {
            dests[to] = mutableListOf(from)
        }
    }

    fun dfs(node: Int): Boolean {
        visited.add(node)
        if (node == end) return true
        for (child in dests[node]!!) {
            if (child !in visited && dfs(child)) {
                return true
            }
        }
        return false
    }

    return dfs(start)

}

fun pivotIndex(nums: IntArray): Int {
    val numsSum = nums.sum()
    var leftSum = 0
    for (i in nums.indices) {
        if (leftSum == numsSum - leftSum - nums[i]) return i
        leftSum += nums[i]
    }
    return -1
}

fun maxSubArray(nums: IntArray): Int {
    val ns = nums.toMutableList()
    var max = ns[0]
    for (i in 1..ns.lastIndex) {
        ns[i] = max(ns[i - 1] + ns[i], ns[i])
        max = max(ns[i], max)
    }
    return max
}

fun addBinary(a: String, b: String): String {

    val maxLength = max(a.length, b.length) + 1
    val ansArray = Array<Int>(maxLength) { 0 }
    var carried = 0
    for (dist in 1..maxLength) {
        val aidx = a.length - dist
        val bidx = b.length - dist
        val degitA = if (aidx < 0) '0' else a[aidx]
        val degitB = if (bidx < 0) '0' else b[bidx]
        when {
            degitA == '0' && degitB == '0' -> {
                if (carried == 0) {
                    ansArray[ansArray.size - dist] = 0
                } else {
                    ansArray[ansArray.size - dist] = 1
                    carried = 0
                }
            }
            degitA == '0' && degitB == '1' -> {
                if (carried == 0) {
                    ansArray[ansArray.size - dist] = 1
                } else {
                    ansArray[ansArray.size - dist] = 0
                    carried = 1
                }
            }
            degitA == '1' && degitB == '0' -> {
                if (carried == 0) {
                    ansArray[ansArray.size - dist] = 1
                } else {
                    ansArray[ansArray.size - dist] = 0
                    carried = 1
                }
            }
            degitA == '1' && degitB == '1' -> {
                if (carried == 0) {
                    ansArray[ansArray.size - dist] = 0
                    carried = 1
                } else {
                    ansArray[ansArray.size - dist] = 1
                    carried = 1
                }
            }
        }
    }

    return if (ansArray[0] == 0) ansArray.slice(1..ansArray.lastIndex).joinToString("") else ansArray.joinToString("")
    // return java.math.BigInteger(a, 2).add(java.math.BigInteger(b, 2)).toString(2)
}

class MinStack {

    var stack = mutableListOf<Int>()
    var min = Int.MAX_VALUE

    fun push(`val`: Int) {
       if (`val` < min) min = `val`
        stack.add(`val`)
    }

    fun pop() {
        stack.removeAt(stack.lastIndex)
        stack.minOrNull()?.let { // stack.min()?.let {
            min = it
        } ?: run {
            min = Int.MAX_VALUE
        }
    }

    fun top(): Int {
        return stack.last()
    }

    @JvmName("getMin1")
    fun getMin(): Int {
        return min
    }
}

class MinStackAnother {
    var stack = mutableListOf<Pair<Int, Int>>()

    fun push(`val`: Int) {

        val min = if (stack.isEmpty()) `val` else stack.last().second

        if (`val` < min) {
            stack.add(Pair(`val`, `val`))
        } else {
            stack.add(Pair(`val`, min))
        }
    }

    fun pop() {
        stack.removeAt(stack.lastIndex)
    }
    
    fun top(): Int {
        return stack.last().first
    }

    @JvmName("getMin2")
    fun getMin(): Int {
        return stack.last().second
    }
}

fun secondHighest(s: String): Int {
    var largest = -1
    var second = -2

    for (digit in s) {
        digit.toString().toIntOrNull()?.let {
            when {
                it > largest -> {
                    second = largest
                    largest = it
                }
                it == largest -> {}
                it in second until largest -> {
                    second = it
                }
                else -> {}
            }
        }
    }
    return if (largest == -1 || second == -2) -1 else second
}

fun secondHighestAnother(s: String): Int {
    val ss = s.filter { it in '0'..'9' }.map { it.toString().toInt() }.toSet()
    if (ss.size < 2) return -1
    return ss.sortedDescending()[1]
}

fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    if (headA == null || headB == null) return null

    var pointerA = headA
    var pointerB = headB

    while (pointerA != pointerB) {

//        pointerA?.next?.let {
//            pointerA = it
//        } ?: pointerA = headB
//
//        pointerB?.next?.let {
//            pointerB = it
//        } ?: pointerB = headA

        if (pointerA == null) {
            pointerA = headB
        } else {
            pointerA = pointerA?.next
        }

        if (pointerB == null) {
            pointerB = headA
        } else {
            pointerB = pointerB?.next
        }
    }
    return pointerA
}

fun getIntersectionNodeAnother(headA: ListNode?, headB: ListNode?): ListNode? {
    val visited = mutableSetOf<ListNode?>()
    var pointerA = headA
    var pointerB = headB

    while (pointerA != null) {
        visited.add(pointerA)
        pointerA = pointerA?.next
    }

    while (pointerB != null) {
        if (visited.contains(pointerB)) return pointerB
        pointerB = pointerB?.next
    }
    return null
}

fun removeDuplicates(nums: IntArray) {
    var now = 0
    for (idx in 1..nums.lastIndex) {
        if (nums[now] < nums[idx]) {
            now++
            mums[now] = nums[idx]
        }
    }
    return now + 1
}
