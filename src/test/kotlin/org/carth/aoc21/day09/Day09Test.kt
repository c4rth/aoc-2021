package org.carth.aoc21.day09

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

class Day09Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day09PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day09(resourceAsListOfString("day09_test.txt")).solvePartOne()

            // Assert
            assertEquals(15, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day09(resourceAsListOfString("day09.txt")).solvePartOne()

            // Assert
            assertEquals(496, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day09PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day09(resourceAsListOfString("day09_test.txt")).solvePartTwo()

            // Assert
            assertEquals(1134, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day09(resourceAsListOfString("day09.txt")).solvePartTwo()
            // Assert
            assertEquals(902880, answer)
        }
    }
}