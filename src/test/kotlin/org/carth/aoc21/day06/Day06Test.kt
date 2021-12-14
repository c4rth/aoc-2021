package org.carth.aoc21.day06

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day06"

class Day06Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day06PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day06(testInputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(5934, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day06(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(396210, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day06PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day06(testInputAsListOfString(DAY)).solvePartTwo()

            // Assert
            assertEquals(26984457539, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day06(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals(1770823541496, answer)
        }
    }
 }