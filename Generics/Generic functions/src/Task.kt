import java.util.*

fun <T : MutableCollection<V>, V> Collection<V>.partitionTo(
    listFirst: T,
    listSecond: T,
    predicate: (V) -> Boolean
): Pair<T, T> {
    this.forEach {
        if (predicate.invoke(it)) listFirst.add(it)
        else listSecond.add(it)
    }

    return Pair(listFirst, listSecond)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
        .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
        .partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}
