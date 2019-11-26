fun ABC003_B() {
    val (S, T) = (1..2).map { readLine()!! }
    val atcoder = listOf('a','t','c','o','d','e','r','@')
    (S.indices).all {
        when(S[it]) {
            '@' -> T[it] in atcoder
            in atcoder -> T[it] == '@' || T[it] == S[it]
            else -> T[it] == S[it]
        }
    }.let { if(it) println("You can win") else println("You will lose") }
}