package org.carth.aoc21.day07

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day07"

class Day07Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day07PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day07(testInputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(37, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day07(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(352707, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day07PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day07(testInputAsListOfString(DAY)).solvePartTwo()

            // Assert
            assertEquals(168, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day07(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals(95519693, answer)
        }
    }
}