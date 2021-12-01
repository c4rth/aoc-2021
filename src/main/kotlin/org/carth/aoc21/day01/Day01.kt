package org.carth.aoc21.day01

import org.carth.aoc21.common.Puzzle

class Day01(private val data : List<Int>) : Puzzle<Int, Int>() {

   override fun solvePartOne(): Int {
        return data
            .zipWithNext()
            .filter { (a,b) -> a < b }
            .size
    }

    override fun solvePartTwo(): Int {
        return data.zipWithTriple()
            .map { triple -> triple.first + triple.second + triple.third }
            .zipWithNext()
            .filter { (a, b) -> a < b }
            .size
    }
}

inline fun <T, R> Iterable<T>.zipWithTriple(transform: (a: T, b: T, c:T) -> R): List<R> {
    val iterator = iterator()
    if (!iterator.hasNext()) return emptyList()
    val result = mutableListOf<R>()
    var current = iterator.next()
    if (iterator.hasNext()) {
        var next = iterator.next()
        while (iterator.hasNext()) {
                val next2 = iterator.next()
                result.add(transform(current, next, next2))
                current = next
                next = next2
        }
    }
    return result
}

fun <T> Iterable<T>.zipWithTriple(): List<Triple<T, T, T>> {
    return zipWithTriple { a, b, c -> Triple(a,b,c) }
}