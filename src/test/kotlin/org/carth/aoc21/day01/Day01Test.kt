package org.carth.aoc21.day01

import org.carth.aoc21.common.Resources.resourceAsListOfInt
import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day01DevTest {

    private val input = listOf(1721, 979, 366, 299, 675, 1456)

    @Test
    fun solvePartOne() {
        // Act
        val answer = Day01(input).solvePartOne()

        // Assert
        assertEquals(answer, 514_579)
    }

    @Test
    fun solvePartTwo() {
        // Act
        val answer = Day01(input).solvePartTwo()

        // Assert
        assertEquals(answer, 241_861_950)
    }
}
internal class Day01Test {

    @Test
    fun solvePartOne() {
        // Act
        val answer = Day01(resourceAsListOfInt("day01.txt")).solvePartOne()

        // Assert
        assertEquals(answer, 181_044)
    }

    @Test
    fun solvePartTwo() {
        // Act
        val answer = Day01(resourceAsListOfInt("day01.txt")).solvePartTwo()

        // Assert
        assertEquals(answer, 82_660_352)
    }
}