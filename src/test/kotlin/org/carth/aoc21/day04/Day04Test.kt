package org.carth.aoc21.day04

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class Day04Tests {

    @Nested
    inner class Day04PartOneTest {

        @Test
        fun `solve part one of sample`() {
            // Act
            val answer = Day04(resourceAsListOfString("day04_test.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 4512)
        }

        @Test
        fun `solve part one`() {
            // Act
            val answer = Day04(resourceAsListOfString("day04.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 6592)
        }
    }

    @Nested
    inner class Day04PartTwoTest {

        @Test
        fun `solve part two of sample`() {
            // Act
            val answer = Day04(resourceAsListOfString("day04_test.txt")).solvePartTwo()

            // Assert
            assertEquals(answer, 1924)
        }

        @Test
        fun `solve part two`() {
            // Act
            val answer = Day04(resourceAsListOfString("day04.txt")).solvePartTwo()
            // Assert
            assertEquals(answer, 31755)
        }
    }
}