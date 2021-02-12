class LazyProperty(val initializer: () -> Int) {
    var lazyValue: Int? = null
        get() {
            if (field == null) field = initializer()
            return field
        }
    val lazy: Int
        get() =
            lazyValue!!

}
