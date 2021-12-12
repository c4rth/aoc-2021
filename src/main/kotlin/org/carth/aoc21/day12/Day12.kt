package org.carth.aoc21.day12

import org.carth.aoc21.common.Puzzle

class Day12(private val data: List<String>) : Puzzle<Int, Int>() {

    override fun solvePartOne(): Int {
        val edges = readEdges()
        val paths = getPaths(mutableListOf("start"), edges, false)
//        val out = paths.joinToString(",", "(", ")\n") {
//            it.joinToString(",", "(", ")\n")
//        }
//        println("paths : $out")
//        println("paths size : ${paths.size}")
        return paths.size
    }

    override fun solvePartTwo(): Int {
        val edges = readEdges()
        val paths = getPaths(mutableListOf("start"), edges, true)
//        val out = paths.joinToString(",", "(", ")") {
//            it.joinToString(",", "(", ")")
//        }
//        println("paths : $out")
//        println("paths size : ${paths.size}")
        return paths.size

    }

    private fun readEdges(): Map<String, List<String>> {
        val edges = mutableMapOf<String, List<String>>().withDefault { mutableListOf() }
        data.forEach { line ->
            val (start, end) = line.split("-")
            edges[start] = edges.getValue(start) + end
            edges[end] = edges.getValue(end) + start
        }
        return edges
    }

    private fun getPaths(path: MutableList<String>, edges: Map<String, List<String>>, allowTwice: Boolean): List<List<String>> {
        if (path[path.size - 1] == "end") {
            return listOf(path.toMutableList())
        }
        val subPaths = mutableListOf<List<String>>()
        edges.getValue(path[path.size - 1]).forEach { node ->
            if (node.first().isUpperCase() || !path.contains(node)) {
                path.add(node)
                subPaths.addAll(getPaths(path, edges, allowTwice))
                path.removeAt(path.size - 1)
            } else if (allowTwice && node != "start" && node != "end") {
                path.add(node)
                subPaths.addAll(getPaths(path, edges, false))
                path.removeAt(path.size - 1)
            }
        }
        return subPaths
    }
}