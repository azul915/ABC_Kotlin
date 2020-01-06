// TODO: 復習
fun ABC019_B() {
    val str = readLine()!!
    var result = ""
    var count = 0
    var character = str[0]
    for (i in str.indices) {
        if (character == str[i]) {
            count++
        } else {
            result += "$character$count"
            character = str[i]
            count = 1
        }
    }
    result += "$character$count"
    println(result)
}
