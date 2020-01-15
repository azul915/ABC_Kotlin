fun tenka1_2019_beginner() {
    val list = (1..3).map { readLine()!! }
    val n = list[0].toInt()
    val s = list[1]
    val k = list[2].toInt()
    val c = list[1][k - 1]// k番目のアルファベット

    val result = s.map { if (it != c) "*" else it }.joinToString("")
    print(result)
}
