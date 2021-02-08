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
Check out the function syntax and change the code to make the function start return the string "OK".
```

Solution

```kotlin
fun start(): String = "OK" 
```

### Named arguments

```
Make the function joinOptions() return the list in a JSON format (e.g., "[a, b, c]") by specifying only two arguments.

Default and named arguments help to minimize the number of overloads and improve the readability of the function invocation. The library function joinToString is declared with default values for parameters:

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

```

Solution

```kotlin

```

### Triple-quoted strings

```

```

Solution

```kotlin

```

### String templates

```

```

Solution

```kotlin

```

### Nullable types

```

```

Solution

```kotlin

```

### Nothing types

```

```

Solution

```kotlin

```

### Lambdas

```

```

Solution

```kotlin

```

## Classes

### Data classes

```

```

Solution

```kotlin

```

### Smart casts

```

```

Solution

```kotlin

```

### Sealed classes

```

```

Solution

```kotlin

```

### Rename on import

```

```

Solution

```kotlin

```

### Extension functions

```

```

Solution

```kotlin

```

## Conventions

### Comparison

```

```

Solution

```kotlin

```

### Ranges

```

```

Solution

```kotlin

```

### For loop

```

```

Solution

```kotlin

```

### Operators overloading

```

```

Solution

```kotlin

```

### Invoke

```

```

Solution

```kotlin

```

## Collections

### Introduction

```

```

Solution

```kotlin

```

### Sort

```

```

Solution

```kotlin

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


