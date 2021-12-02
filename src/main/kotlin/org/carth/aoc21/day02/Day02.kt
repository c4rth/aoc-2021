package org.carth.aoc21.day02

import org.carth.aoc21.common.Puzzle

class Day02(private val data: List<String>) : Puzzle<Int, Int>() {
    override fun solvePartOne(): Int {
        var horizontal = 0
        var depth = 0
        data.forEach {
            val (command, delta) = Pair(it.substringBefore(' ').trim(), it.substringAfter(' ').trim().toInt())
            when {
                command.startsWith("f") -> horizontal += delta
                command.startsWith("d") -> depth += delta
                command.startsWith("u") -> depth -= delta
            }
        }
        return horizontal * depth
    }

    override fun solvePartTwo(): Int {
        var horizontal = 0
        var depth = 0
        var aim = 0
        data.forEach {
            val (command, delta) = Pair(it.substringBefore(' ').trim(), it.substringAfter(' ').trim().toInt())
            when {
                command.startsWith("f") -> {
                    horizontal += delta
                    depth += (aim * delta)
                }
                command.startsWith("d") -> aim += delta
                command.startsWith("u") -> aim -= delta
            }
        }
        return horizontal * depth
    }
}