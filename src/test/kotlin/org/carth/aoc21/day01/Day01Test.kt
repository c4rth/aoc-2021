package org.carth.aoc21.day01

import org.carth.aoc21.common.Resources.inputAsListOfInt
import org.carth.aoc21.common.Resources.testInputAsListOfInt
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day01"

class Day01Test {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day01PartOneTest {

        @Test
        @Order(1)
        fun `solve part one sample`() {

            // Act
            val answer = Day01(testInputAsListOfInt(DAY)).solvePartOne()

            // Assert
            assertEquals(7, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day01(inputAsListOfInt(DAY)).solvePartOne()

            // Assert
            assertEquals(1564, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day01PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two sample`() {
            // Act
            val answer = Day01(testInputAsListOfInt(DAY)).solvePartTwo()

            // Assert
            assertEquals(5, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day01(inputAsListOfInt(DAY)).solvePartTwo()
            // Assert
            assertEquals(1611, answer)
        }
    }
}