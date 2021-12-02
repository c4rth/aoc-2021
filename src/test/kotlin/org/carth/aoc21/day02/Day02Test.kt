package org.carth.aoc21.day02

import org.carth.aoc21.common.Resources
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day02Test {
    internal class Day02PartOneTest {

        @Test
        fun solveSamplePartOne() {
            // Act
            val answer = Day02(Resources.resourceAsListOfString("day02_test.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 150)
        }

        @Test
        fun solvePartOne() {
            // Act
            val answer = Day02(Resources.resourceAsListOfString("day02.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 1693300)
        }
    }

    internal class Day02PartTwoTest {

        @Test
        fun solveSamplePartTwo() {
            // Act
            val answer = Day02(Resources.resourceAsListOfString("day02_test.txt")).solvePartTwo()

            // Assert
            assertEquals(answer, 900)
        }

        @Test
        fun solvePartTwo() {
            // Act
            val answer = Day02(Resources.resourceAsListOfString("day02.txt")).solvePartTwo()
            // Assert
            assertEquals(answer, 1857958050)
        }
    }
}