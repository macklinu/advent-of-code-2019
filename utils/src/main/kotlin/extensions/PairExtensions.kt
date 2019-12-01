package extensions

fun <T, U> Pair<T, U>.flip(): Pair<U, T> = second to first