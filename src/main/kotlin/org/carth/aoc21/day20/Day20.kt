package org.carth.aoc21.day20

import org.carth.aoc21.common.Puzzle

class Day20(private val data: List<String>) : Puzzle<Int, Int>() {
    override fun solvePartOne(): Int {
        return solve(2)
    }

    override fun solvePartTwo(): Int {
        return solve(50)
    }

    private fun solve(times: Int): Int {
        var (algo, image) = parse()
        var default = 0
        repeat(times) {
            val nextImage = HashMap<Pair<Int, Int>, Int>()
            image.keys.forEach { (l, c) ->
                for (il in -1..1) {
                    for (ic in -1..1) {
                        val valBin = getBinary(image, l + il, c + ic, default)
                        nextImage[(l + il) to (c + ic)] = algo[valBin]
                    }
                }
            }
            default = if (default == 0) algo[0] else algo.last()
            image = nextImage
        }
        return image.values.sum()
    }

    private fun getBinary(image: MutableMap<Pair<Int, Int>, Int>, l: Int, c: Int, default: Int): Int {
        return listOf(
            l - 1 to c - 1, l - 1 to c, l - 1 to c + 1,
            l to c - 1, l to c, l to c + 1,
            l + 1 to c - 1, l + 1 to c, l + 1 to c + 1
        ).fold(0) { acc, i -> acc * 2 + image.getOrDefault(i,default) }
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