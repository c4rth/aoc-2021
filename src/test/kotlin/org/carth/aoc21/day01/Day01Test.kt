package org.carth.aoc21.day01

import org.carth.aoc21.common.Resources.resourceAsListOfInt
import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day01Test {

    internal class Day01PartOneTest {

        @Test
        fun solveSamplePartOne() {
            // Act
            val answer = Day01(resourceAsListOfInt("day01_test.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 7)
        }

        @Test
        fun solvePartOne() {
            // Act
            val answer = Day01(resourceAsListOfInt("day01.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 1564)
        }
    }

    internal class Day01PartTwoTest {

        @Test
        fun solveSamplePartTwo() {
            // Act
            val answer = Day01(resourceAsListOfInt("day01_test.txt")).solvePartTwo()

            // Assert
            assertEquals(answer, 5)
        }

        @Test
        fun solvePartTwo() {
            // Act
            val answer = Day01(resourceAsListOfInt("day01.txt")).solvePartTwo()
            // Assert
            assertEquals(answer, 1611)
        }
    }
}