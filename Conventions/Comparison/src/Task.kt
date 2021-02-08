data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override operator fun compareTo(other: MyDate): Int {
        if (this.year > other.year || this.month > other.year || this.dayOfMonth > other.dayOfMonth) return 1
        return if (this.year < other.year || this.month < other.year || this.dayOfMonth < other.dayOfMonth) -1
        else 0
    }
}



fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
