package org.carth.aoc21.day08

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

class Day08Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day08PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day08(resourceAsListOfString("day08_test.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 26)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day08(resourceAsListOfString("day08.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 330)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day08PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day08(resourceAsListOfString("day08_test.txt")).solvePartTwo()

            // Assert
            assertEquals(answer, 61229)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day08(resourceAsListOfString("day08.txt")).solvePartTwo()
            // Assert
            assertEquals(answer, 1010472)
        }
    }
}