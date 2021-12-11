package org.carth.aoc21.day11

import org.carth.aoc21.common.Puzzle

class Day11(private val data: List<String>) : Puzzle<Int, Int>() {

    override fun solvePartOne(): Int {
        val grid = Grid(data)
        var total = 0
        val toExplode = ArrayDeque<Coord>()
        for (index in 1..100) {
            toExplode.clear()
            grid.increaseLevel(toExplode)
            while (toExplode.isNotEmpty()) {
                val coord = toExplode.removeFirst()
                total += 1
                grid.explode(coord.l - 1, coord.c - 1, toExplode)
                grid.explode(coord.l - 1, coord.c, toExplode)
                grid.explode(coord.l - 1, coord.c + 1, toExplode)
                grid.explode(coord.l, coord.c - 1, toExplode)
                grid.explode(coord.l, coord.c + 1, toExplode)
                grid.explode(coord.l + 1, coord.c - 1, toExplode)
                grid.explode(coord.l + 1, coord.c, toExplode)
                grid.explode(coord.l + 1, coord.c + 1, toExplode)
            }
        }
        return total
    }

    override fun solvePartTwo(): Int {
        val grid = Grid(data)
        val toExplode = ArrayDeque<Coord>()
        var index = 0
        while (true) {
            index += 1
            toExplode.clear()
            grid.increaseLevel(toExplode)
            while (toExplode.isNotEmpty()) {
                val coord = toExplode.removeFirst()
                grid.explode(coord.l - 1, coord.c - 1, toExplode)
                grid.explode(coord.l - 1, coord.c, toExplode)
                grid.explode(coord.l - 1, coord.c + 1, toExplode)
                grid.explode(coord.l, coord.c - 1, toExplode)
                grid.explode(coord.l, coord.c + 1, toExplode)
                grid.explode(coord.l + 1, coord.c - 1, toExplode)
                grid.explode(coord.l + 1, coord.c, toExplode)
                grid.explode(coord.l + 1, coord.c + 1, toExplode)
            }
            if (grid.isSynchro()) return index
        }
    }

}

class Coord(val l: Int, val c: Int)

class Grid(data: List<String>) {
    private val innerGrid = List(12) { IntArray(12) { 100 } }

    init {
        data.forEachIndexed { l, line ->
            line.toList().map { it.code - 48 }.toIntArray().copyInto(innerGrid[l + 1], 1)
        }
    }

    fun isSynchro(): Boolean {
        for (l in 1..10) {
            for (c in 1..10) {
                if (innerGrid[l][c] != 0) return false
            }
        }
        return true
    }

    fun increaseLevel(toExplode: ArrayDeque<Coord>) {
        for (l in 1..10) {
            for (c in 1..10) {
                innerGrid[l][c] += 1
                if (innerGrid[l][c] == 10) {
                    toExplode.add(Coord(l, c))
                    innerGrid[l][c] = 0
                }
            }
        }
    }

    fun explode(l: Int, c: Int, toExplode: ArrayDeque<Coord>) {
        if (innerGrid[l][c] > 0) {
            innerGrid[l][c] += 1
            if (innerGrid[l][c] == 10) {
                toExplode.add(Coord(l, c))
                innerGrid[l][c] = 0
            }
        }
    }
}