fun ABC058_B () {
    val (o, e) = (1..2).map { readLine()!! }
    val result = (0 until o.length + e.length).map {
        if (it % 2 == 0) {
            o[it/2]
        } else {
            e[it/2]
        }
    }.joinToString("")
}

//fun ABC058_B () {
//    val (o, e) = (1..2).map { readLine()!! }
//    var marged = arrayOfNulls<Char>(o.length + e.length)
//    for (i in 0 until o.length + e.length) {
//        if (i % 2 == 0) {
//            marged[i] = o.toCharArray()[i/2]
//        } else {
//            marged[i] = e.toCharArray()[i/2]
//        }
//    }
//    println(marged.joinToString(""))
//}
