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
            assertEquals(answer, 37)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day07(resourceAsListOfString("day07.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 352707)
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
            assertEquals(answer, 168)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day07(resourceAsListOfString("day07.txt")).solvePartTwo()
            // Assert
            assertEquals(answer, 95519693)
        }
    }
}