fun ABC012() {
    val N = readLine()!!.toInt()
    val h = N / 3600
    val hh = if(h.toString().length == 1) "0$h" else "$h"
    val m = (N - 3600 * h) / 60
    val mm = if(m.toString().length == 1) "0$m" else "$m"
    val s = N - (3600 * h + 60 * m)
    val ss = if(s.toString().length == 1) "0$s" else "$s"
    println("$hh:$mm:$ss")
}

