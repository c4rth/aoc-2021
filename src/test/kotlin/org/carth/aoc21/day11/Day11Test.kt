package org.carth.aoc21.day11

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder


class Day11Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day11PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {

            // Act
            val answer = Day11(resourceAsListOfString("day11_test.txt")).solvePartOne()

            // Assert
            assertEquals(1656, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day11(resourceAsListOfString("day11.txt")).solvePartOne()

            // Assert
            assertEquals(1627, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day11PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day11(resourceAsListOfString("day11_test.txt")).solvePartTwo()

            // Assert
            assertEquals(195, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day11(resourceAsListOfString("day11.txt")).solvePartTwo()
            // Assert
            assertEquals(329, answer)
        }
    }
}