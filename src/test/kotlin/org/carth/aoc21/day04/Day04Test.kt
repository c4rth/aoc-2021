package org.carth.aoc21.day04

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day04"

class Day04Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day04PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {

            // Act
            val answer = Day04(testInputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals( 4512, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day04(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals( 6592, answer)
        }
    }

    @Nested
    @Order(2)
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day04PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day04(testInputAsListOfString(DAY)).solvePartTwo()

            // Assert
            assertEquals( 1924, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day04(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals( 31755, answer)
        }
    }
}