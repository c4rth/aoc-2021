package org.carth.aoc21.day12

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day12"

class Day12Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day12PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample 1`() {
            // Act
            val answer = Day12(testInputAsListOfString(DAY,"a")).solvePartOne()

            // Assert
            assertEquals(10, answer)
        }

        @Test
        @Order(2)
        fun `solve part one of sample 2`() {
            // Act
            val answer = Day12(testInputAsListOfString(DAY, "b")).solvePartOne()

            // Assert
            assertEquals(19, answer)
        }

        @Test
        @Order(3)
        fun `solve part one of sample 3`() {
            // Act
            val answer = Day12(testInputAsListOfString(DAY, "c")).solvePartOne()

            // Assert
            assertEquals(226, answer)
        }

        @Test
        @Order(4)
        fun `solve part one`() {
            // Act
            val answer = Day12(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(4749, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day12PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample 1`() {
            // Act
            val answer = Day12(testInputAsListOfString(DAY, "a")).solvePartTwo()

            // Assert
            assertEquals(36, answer)
        }

        @Test
        @Order(2)
        fun `solve part two of sample 2`() {
            // Act
            val answer = Day12(testInputAsListOfString(DAY, "b")).solvePartTwo()

            // Assert
            assertEquals(103, answer)
        }

        @Test
        @Order(3)
        fun `solve part two of sample 3`() {
            // Act
            val answer = Day12(testInputAsListOfString(DAY, "C")).solvePartTwo()

            // Assert
            assertEquals(3509, answer)
        }

        @Test
        @Order(4)
        fun `solve part two`() {
            // Act
            val answer = Day12(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals(123054, answer)
        }
    }
}