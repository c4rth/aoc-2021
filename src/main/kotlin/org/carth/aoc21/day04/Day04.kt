package org.carth.aoc21.day04

import org.carth.aoc21.common.Puzzle
import org.carth.aoc21.day03.Grid

class Day04(private val data: List<String>) : Puzzle<Int, Int>() {

    private fun getGrids(): List<Grid> =
        data.drop(1).chunked(6).map { list ->
            Grid(list.takeLast(5))
        }

    override fun solvePartOne(): Int {
        val draws = data.first().split(",").map { s: String -> s.toInt() }
        val grids = getGrids()
        var winner: Grid? = null
        var indexDraw = 0
        println("card size : ${grids.size}")
        for (index in draws.indices) {
            grids.forEach { grid ->
                grid.checkNumber(draws[index])
            }
            winner = grids.firstOrNull { card -> card.isWinner() }
            if (winner != null) {
                indexDraw = index
                break
            }
        }
        if (null != winner) {
            println("Winner found")
            println(winner)
            println("result = ${draws[indexDraw]} * ${winner.sumOfNonChecked}")
            return draws[indexDraw] * winner.sumOfNonChecked
        }
        return 0
    }

    override fun solvePartTwo(): Int {
        val draws = data.first().split(",").map { s: String -> s.toInt() }
        val grids = getGrids()
        var numberOfWinners = 0
        var indexDraw = 0
        println("card size : ${grids.size}")
        for (index in draws.indices) {
            grids.forEach {
                it.checkNumber(draws[index])
            }
            numberOfWinners = grids.filter { card ->
                card.isWinnerWithDrawIndex(index)
            }.size
            if (numberOfWinners == grids.size) {
                indexDraw = index
                break
            }
        }
        println("numberOfWinners : $numberOfWinners of ${grids.size}")
        if (numberOfWinners == grids.size) {
            val lastWinner = grids.first { card ->
                card.indexWinnerDraw == indexDraw
            }
            println("Last winner found")
            println(lastWinner)
            println("result = ${draws[indexDraw]} * ${lastWinner.sumOfNonChecked}")
            return draws[indexDraw] * lastWinner.sumOfNonChecked
        }
        return 0
    }
}