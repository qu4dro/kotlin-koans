import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

fun task1(today: MyDate): MyDate {
    return addTimeIntervals(today, 1, 1)
}

fun task2(today: MyDate): MyDate {
    return addTimeIntervals(today, 2, 3, 5)
}

fun addTimeIntervals(myDate: MyDate, year: Int = 0, week: Int = 0, day: Int = 0): MyDate {
    return myDate
        .addTimeIntervals(YEAR, year)
        .addTimeIntervals(WEEK, week)
        .addTimeIntervals(DAY, day)
}