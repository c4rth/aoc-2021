package org.carth.aoc21.day18

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day18"

class Day18Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day18PartOneTest {

        @Test
        @Order(2)
        fun `solve part one of sample 1`() {
            // Act
            val answer = Day18(testInputAsListOfString(DAY,"1")).solvePartOne()

            // Assert
            assertEquals(3488, answer)
        }

        @Test
        @Order(3)
        fun `solve part one of sample 2`() {
            // Act
            val answer = Day18(testInputAsListOfString(DAY,"2")).solvePartOne()

            // Assert
            assertEquals(4140, answer)
        }

        @Test
        @Order(4)
        fun `solve part one`() {
            // Act
            val answer = Day18(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(4111, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day18PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day18(testInputAsListOfString(DAY, "2")).solvePartTwo()

            // Assert
            assertEquals(3993, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day18(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals(4917, answer)
        }
    }
}