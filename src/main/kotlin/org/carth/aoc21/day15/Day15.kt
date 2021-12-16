package org.carth.aoc21.day15

import org.carth.aoc21.common.Puzzle
import java.util.PriorityQueue

class Node(val l: Int, val c: Int, val weight: Int)

class Day15(private val data: List<String>) : Puzzle<Int, Int>() {

    override fun solvePartOne(): Int {
        val grid = data.map { line -> line.map { it.digitToInt() }.toIntArray() }.toTypedArray()
        return solve(grid)
    }

    override fun solvePartTwo(): Int {
        val size = data.size
        val grid = Array(size * 5) { IntArray(size * 5) }
        repeat(size * 5) { l ->
            val ll = l / size
            repeat(size * 5) { c ->
                grid[l][c] = (data[l % size][c % size].digitToInt() + (ll + c / size)).let { weight -> if (weight < 10) weight else weight - 9 }
            }
        }
        return solve(grid)
    }

    private fun solve(grid: Array<IntArray>): Int {
        val sizeL = grid.indices
        val sizeC = grid[0].indices
        val queue = PriorityQueue<Node> { node1, node2 -> if (node1.weight > node2.weight) 1 else -1 }.apply { add(Node(0, 0, 0)) }
        val weights = Array(grid.size) { Array(grid.size) { Int.MAX_VALUE } }.also { it[0][0] = 0 }
        while (queue.isNotEmpty()) {
            val node = queue.poll()
            listOf(
                node.l to node.c + 1,
                node.l to node.c - 1,
                node.l + 1 to node.c,
                node.l - 1 to node.c
            ).filter { (l, c) -> (l in sizeL) && (c in sizeC) }
                .forEach { (l, c) ->
                    val newWeight = node.weight + grid[l][c]
                    if (newWeight < weights[l][c]) {
                        weights[l][c] = newWeight
                        queue.add(Node(l, c, weights[l][c]))
                    }
                }
        }
        return weights.last().last()
    }

}