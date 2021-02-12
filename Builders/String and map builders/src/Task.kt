import java.util.HashMap

fun buildMap(hash: HashMap<Int, String>.() -> Unit): Map<Int, String> {
    return HashMap<Int, String>().apply { hash() }
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
