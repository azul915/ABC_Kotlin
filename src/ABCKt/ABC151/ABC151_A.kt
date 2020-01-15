fun ABC151_A() {
    val c = readLine()!!.toCharArray()[0]
    val chars = ('a'..'z')
    val it = chars.iterator()

    while (it.hasNext()) {

        val e = it.next()
        if(c == e) {
            println(it.next())
            break
        }
    }
}
