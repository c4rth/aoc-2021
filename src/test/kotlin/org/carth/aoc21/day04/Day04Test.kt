package org.carth.aoc21.day04

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

class Day04Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day04PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {

            // Act
            val answer = Day04(resourceAsListOfString("day04_test.txt")).solvePartOne()

            // Assert
            assertEquals( 4512, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day04(resourceAsListOfString("day04.txt")).solvePartOne()

            // Assert
            assertEquals( 6592, answer)
        }
    }

    @Nested
    @Order(2)
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day04PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day04(resourceAsListOfString("day04_test.txt")).solvePartTwo()

            // Assert
            assertEquals( 1924, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day04(resourceAsListOfString("day04.txt")).solvePartTwo()
            // Assert
            assertEquals( 31755, answer)
        }
    }
}