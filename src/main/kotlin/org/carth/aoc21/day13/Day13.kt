package org.carth.aoc21.day13

import org.carth.aoc21.common.Puzzle

class Day13(private val data: List<String>) : Puzzle<Int, Int>() {

    private fun readGridAndFolding(): Pair<List<BooleanArray>, List<Pair<String, Int>>> {
        val folding = mutableListOf<Pair<String, Int>>()
        val points = mutableListOf<Pair<Int, Int>>()
        data.forEach { line ->
            if (line.isNotEmpty()) {
                if (line.first().isDigit()) {
                    val (strC, strL) = line.split(",")
                    points.add(strL.toInt() to strC.toInt())
                } else {
                    val (axis, position) = line.split("=")
                    if (axis.endsWith("y"))
                        folding.add("y" to position.toInt())
                    else
                        folding.add("x" to position.toInt())
                }
            }
        }
        var maxC = 0
        var maxL = 0
        points.forEach { point ->
            maxL = Integer.max(maxL, point.first)
            maxC = Integer.max(maxC, point.second)
        }
        if (maxC % 2 != 0) maxC += 1
        if (maxL % 2 != 0) maxL += 1
        val grid = List(maxL + 1) { BooleanArray(maxC + 1) { false } }
        points.forEach { point ->
            grid[point.first][point.second] = true
        }
        return grid to folding
    }

    override fun solvePartOne(): Int {
        var (previousGrid, folding) = readGridAndFolding()
        var newGrid: List<BooleanArray>
        var total = 0
        folding.first().also { (axis, _) ->
            if (axis == "y") {
                newGrid = List((previousGrid.size - 1) / 2) { BooleanArray(previousGrid[0].size) { false } }
                newGrid.forEachIndexed { indexL, line ->
                    line.forEachIndexed { indexC, _ ->
                        newGrid[indexL][indexC] = previousGrid[indexL][indexC] || previousGrid[previousGrid.size - 1 - indexL][indexC]
                    }
                }

            } else {
                newGrid = List(previousGrid.size) { BooleanArray((previousGrid[0].size - 1) / 2) { false } }
                newGrid.forEachIndexed { indexL, line ->
                    line.forEachIndexed { indexC, _ ->
                        newGrid[indexL][indexC] = previousGrid[indexL][indexC] || previousGrid[indexL][previousGrid[0].size - 1 - indexC]
                    }
                }
            }
            previousGrid = newGrid
            previousGrid.forEach { line ->
                total += line.filter { it }.size
            }
        }
        return total
    }

    override fun solvePartTwo(): Int {
        var (previousGrid, folding) = readGridAndFolding()
        var newGrid: List<BooleanArray>
        folding.forEach { (axis, _) ->
            if (axis == "y") {
                newGrid = List((previousGrid.size - 1) / 2) { BooleanArray(previousGrid[0].size) { false } }
                newGrid.forEachIndexed { indexL, line ->
                    line.forEachIndexed { indexC, _ ->
                        newGrid[indexL][indexC] = previousGrid[indexL][indexC] || previousGrid[previousGrid.size - 1 - indexL][indexC]
                    }
                }

            } else {
                newGrid = List(previousGrid.size) { BooleanArray((previousGrid[0].size - 1) / 2) { false } }
                newGrid.forEachIndexed { indexL, line ->
                    line.forEachIndexed { indexC, _ ->
                        newGrid[indexL][indexC] = previousGrid[indexL][indexC] || previousGrid[indexL][previousGrid[0].size - 1 - indexC]
                    }
                }
            }
            previousGrid = newGrid
        }
        previousGrid.forEach { line ->
            line.forEach { b ->
                if (b) {
                    print("#")
                } else {
                    print(" ")
                }
            }
            println()
        }
        return 0
    }
}