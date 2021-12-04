package org.carth.aoc21.day04

import org.carth.aoc21.common.Puzzle
import org.carth.aoc21.day03.Card

class Day04(private val data: List<String>) : Puzzle<Int, Int>() {

    private val gridSize = 5

    private fun getCards() : List<Card> {
        val cards = mutableListOf<Card>()
        var index = 2
        while (index < data.size) {
            val line = StringBuilder()
            for (index2 in 0..4) {
                line.append(data[index + index2]).append(" ")
            }
            Card(gridSize).let { bingo ->
                bingo.setNumbers(line.toString().replace("  ", " ").trim().split(" "))
                cards.add(bingo)
            }
            index += 6
        }
        return cards
    }

    override fun solvePartOne(): Int {
        val draws = data.first().split(",").map { s: String -> s.toInt() }
        val cards = getCards()
        var winner: Card? = null
        var indexDraw = 0
        println("card size : ${cards.size}")
        while (null == winner && indexDraw < draws.size) {
            cards.forEach {
                it.checkNumber(draws[indexDraw])
            }
            winner = cards.firstOrNull { card -> card.isWinner }
            if (null == winner) {
                indexDraw++
            }
        }
        if (null != winner) {
            println("Winner found")
            println(winner.cardNumbers)
            println("${draws[indexDraw]} ${winner.sumOfNonChecked}")
            return draws[indexDraw] * winner.sumOfNonChecked
        }
        return 0
    }

    override fun solvePartTwo(): Int {
        val draws = data.first().split(",").map { s: String -> s.toInt() }
        val cards = getCards()
        var numberOfWinners = 0
        var indexDraw = 0
        println("card size : ${cards.size}")
        while (numberOfWinners < cards.size && indexDraw < draws.size) {
            cards.forEach {
                it.checkNumber(draws[indexDraw])
            }
            numberOfWinners = 0
            cards.forEach { card ->
                if (card.isWinner) {
                    card.indexWinnerDraw = indexDraw
                    numberOfWinners++
                }
            }
            if (numberOfWinners < cards.size) {
                indexDraw++
            }
        }
        println("numberOfWinners : $numberOfWinners of ${cards.size}")
        if (numberOfWinners == cards.size) {
            val lastWinner = cards.firstOrNull { card ->
                card.indexWinnerDraw == indexDraw
            }
            if (null != lastWinner) {
                println("Last winner found")
                println(lastWinner.cardNumbers)
                println("${draws[indexDraw]} ${lastWinner.sumOfNonChecked}")
                return draws[indexDraw] * lastWinner.sumOfNonChecked
            }
        }
        return 0
    }
}