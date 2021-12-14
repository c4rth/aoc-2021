package org.carth.aoc21.day10

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day10"

class Day10Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day10PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day10(testInputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(26397, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day10(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(462693, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day10PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day10(testInputAsListOfString(DAY)).solvePartTwo()

            // Assert
            assertEquals(288957, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day10(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals(3094671161, answer)
        }
    }
}