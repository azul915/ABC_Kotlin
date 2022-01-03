package LeetCode

import com.sun.source.tree.Tree
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow


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

fun removeDuplicates(nums: IntArray): Int {
    var now = 0
    for (idx in 1..nums.lastIndex) {
        if (nums[now] < nums[idx]) {
            now++
            nums[now] = nums[idx]
        }
    }
    return now + 1
}

fun guessNumber(n: Int, pick: Int): Int {

    var low = 1
    var high = n

    fun guess(n: Int, pick: Int): Int {
        return when {
            n < pick -> -1
            n > pick -> 1
            else -> 0
        }
    }

    while (low <= high) {
        val middle = low + ((high - low) / 2)
        val res = guess(middle, pick)
        if (res == 0) {
            return middle
        } else if (res < 0) {
            high = middle - 1
        } else { // ans > 0
            low = middle + 1
        }
    }

    return -1

}

fun findLengthOfLCIS(nums: IntArray): Int {

    var subSeqLen = 1
    var tmp = 1
    for (idx in 1..nums.lastIndex) {
        val diff = nums[idx] - nums[idx - 1]
        if (diff > 0) {
            tmp++
            if (subSeqLen < tmp) subSeqLen = tmp
        } else {
            tmp = 1
        }
    }
    return subSeqLen
}

fun prefixedsDivBy5(nums: IntArray): List<Boolean> {

    val list = mutableListOf<Boolean>()
    var num = 0
    for (n in nums) {
        num = (num *2 +n) %5
        list.add(num %5 == 0)
    }
    return list
}

fun backspaceCompare(s: String, t: String): Boolean {

    fun inputResult(input: String): String {
        var stack = mutableListOf<Char>()

        for (ch in input) {
            if (ch == '#') {
                if (stack.size > 0) stack.removeAt(stack.lastIndex)
                continue
            }
            stack.add(ch)
        }
        return stack.joinToString("")
    }

    return inputResult(s) == inputResult(t)
}

fun convertToBase7(num: Int): String {
    var target = num
    var base7List = mutableListOf<Int>()

    do {
        val remainder = if (target /7 == 0) target %7 else abs(target %7)
        base7List.add(remainder)
        target = target /7
    } while (target != 0)

    return base7List.reversed().joinToString("")
}

fun convertToBase7Another(num: Int): String {

    if (num < 0) return "-${convertToBase7Another(-num)}"
    if (num < 7) return "${convertToBase7Another(num)}"
    return "${convertToBase7Another(num /7)}${num %7}"

}

fun checkRecord(s: String): Boolean {

    val attendanceList = MutableList<Any>(s.length) { s[it] }
    var absenses = 0
    for (idx in attendanceList.indices) {

        when(idx) {
            0 -> {
                when(attendanceList[idx]) {
                    'A' -> {
                        absenses++
                        attendanceList[idx] = 0
                    }
                    'L' -> {
                        attendanceList[idx] = 1
                    }
                    else -> {
                        attendanceList[idx] = 0
                    }
                }
            }
            else -> { // idx > 0
                when(attendanceList[idx]) {
                    'A' -> {
                        absenses++
                        attendanceList[idx] = 0
                    }
                    'L' -> {
                        val yesterday = attendanceList[idx-1] as Int
                        attendanceList[idx] = yesterday +1
                    }
                    else -> {
                        attendanceList[idx] = 0
                    }
                }
            }
        }

        if (absenses >= 2) return false
        val today = attendanceList[idx] as Int
        if (today > 2) return false

    }

    return true

}

fun checkRecordAnother(s: String): Boolean {
    return s.filter { it == 'A' }.length < 2 && "LLL" !in s
}

fun maximumProduct(nums: IntArray): Int {

    val sorted = nums.sorted()
    return max(sorted[nums.lastIndex -2] * sorted[nums.lastIndex -1] * sorted[nums.lastIndex], sorted[0] * sorted[1] * sorted[nums.lastIndex])
}

fun maxiumProductAnother(nums: IntArray): Int {

    var min1 = Int.MAX_VALUE
    var min2 = Int.MAX_VALUE
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE
    var max3 = Int.MIN_VALUE

    for (num in nums) {
        when {
            num <= min1 -> {
                min2 = min1
                min1 = num
            }
            num <= min2 -> {
                min2 = num
            }
        }
        when {
            num >= max3 -> {
                max1 = max2
                max2 = max3
                max3 = num
            }
            num >= max2 -> {
                max1 = max2
                max2 = num
            }
            num >= max1 -> {
                max1 = num
            }
        }
    }
    return max(min1 * min2 * max1, max1 * max2 * max3)
}

fun daysBetweenDates(date1: String, date2: String): Int {

    val ld1 = LocalDate.parse(date1, DateTimeFormatter.ISO_DATE)
    val ld2 = LocalDate.parse(date2, DateTimeFormatter.ISO_DATE)
    val diff = ChronoUnit.DAYS.between(ld1, ld2)
    return abs(diff.toInt())
}

fun reverseVowels(s: String): String {

    var left = 0
    var right = s.lastIndex
    val vowels = setOf<Char>('a','e','i','o','u','A','E','I','O','U')
    val sca = s.toCharArray()
    while (left < right) {
        if (sca[left] in vowels && sca[right] in vowels) {
            sca.swap(left, right)
            left++
            right--
        }
        if (sca[left] !in vowels) left++
        if (sca[right] !in vowels) right--
    }
    return sca.joinToString("")
}

fun CharArray.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun reverseBits(n: Int): Int {
    var reversed = 0
    var cn = n
    repeat(32) {
        val bottomBit = cn and 1
        reversed = reversed shl 1
        reversed = reversed or bottomBit
        cn = cn shr 1
    }
    return reversed
}

fun isOneBitCharacter(bits: IntArray): Boolean {

    var idx = 0
    while (idx < bits.lastIndex) {
        idx = when (bits[idx]) {
            0 -> idx +1
            else -> idx +2 // if (bits[idx] == 1)
        }
    }
    return idx == bits.lastIndex
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun findMode(root: TreeNode?): IntArray {

    var visited = mutableMapOf<Int, Int>()
    fun dfs(node: TreeNode?) {
        node?.`val`?.let {
           if (visited.containsKey(it)) {
               val v = visited[it] ?: return
                visited[it] = v +1
           } else {
               visited[it] = 1
           }
        } ?: run { return }
        node?.left?.let { dfs(it) }
        node?.right?.let { dfs(it) }
    }

    dfs(root)

    val ml = mutableListOf<Int>()
//    val mfn = visited.values?.max()
    val mfn = visited.values?.maxOrNull()
    for ((k, v) in visited) {
        if (v == mfn) ml.add(k)
    }

    return ml.toIntArray()
}

fun isBalanced(root: TreeNode?): Boolean {

    fun dfs(node: TreeNode?): Int {
        if (node == null) return 0

        val ld = dfs(node?.left)
        val rd = dfs(node?.right)

        if (ld == -1 || rd == -1 || abs(ld -rd) > 1) return -1
        return maxOf(ld, rd) +1
    }

    return dfs(root) != -1
}

fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {

    var ans = 0
    var count = mutableMapOf<Int, Int>()

    for (domino in dominoes) {
        val key = minOf(domino[0], domino[1]) *10 +maxOf(domino[0], domino[1])
        ans += count.getOrDefault(key, 0)
        count[key] = count.getOrDefault(key, 0)+1
    }
    return ans

}

fun nextGreatestLetter(letters: CharArray, target: Char): Char {

    var left = 0
    var right = letters.lastIndex

    while (left <= right) {
        val middle = left +(right - left)/2
        if (letters[middle] > target) {
            right = middle -1
        } else {
            left = middle +1
        }
    }
    return letters[left % letters.size]
}

fun toHex(num: Int): String {
    // prohibited to directory solve
    // return Integer.toHexString(num)

    val convMap = mapOf<Int, String>(10 to "a",11 to "b",12 to "c",13 to "d",14 to "e", 15 to "f")
    val bs = Integer.toBinaryString(num)
    val binStr = when (bs.length % 4) {
        0 -> bs
        1 -> "000$bs"
        2 -> "00$bs"
        else -> "0$bs"
    }
    var ans = ""
    var acc = 0

    for (idx in binStr.lastIndex downTo 0) {

        val tmp = binStr[idx].toString().toDouble()*2.0.pow((binStr.lastIndex -idx) %4)
        acc += tmp.toInt()
        if ((binStr.lastIndex -idx) %4 == 3) {

            val degit = if (acc > 9) convMap[acc] else acc.toString()
            ans = "$degit$ans"
            acc = 0
        }
    }
    return ans
}

fun toHexAnother(num: Int): String {
    val convMap = mapOf<Int, String>(10 to "a", 11 to "b", 12 to "c", 13 to "d", 14 to "e", 15 to "f")

    fun forNeg(neg: Int): String {
        var sb = StringBuilder()
        val etc = abs(neg).toUInt().inv() +1.toUInt()
        var cn = etc.toString().toLong()

        while (0 < cn) {
            val surplus = if (9 < cn%16) {
                convMap[(cn%16).toInt()]
            } else {
                (cn%16).toString()
            }
            sb.insert(0, surplus)
            cn /= 16
        }
        return sb.toString()
    }

    fun forPos(pos: Int): String {
        var sb = StringBuilder()
        var cp = pos

        while (0 < cp) {
            val surplus = if (9 < cp%16) {
                convMap[cp%16]
            } else {
                (cp%16).toString()
            }
            sb.insert(0, surplus)
            cp /= 16
        }
        return sb.toString()
    }

    return when {
        num < 0 -> forNeg(num)
        num == 0 -> "0"
        else -> forPos(num)
    }
}

fun check(nums: IntArray): Boolean {

    var cnt = 0
    for (idx in 1..nums.lastIndex) {
        if (nums[idx] < nums[idx-1]) {
            cnt++
            if (1 < cnt) return false
        }
        if (idx == nums.lastIndex && 0 < cnt && nums[0] < nums[idx]) return false
    }
    return true
}

fun checkAnother(nums: IntArray): Boolean {

    var cnt = 0
    for (idx in 1..nums.lastIndex) {
        if (nums[idx] < nums[idx-1]) cnt++
    }
    if (nums[0] < nums[nums.lastIndex]) cnt++

    return cnt < 2
}

fun areAlmostEqual(s1: String, s2: String): Boolean {
    val list = mutableListOf<Int>()
    for (idx in s1.indices) {
        if (s1[idx] != s2[idx]) list.add(idx)
    }
    if (list.size == 0) return true
    if (list.size != 2) return false
    return s1[list[0]] == s2[list[1]] && s1[list[1]] == s2[list[0]]
}

fun mostCommonWord(paragraph: String, banned: Array<String>): String {
    val pl = paragraph.split(" ", ",", ".", "!", "?", ";", "'").asSequence()
        .filterNot { it == "" }
        .map { it.lowercase() }
        .filterNot { it in banned }
    val mfe = pl.groupingBy { it }.eachCount()
        .maxByOrNull { it.value }?.key
    return mfe?.let { it } ?: ""
}

fun canThreePartsEqualSum(arr: IntArray): Boolean {

    val sum = arr.sum()
    if (sum %3 != 0) return false
    val ot = sum /3
    var partitions = 0
    var acc = 0
    for (idx in arr.indices) {
        acc += arr[idx]
        if (acc == ot) {
            partitions++
            acc = 0
        }
    }
    return 2 < partitions
}

fun isPalindrome(head: ListNode?): Boolean {
    val stack = mutableListOf<Int>()
    var current = head
    while (current != null) {
        stack.add(current.`val`)
        current = current?.next
    }
    val half = stack.size /2
    for (idx in 0 until half) {
        if (stack[idx] != stack[stack.lastIndex-idx]) return false
    }
    return true
}

fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {

    val ml = mutableListOf<Int>()
    fun analyze(node: TreeNode?) {
        node?.`val`?.let {
            ml.add(it)
        } ?: run { return }

        node?.left?.let { analyze(it) }
        node?.right?.let { analyze(it) }
    }
    analyze(subRoot)

    val subRootVal = subRoot!!.`val`
    var checker = mutableListOf<Int>()

    fun dfs(node: TreeNode?) {
        node?.`val`?.let {
            if (subRootVal == it) checker.add(it)
            for (idx in checker.indices) {
                if (checker[idx] != ml[idx]) return
            }
        } ?: run { return }

        node?.left?.let { dfs(it) }
        node?.right?.let { dfs(it) }
    }

    dfs(root)

    return true
}

fun addToArrayForm(num: IntArray, k: Int): List<Int> {

    var sb = StringBuilder()
    for (n in num) sb.append(n.toString())
    val sum = sb.toString().toBigDecimal() + k.toBigDecimal()
    return "$sum".map { it.toString().toInt() }.toList()

}
