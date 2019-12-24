fun ABC081_B() {

    fun divRec(count: Int, numList: List<Int>): Int {
        return if (numList.all { it % 2 == 0 }) {
            divRec(count + 1, numList.map { it / 2 })
        } else {
            count
        }
    }

    readLine()!!
    val list = readLine()!!.split(" ").map { it.toInt() }
    println(divRec(0, list))
}