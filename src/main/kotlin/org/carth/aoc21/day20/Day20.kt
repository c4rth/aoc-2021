package org.carth.aoc21.day20

import org.carth.aoc21.common.Puzzle
import org.carth.aoc21.common.Resources
import kotlin.system.measureTimeMillis

fun main() {
    val ms = measureTimeMillis {
        var input = Resources.testInputAsListOfString("day20")
        println(Day20(input).solvePartOne())

        input = Resources.inputAsListOfString("day20")
        println(Day20(input).solvePartOne())

        var input2 = Resources.testInputAsListOfString("day20")
        println(Day20(input2).solvePartTwo())

        input2 = Resources.inputAsListOfString("day20")
        println(Day20(input2).solvePartTwo())
    }
    println("ms : $ms")
}

class Day20(private val data: List<String>) : Puzzle<Int, Int>() {
    override fun solvePartOne(): Int {
        return solve(2)
    }

    override fun solvePartTwo(): Int {
        return solve(50)
    }

    private fun solve(times: Int): Int {
        var (algorithm, image) = parse()
        var default = 0
        val isInfiniteFlashing = algorithm[0] == 1
        repeat(times) {
            val nextImage = HashMap<Pair<Int, Int>, Int>()
            image.keys.forEach { (l, c) ->
                for (il in -1..1) {
                    for (ic in -1..1) {
                        val valBin = getBinary(image, l + il, c + ic, default)
                        nextImage[(l + il) to (c + ic)] = algorithm[valBin]
                    }
                }
            }
            default = if (isInfiniteFlashing && default == 0) 1 else 0
            image = nextImage
        }
        return image.values.sum()
    }

    private fun getBinary(image: MutableMap<Pair<Int, Int>, Int>, l: Int, c: Int, default: Int): Int {
        var acc = 0
        for (il in -1..1) {
            for (ic in -1..1) {
                acc = acc * 2 + image.getOrDefault((l + il to c + ic), default)
            }
        }
        return acc
    }

    private fun parse(): Pair<Array<Int>, MutableMap<Pair<Int, Int>, Int>> {
        val first = data.first().map { if (it == '#') 1 else 0 }.toTypedArray()
        val grid = HashMap<Pair<Int, Int>, Int>()
        data.drop(2).forEachIndexed { l, line ->
            line.forEachIndexed { c, value ->
                grid[l to c] = if (value == '#') 1 else 0
            }
        }
        return first to grid
    }
}