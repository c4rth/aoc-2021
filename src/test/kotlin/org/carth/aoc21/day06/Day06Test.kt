package org.carth.aoc21.day06

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

class Day06Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day06PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day06(resourceAsListOfString("day06_test.txt")).solvePartOne()

            // Assert
            assertEquals(5934, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day06(resourceAsListOfString("day06.txt")).solvePartOne()

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
            val answer = Day06(resourceAsListOfString("day06_test.txt")).solvePartTwo()

            // Assert
            assertEquals(26984457539, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day06(resourceAsListOfString("day06.txt")).solvePartTwo()
            // Assert
            assertEquals(1770823541496, answer)
        }
    }
 }