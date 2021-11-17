//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val list = (1..n).map { readLine()!!.toInt() }
//    val sorted = list.sortedDescending()
//
//    val circle = sorted.foldIndexed(0) { index, area, item -> if (index % 2 == 0) {
//        area + item * item
//    } else {
//        area - item * item
//    } }
//    val sum= circle * Math.PI
//    println(sum)
//}
