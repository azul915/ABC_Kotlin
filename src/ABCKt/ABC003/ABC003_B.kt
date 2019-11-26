fun ABC003_B() {
    val (S, T) = (1..2).map { readLine()!! }
    val atcoder = listOf('a','t','c','o','d','e','r','@')

    val result = (S.indices).all {
        when(S[it]) {
            '@' -> T[it] in atcoder
            in atcoder -> T[it] == '@' || S[it] == T[it]
            else -> S[it] == T[it]
        }
    }.let { if(it) "You can win" else "You will lose" }

    println(result)
}