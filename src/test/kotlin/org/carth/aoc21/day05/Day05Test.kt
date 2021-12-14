package org.carth.aoc21.day05

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day05"

class Day05Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day05PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day05(testInputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals( 5, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day05(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals( 7473, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day05PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day05(testInputAsListOfString(DAY)).solvePartTwo()

            // Assert
            assertEquals( 12, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day05(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals( 24164, answer)
        }
    }
}