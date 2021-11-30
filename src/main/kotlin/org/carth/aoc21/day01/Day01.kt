package org.carth.aoc21.day01

import org.carth.aoc21.common.Puzzle

class Day01(data : List<Int>) : Puzzle<Int, Int>() {

    private val input = data.sorted()

    override fun solvePartOne(): Int {
        return input.mapIndexedNotNull { idx, a ->
            input
                .drop(idx + 1)
                .dropWhile { a + it < 2020 }
                .take(1)
                .firstOrNull { a + it == 2020 }
                ?.let { a * it }
        }.first()
    }

    override fun solvePartTwo(): Int {
        return input.mapIndexedNotNull { aIdx, a ->
            input
                .drop(aIdx + 1)
                .mapIndexedNotNull { bIdx, b ->
                    input
                        .drop(bIdx + 1)
                        .dropWhile { a + b + it < 2020 }
                        .take(1)
                        .firstOrNull { a + b + it == 2020 }
                        ?.let { a * b * it }
                }.firstOrNull()
        }.first()
    }
}
