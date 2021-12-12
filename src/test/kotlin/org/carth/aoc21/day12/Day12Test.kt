package org.carth.aoc21.day12

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

class Day12Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day12PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample 1`() {
            // Act
            val answer = Day12(resourceAsListOfString("day12_a_test.txt")).solvePartOne()

            // Assert
            assertEquals(10, answer)
        }

        @Test
        @Order(2)
        fun `solve part one of sample 2`() {
            // Act
            val answer = Day12(resourceAsListOfString("day12_b_test.txt")).solvePartOne()

            // Assert
            assertEquals(19, answer)
        }

        @Test
        @Order(3)
        fun `solve part one of sample 3`() {
            // Act
            val answer = Day12(resourceAsListOfString("day12_c_test.txt")).solvePartOne()

            // Assert
            assertEquals(226, answer)
        }

        @Test
        @Order(4)
        fun `solve part one`() {
            // Act
            val answer = Day12(resourceAsListOfString("day12.txt")).solvePartOne()

            // Assert
            assertEquals(4749, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day12PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample 1`() {
            // Act
            val answer = Day12(resourceAsListOfString("day12_a_test.txt")).solvePartTwo()

            // Assert
            assertEquals(36, answer)
        }

        @Test
        @Order(2)
        fun `solve part two of sample 2`() {
            // Act
            val answer = Day12(resourceAsListOfString("day12_b_test.txt")).solvePartTwo()

            // Assert
            assertEquals(103, answer)
        }

        @Test
        @Order(3)
        fun `solve part two of sample 3`() {
            // Act
            val answer = Day12(resourceAsListOfString("day12_c_test.txt")).solvePartTwo()

            // Assert
            assertEquals(3509, answer)
        }

        @Test
        @Order(4)
        fun `solve part two`() {
            // Act
            val answer = Day12(resourceAsListOfString("day12.txt")).solvePartTwo()
            // Assert
            assertEquals(123054, answer)
        }
    }
}