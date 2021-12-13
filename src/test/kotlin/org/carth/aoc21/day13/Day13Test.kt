package org.carth.aoc21.day13

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

class Day13Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day13PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {

            // Act
            val answer = Day13(resourceAsListOfString("day13_test.txt")).solvePartOne()

            // Assert
            assertEquals(17, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day13(resourceAsListOfString("day13.txt")).solvePartOne()

            // Assert
            assertEquals(788, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day13PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day13(resourceAsListOfString("day13_test.txt")).solvePartTwo()

            // Assert
            assertEquals(0, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {

            // Act
            val answer = Day13(resourceAsListOfString("day13.txt")).solvePartTwo()

            // Assert
            assertEquals(0, answer)
        }
    }
}