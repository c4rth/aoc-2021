package org.carth.aoc21.day01

import org.carth.aoc21.common.Resources.resourceAsListOfInt
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

class Day01Test {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day01PartOneTest {

        @Test
        @Order(1)
        fun `solve part one sample`() {

            // Act
            val answer = Day01(resourceAsListOfInt("day01_test.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 7)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day01(resourceAsListOfInt("day01.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 1564)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day01PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two sample`() {
            // Act
            val answer = Day01(resourceAsListOfInt("day01_test.txt")).solvePartTwo()

            // Assert
            assertEquals(answer, 5)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day01(resourceAsListOfInt("day01.txt")).solvePartTwo()
            // Assert
            assertEquals(answer, 1611)
        }
    }
}