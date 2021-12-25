package org.carth.aoc21.day23

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day23"

class Day23Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day23PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day23(testInputAsListOfString(DAY,"1")).solvePartOne()

            // Assert
            assertEquals(12521, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day23(inputAsListOfString(DAY,"1")).solvePartOne()

            // Assert
            assertEquals(11536, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day23PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day23(testInputAsListOfString(DAY,"2")).solvePartTwo()

            // Assert
            assertEquals(44169, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day23(inputAsListOfString(DAY,"2")).solvePartTwo()
            // Assert
            assertEquals(55136, answer)
        }
    }
}