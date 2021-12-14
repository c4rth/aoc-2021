package org.carth.aoc21.day14

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day14"

class Day14Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day14PartOneTest {
        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day14(testInputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(1588, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {

            // Act
            val answer = Day14(inputAsListOfString(DAY)).solvePartOne()

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
            val answer = Day14(testInputAsListOfString(DAY)).solvePartTwo()

            // Assert
            assertEquals(2188189693529, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day14(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals(3318837563123, answer)
        }
    }
}