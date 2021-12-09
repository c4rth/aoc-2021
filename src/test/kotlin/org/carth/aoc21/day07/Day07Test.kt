package org.carth.aoc21.day07

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

class Day07Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day07PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day07(resourceAsListOfString("day07_test.txt")).solvePartOne()

            // Assert
            assertEquals(37, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day07(resourceAsListOfString("day07.txt")).solvePartOne()

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
            val answer = Day07(resourceAsListOfString("day07_test.txt")).solvePartTwo()

            // Assert
            assertEquals(168, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day07(resourceAsListOfString("day07.txt")).solvePartTwo()
            // Assert
            assertEquals(95519693, answer)
        }
    }
}