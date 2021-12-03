package org.carth.aoc21.day01

import org.carth.aoc21.common.Puzzle

class Day01(private val data : List<Int>) : Puzzle<Int, Int>() {

   override fun solvePartOne(): Int {

        return data
            .windowed(2)
            .filter { (a,b) -> a < b }
            .size
    }

    override fun solvePartTwo(): Int {

        return data.windowed(3)
            .map { it[0] + it[1] + it[2] }
            .windowed(2)
            .filter { (a, b) -> a < b }
            .size
    }
}