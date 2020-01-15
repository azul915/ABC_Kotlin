fun ABC028_B() {
    val input = readLine()!!
    val answer = ('A'..'F').map {
            i -> input.count { it == i }
    }.joinToString(" ")
    println(answer)
}

//fun ABC028_B() {
//    var a = 0
//    var b = 0
//    var c = 0
//    var d = 0
//    var e = 0
//    var f = 0
//
//    val arr = readLine()!!.toCharArray()
//    for (i in arr.indices) {
//        if (arr[i] == 'A') a++
//        if (arr[i] == 'B') b++
//        if (arr[i] == 'C') c++
//        if (arr[i] == 'D') d++
//        if (arr[i] == 'E') e++
//        if (arr[i] == 'F') f++
//    }
//    println("$a $b $c $d $e $f")
//
//}
