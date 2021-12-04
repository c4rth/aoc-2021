package org.carth.aoc21.day03

class Card(private val gridSize: Int) {

    private val numbers: Array<IntArray> = Array(gridSize) { IntArray(gridSize) { 0 } }
    private val checked: Array<BooleanArray> = Array(gridSize) { BooleanArray(gridSize) { false } }

    private var _indexWinnerDraw = -1
    var indexWinnerDraw
        set(value) {
            if (_indexWinnerDraw == -1) _indexWinnerDraw = value
        }
        get() = _indexWinnerDraw

    val cardNumbers: String
        get() {
            val sb = StringBuilder()
            sb.append("index: $indexWinnerDraw\n")
            for (x in 0 until gridSize) {
                for (y in 0 until gridSize) {
                    sb.append(String.format("%2d", numbers[x][y]))
                    if (checked[x][y]) sb.append("*") else sb.append(" ")
                    sb.append(" ")
                }
                sb.append("\n")
            }
            return sb.toString().trim()
        }

    fun setNumbers(numbersAsStrings: List<String>) {
        val numbersList = numbersAsStrings.map { s: String -> s.toInt() }
        var count = 0
        for (x in 0 until gridSize) {
            for (y in 0 until gridSize) {
                numbers[x][y] = numbersList[count]
                count++
            }
        }
    }

    fun checkNumber(number: Int) {
        for (x in 0 until gridSize) {
            for (y in 0 until gridSize) {
                if (numbers[x][y] == number) {
                    checked[x][y] = true
                }
            }
        }
    }

    private fun isBingo(row: BooleanArray): Boolean = row.toList().filter { it }.size == row.size

    val isWinner: Boolean
        get() {
            // check rows
            for (x in 0 until gridSize) {
                if (isBingo(checked[x])) return true
            }
            // check columns
            for (x in 0 until gridSize) {
                val column = BooleanArray(gridSize)
                for (y in 0 until gridSize) {
                    column[y] = checked[y][x]
                }
                if (isBingo(column)) return true
            }
            return false
        }

    val sumOfNonChecked: Int
        get() {
            var sum = 0
            for (x in 0 until gridSize) {
                for (y in 0 until gridSize) {
                    if (!checked[x][y]) sum += numbers[x][y]
                }
            }
            return sum
        }
}