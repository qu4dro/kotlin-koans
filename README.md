# Kotlin Koans tasks

These are my solutions to [Kotlin Koans](https://play.kotlinlang.org/koans/overview)
* Introduction
    * [Hello, world!](https://github.com/qu4dro/kotlin-koans/tree/test/#hello-world)
    * [Named arguments](https://github.com/qu4dro/kotlin-koans/blob/main/Introduction/Named%20arguments/src/Task.kt)
    * [Default arguments](https://github.com/qu4dro/kotlin-koans/blob/main/Introduction/Default%20arguments/src/Task.kt)
    * [Triple-quoted strings](https://github.com/qu4dro/kotlin-koans/blob/main/Introduction/Triple-quoted%20strings/src/Task.kt)
    * [String templates](https://github.com/qu4dro/kotlin-koans/blob/main/Introduction/String%20templates/src/Task.kt)
    * [Nullable types](https://github.com/qu4dro/kotlin-koans/blob/main/Introduction/Nullable%20types/src/Task.kt)
    * [Nothing types](https://github.com/qu4dro/kotlin-koans/blob/main/Introduction/Nothing%20type/src/Task.kt)
    * [Lambdas](https://github.com/qu4dro/kotlin-koans/blob/main/Introduction/Lambdas/src/Task.kt)

* Classes
    * [Data classes](https://github.com/qu4dro/kotlin-koans/blob/main/Classes/Data%20classes/src/Task.kt)
    * [Smart casts](https://github.com/qu4dro/kotlin-koans/blob/main/Classes/Smart%20casts/src/Task.kt)
    * [Sealed classes](https://github.com/qu4dro/kotlin-koans/blob/main/Classes/Sealed%20classes/src/Task.kt)
    * [Rename on import](https://github.com/qu4dro/kotlin-koans/blob/main/Classes/Rename%20on%20import/src/Task.kt)
    * [Extension functions](https://github.com/qu4dro/kotlin-koans/blob/main/Classes/Extension%20functions/src/Task.kt)

* Conventions
    * [Comparison](https://github.com/qu4dro/kotlin-koans/blob/main/Conventions/Comparison/src/Task.kt)
    * [Ranges](https://github.com/qu4dro/kotlin-koans/blob/main/Conventions/Ranges/src/Task.kt)
    * [For loop](https://github.com/qu4dro/kotlin-koans/blob/main/Conventions/For%20loop/src/Task.kt)
    * [Operators overloading](https://github.com/qu4dro/kotlin-koans/blob/main/Conventions/Operators%20overloading/src/Task.kt)
    * [Invoke](https://github.com/qu4dro/kotlin-koans/blob/main/Conventions/Invoke/src/Task.kt)

* Collections
    * [Introduction](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/Introduction/src/Task.kt)
    * [Sort](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/Sort/src/Task.kt)
    * [Filter map](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/Filter%20map/src/Task.kt)
    * [All Any and other predicates](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/All%20Any%20and%20other%20predicates/src/Task.kt)
    * [Max min](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/Max%20min/src/Task.kt)
    * [Sum](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/Sum/src/Task.kt)
    * [GroupBy](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/GroupBy/src/Task.kt)
    * [Associate](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/Associate/src/Task.kt)
    * [Partition](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/Partition/src/Task.kt)
    * [FlatMap](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/FlatMap/src/Task.kt)
    * [Fold](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/Fold/src/Task.kt)
    * [Compound tasks](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/Compound%20tasks/src/Task.kt)
    * [Getting used to new style](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/Getting%20used%20to%20new%20style/src/Task.kt)
    * [Sequences](https://github.com/qu4dro/kotlin-koans/blob/main/Collections/Sequences/src/Task.kt)

* Properties
    * [Properties](https://github.com/qu4dro/kotlin-koans/blob/main/Properties/Properties/src/Task.kt)
    * [Lazy property](https://github.com/qu4dro/kotlin-koans/blob/main/Properties/Lazy%20property/src/Task.kt)
    * [Delegates examples](https://github.com/qu4dro/kotlin-koans/blob/main/Properties/Delegates%20examples/src/Task.kt)
    * [Delegates how it works](https://github.com/qu4dro/kotlin-koans/blob/main/Properties/Delegates%20how%20it%20works/src/Task.kt)

* Builders
    * [Function literals with receiver](https://github.com/qu4dro/kotlin-koans/blob/main/Builders/Function%20literals%20with%20receiver/src/Task.kt)
    * [String and map builders](https://github.com/qu4dro/kotlin-koans/blob/main/Builders/String%20and%20map%20builders/src/Task.kt)
    * [The function apply](https://github.com/qu4dro/kotlin-koans/blob/main/Builders/The%20function%20apply/src/Task.kt)
    * [Html builders](https://github.com/qu4dro/kotlin-koans/blob/main/Builders/Html%20builders/src/Task.kt)
    * [Builders how it works](https://github.com/qu4dro/kotlin-koans/blob/main/Builders/Builders%20how%20it%20works/src/Task.kt)
    * [Builders implementation](https://github.com/qu4dro/kotlin-koans/blob/main/Builders/Builders%20implementation/src/Task.kt)

* Generics
    * [Generic functions](https://github.com/qu4dro/kotlin-koans/blob/main/Generics/Generic%20functions/src/Task.kt)

## Introduction

### Hello World!
```
Simple Functions

Take a look at function syntax and make the function start return the string "OK".

In the tasks the function TODO() is used that throws an exception. 
Your job during the koans will be to replace this function invocation with 
a meaningful code according to the problem.
```

Solution
```kotlin
fun start() = "OK"
```