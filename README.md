# Kotlin Koans tasks

These are my solutions to [Kotlin Koans](https://play.kotlinlang.org/koans/overview)

* Introduction
    * [Hello, world!](https://github.com/qu4dro/kotlin-koans/#hello-world)
    * [Named arguments](https://github.com/qu4dro/kotlin-koans/#named-arguments)
    * [Default arguments](https://github.com/qu4dro/kotlin-koans/#default-arguments)
    * [Triple-quoted strings](https://github.com/qu4dro/kotlin-koans/#triple-quoted-strings)
    * [String templates](https://github.com/qu4dro/kotlin-koans/#string-templates)
    * [Nullable types](https://github.com/qu4dro/kotlin-koans/#nullable-types)
    * [Nothing types](https://github.com/qu4dro/kotlin-koans/#nothing-types)
    * [Lambdas](https://github.com/qu4dro/kotlin-koans/#lambdas)

* Classes
    * [Data classes](https://github.com/qu4dro/kotlin-koans/#data-classes)
    * [Smart casts](https://github.com/qu4dro/kotlin-koans/#smart-casts)
    * [Sealed classes](https://github.com/qu4dro/kotlin-koans/#sealed-classes)
    * [Rename on import](https://github.com/qu4dro/kotlin-koans/#rename-on-import)
    * [Extension functions](https://github.com/qu4dro/kotlin-koans/#extension-functions)

* Conventions
    * [Comparison](https://github.com/qu4dro/kotlin-koans/#comparison)
    * [Ranges](https://github.com/qu4dro/kotlin-koans/#ranges)
    * [For loop](https://github.com/qu4dro/kotlin-koans/#for-loop)
    * [Operators overloading](https://github.com/qu4dro/kotlin-koans/#operators-overloading)
    * [Invoke](https://github.com/qu4dro/kotlin-koans/#invoke)

* Collections
    * [Introduction](https://github.com/qu4dro/kotlin-koans/#introduction)
    * [Sort](https://github.com/qu4dro/kotlin-koans/#sort)
    * [Filter map](https://github.com/qu4dro/kotlin-koans/#filter-map)
    * [All Any and other predicates](https://github.com/qu4dro/kotlin-koans/#all-any-and-other-predicates)
    * [Max min](https://github.com/qu4dro/kotlin-koans/#max-min)
    * [Sum](https://github.com/qu4dro/kotlin-koans/#sum)
    * [GroupBy](https://github.com/qu4dro/kotlin-koans/#groupby)
    * [Associate](https://github.com/qu4dro/kotlin-koans/#associate)
    * [Partition](https://github.com/qu4dro/kotlin-koans/#partition)
    * [FlatMap](https://github.com/qu4dro/kotlin-koans/#flatmap)
    * [Fold](https://github.com/qu4dro/kotlin-koans/#fold)
    * [Compound tasks](https://github.com/qu4dro/kotlin-koans/#compound-tasks)
    * [Getting used to new style](https://github.com/qu4dro/kotlin-koans/#getting-used-to-new-style)
    * [Sequences](https://github.com/qu4dro/kotlin-koans/#sequences)

* Properties
    * [Properties](https://github.com/qu4dro/kotlin-koans/#properties)
    * [Lazy property](https://github.com/qu4dro/kotlin-koans/#lazy-property)
    * [Delegates examples](https://github.com/qu4dro/kotlin-koans/#delegates-examples)
    * [Delegates how it works](https://github.com/qu4dro/kotlin-koans/#delegates-how-it-works)

* Builders
    * [Function literals with receiver](https://github.com/qu4dro/kotlin-koans/#function-literals-with-receiver)
    * [String and map builders](https://github.com/qu4dro/kotlin-koans/#string-and-map-builders)
    * [The function apply](https://github.com/qu4dro/kotlin-koans/#the-function-apply)
    * [Html builders](https://github.com/qu4dro/kotlin-koans/#html-builders)
    * [Builders how it works](https://github.com/qu4dro/kotlin-koans/#builders-how-it-works)
    * [Builders implementation](https://github.com/qu4dro/kotlin-koans/#builders-implementation)

* Generics
    * [Generic functions](https://github.com/qu4dro/kotlin-koans/#generic-functions)

## Introduction

### Hello World!

```
Check out the function syntax and change the code to make the function start 
return the string "OK".
```

Solution

```kotlin
fun start(): String = "OK" 
```

### Named arguments

```
Make the function joinOptions() return the list in a JSON format (e.g., "[a, b, c]") 
by specifying only two arguments.

Default and named arguments help to minimize the number of overloads and improve the 
readability of the function invocation. The library function joinToString is declared 
with default values for parameters:

fun joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    /* ... */
): String

It can be called on a collection of Strings.
```

Solution

```kotlin
fun joinOptions(options: Collection<String>) =
    options.joinToString(", ", "[", "]")
```

### Default arguments

```
Imagine, you have several overloads of 'foo()' in Java:

public String foo(String name, int number, boolean toUpperCase) {
    return (toUpperCase ? name.toUpperCase() : name) + number;
}
public String foo(String name, int number) {
    return foo(name, number, false);
}
public String foo(String name, boolean toUpperCase) {
    return foo(name, 42, toUpperCase);
}
public String foo(String name) {
    return foo(name, 42);
}

You can replace all these Java overloads with one function in Kotlin. Change 
the declaration of the foo function in a way that makes the code using foo 
compile. Use default and named arguments.
```

Solution

```kotlin
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
    (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)
```

### Triple-quoted strings

```
Learn about the different string literals and string templates in Kotlin.

You can use the handy library functions trimIndent and trimMargin to format 
multiline triple-quoted strings in accordance with the surrounding code.

Replace the trimIndent call with the trimMargin call taking # as the prefix 
value, so that the resulting string doesn't contain the prefix character.
```

Solution

```kotlin
const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")

fun main() {
    println(tripleQuotedString)
}
```

### String templates

```
Triple-quoted strings are not only useful for multiline strings, but also 
for creating regex patterns as you don't need to escape a backslash with a 
backslash.

The following pattern matches a date in the format 13.06.1992 (two digits, 
a dot, two digits, a dot, four digits):

fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""
Using the month variable rewrite this pattern in such a way that it matches 
the date in the format 13 JUN 1992 (two digits, a whitespace, a month 
abbreviation, a whitespace, four digits).
```

Solution

```kotlin
val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2}\ $month \d{4}"""
```

### Nullable types

```
Learn about null safety and safe calls in Kotlin and rewrite the following 
Java code so that it only has one if expression:

public void sendMessageToClient(
    @Nullable Client client,
    @Nullable String message,
    @NotNull Mailer mailer
) {
    if (client == null || message == null) return;

    PersonalInfo personalInfo = client.getPersonalInfo();
    if (personalInfo == null) return;

    String email = personalInfo.getEmail();
    if (email == null) return;

    mailer.sendMessage(email, message);
}
```

Solution

```kotlin
fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer
) {
    val personalInfo: PersonalInfo? = client?.personalInfo
    val email: String? = personalInfo?.email
    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
```

### Nothing types

```
Nothing type can be used as a return type for a function that always 
throws an exception. When you call such a function, the compiler uses 
the information that it throws an exception.

Specify Nothing return type for the failWithWrongAge function. Note 
that without the Nothing type the checkAge function doesn't compile 
because the compiler assumes the age can be null.
```

Solution

```kotlin
import java.lang.IllegalArgumentException

fun failWithWrongAge(age: Int?): Nothing {
    throw IllegalArgumentException("Wrong age: $age")
}

fun checkAge(age: Int?) {
    if (age == null || age !in 0..150) failWithWrongAge(age)
    println("Congrats! Next year you'll be ${age + 1}.")
}

fun main() {
    checkAge(10)
}
```

### Lambdas

```
Kotlin supports functional programming. Learn about lambdas in Kotlin.

Pass a lambda to the any function to check if the collection contains 
an even number. The any function gets a predicate as an argument and 
returns true if there is at least one element satisfying the predicate.
```

Solution

```kotlin
fun containsEven(collection: Collection<Int>): Boolean =
    collection.any { it % 2 == 0 }
```

## Classes

### Data classes

```
Learn about classes, properties and data classes and then rewrite the 
following Java code to Kotlin:

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
Afterwards add the data modifier to the resulting class. This will make 
the compiler generate a few useful methods for this class: equals/hashCode, 
toString and some others.
```

Solution

```kotlin
data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun comparePeople(): Boolean {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    return p1 == p2  // should be true
}
```

### Smart casts

```
Rewrite the following Java code using smart casts and the when expression:

public int eval(Expr expr) {
    if (expr instanceof Num) {
        return ((Num) expr).getValue();
    }
    if (expr instanceof Sum) {
        Sum sum = (Sum) expr;
        return eval(sum.getLeft()) + eval(sum.getRight());
    }
    throw new IllegalArgumentException("Unknown expression");
}
```

Solution

```kotlin
fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
```

### Sealed classes

```
Reuse your solution from the previous task, but replace the interface 
with the sealed class. Then you no longer need the else branch in when.
```

Solution

```kotlin
fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
    }

sealed class Expr
data class Num(val value: Int) : Expr()
data class Sum(val left: Expr, val right: Expr) : Expr()
```

### Rename on import

```
When you import a class or a function, you can specify a different 
name to use for it by adding as NewName after the import directive. 
This can be useful if you want to use two classes or functions with 
similar names from different libraries.

Uncomment the code and make it compile. Rename Random from the kotlin 
package to KRandom, and Random from the java package to JRandom.
```

Solution

```kotlin
import kotlin.random.Random as KRandom
import java.util.Random as JRandom

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " +
            KRandom.nextInt(2) +
            " Java random:" +
            JRandom().nextInt(2) +
            "."
}
```

### Extension functions

```
Learn about extension functions. Then implement the extension functions 
Int.r() and Pair.r() and make them convert Int and Pair to a RationalNumber.

Pair is a class defined in the standard library:

data class Pair(
    val first: A,
    val second: B
)
```

Solution

```kotlin
fun Int.r(): RationalNumber = RationalNumber(this, 1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second)

data class RationalNumber(val numerator: Int, val denominator: Int)
```

## Conventions

### Comparison

```
Learn about operator overloading and how the different conventions for 
operations like ==, <, + work in Kotlin. Add the function compareTo to 
the class MyDate to make it comparable. 
After this the code below date1 < date2 should start to compile.

Note that when you override a member in Kotlin, the override modifier is mandatory.
```

Solution

```kotlin
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
```

### Ranges

```
Using ranges implement a function that checks whether the date is in 
the range between the first date and the last date (inclusive).

You can build a range of any comparable elements. In Kotlin in checks 
are translated to the corresponding contains calls and .. to rangeTo calls:

val list = listOf("a", "b")
"a" in list  // list.contains("a")
"a" !in list // !list.contains("a")

date1..date2 // date1.rangeTo(date2)
```

Solution

```kotlin
fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}
```

### For loop

```
A Kotlin for loop can iterate through any object if the corresponding 
iterator member or extension function is available.

Make the class DateRange implement Iterable, so that it can be iterated 
over. Use the function MyDate.followingDate() defined in DateUtil.kt; 
you don't have to implement the logic for finding the following date on your own.

Use an object expression which plays the same role in Kotlin as an anonymous class in Java.
```

Solution

```kotlin
class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var current: MyDate = start

            override fun next(): MyDate {
                if (!hasNext()) throw NoSuchElementException()
                val next = current
                current = current.followingDate()
                return next
            }

            override fun hasNext(): Boolean = current <= end
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
```

### Operators overloading

```
Implement date arithmetic. Support adding years, weeks, and days to a date. 
You could write the code like this: date + YEAR * 2 + WEEK * 3 + DAY * 15.

First, add the extension function plus() to MyDate, taking the TimeInterval 
as an argument. Use the utility function MyDate.addTimeIntervals() declared 
in DateUtil.kt

Then, try to support adding several time intervals to a date. You may need 
an extra class.
```

Solution

```kotlin
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
```

### Invoke

```
Objects with an invoke() method can be invoked as a function.

You can add an invoke extension for any class, but it's better 
not to overuse it:

fun Int.invoke() { println(this) }

1() //huh?..
Implement the function Invokable.invoke() so it can count the 
number of times it is invoked.
```

Solution

```kotlin
class Invokable {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Invokable {
        numberOfInvocations++
        return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()
```

## Collections

### Introduction

```
This section was inspired by GS Collections Kata.

Kotlin can be easily mixed with Java code. Default collections 
in Kotlin are all Java collections under the hood. Learn about 
read-only and mutable views on Java collections.

The Kotlin standard library contains lots of extension functions 
that make working with collections more convenient. For example, 
operations that transform a collection into another one, starting 
with 'to': toSet or toList.

Implement the extension function Shop.getSetOfCustomers(). The class 
Shop and all related classes can be found in Shop.kt.
```

Solution

```kotlin
fun Shop.getSetOfCustomers(): Set<Customer> =
    this.customers.toSet()
```

### Sort

```
Learn about collection ordering and the the difference between 
operations in-place on mutable collections and operations returning 
new collections.

Implement a function for returning the list of customers, sorted in 
descending order by the number of orders they have made. Use 
sortedDescending or sortedByDescending.

val strings = listOf("bbb", "a", "cc")
strings.sorted() ==
        listOf("a", "bbb", "cc")

strings.sortedBy { it.length } ==
        listOf("a", "cc", "bbb")

strings.sortedDescending() ==
        listOf("cc", "bbb", "a")

strings.sortedByDescending { it.length } ==
        listOf("bbb", "cc", "a")
```

Solution

```kotlin
// Return a list of customers, sorted in the descending by number of orders they have made
fun Shop.getCustomersSortedByOrders(): List<Customer> =
    this.customers.toList().sortedByDescending { it.orders.size }
```

### Filter map

```

```

Solution

```kotlin

```

### All Any and other predicates

```

```

Solution

```kotlin

```

### Max min

```

```

Solution

```kotlin

```

### Sum

```

```

Solution

```kotlin

```

### GroupBy

```

```

Solution

```kotlin

```

### Associate

```

```

Solution

```kotlin

```

### Partition

```

```

Solution

```kotlin

```

### FlatMap

```

```

Solution

```kotlin

```

### Fold

```

```

Solution

```kotlin

```

### Compound tasks

```

```

Solution

```kotlin

```

### Getting used to new style

```

```

Solution

```kotlin

```

### Sequences

```

```

Solution

```kotlin

```

## Properties

### Properties

```

```

Solution

```kotlin

```

### Lazy property

```

```

Solution

```kotlin

```

### Delegates examples

```

```

Solution

```kotlin

```

### Delegates how it works

```

```

Solution

```kotlin

```

## Builders

### Function literals with receiver

```

```

Solution

```kotlin

```

### String and map builders

```

```

Solution

```kotlin

```

### The function apply

```

```

Solution

```kotlin

```

### Html builders

```

```

Solution

```kotlin

```

### Builders how it works

```

```

Solution

```kotlin

```

### Builders implementation

```

```

Solution

```kotlin

```

## Generics

### Generic functions

```

```

Solution

```kotlin

```


