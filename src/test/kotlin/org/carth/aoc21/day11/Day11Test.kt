package org.carth.aoc21.day11

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day11"

class Day11Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day11PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {

            // Act
            val answer = Day11(testInputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(1656, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day11(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(1627, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day11PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day11(testInputAsListOfString(DAY)).solvePartTwo()

            // Assert
            assertEquals(195, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day11(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals(329, answer)
        }
    }
}