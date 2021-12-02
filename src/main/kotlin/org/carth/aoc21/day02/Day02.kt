package org.carth.aoc21.day02

import org.carth.aoc21.common.Puzzle

class Day02(private val data: List<String>) : Puzzle<Int, Int>() {
    override fun solvePartOne(): Int {
        var horizontal = 0
        var depth = 0
        data.forEach {
            val (command, delta) = it.split(" ").let { it[0] to it[1].toInt() }
            when (command) {
                "forward" -> horizontal += delta
                "down" -> depth += delta
                "up" -> depth -= delta
            }
        }
        return horizontal * depth
    }

    override fun solvePartTwo(): Int {
        var horizontal = 0
        var depth = 0
        var aim = 0
        data.forEach {
            val (command, delta) = it.split(" ").let { it[0] to it[1].toInt() }
            when (command) {
                "forward" -> {
                    horizontal += delta
                    depth += aim * delta
                }
                "down" -> aim += delta
                "up" -> aim -= delta
            }
        }
        return horizontal * depth
    }
}