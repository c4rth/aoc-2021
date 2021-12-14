package org.carth.aoc21.day14

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

class Day14Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day14PartOneTest {
        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day14(resourceAsListOfString("day14_test.txt")).solvePartOne()

            // Assert
            assertEquals(1588, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {

            // Act
            val answer = Day14(resourceAsListOfString("day14.txt")).solvePartOne()

            // Assert
            assertEquals(2587, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day14PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day14(resourceAsListOfString("day14_test.txt")).solvePartTwo()

            // Assert
            assertEquals(2188189693529, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day14(resourceAsListOfString("day14.txt")).solvePartTwo()
            // Assert
            assertEquals(3318837563123, answer)
        }
    }
}