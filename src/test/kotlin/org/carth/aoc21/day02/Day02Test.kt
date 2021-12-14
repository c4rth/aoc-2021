package org.carth.aoc21.day02

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day02"

class Day02Test {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day02PartOneTest {

        @Test
        @Order(1)
        fun `solve part one sample`() {
            // Act
            val answer = Day02(testInputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(150, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day02(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(1693300, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day02PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two sample`() {
            // Act
            val answer = Day02(testInputAsListOfString(DAY)).solvePartTwo()

            // Assert
            assertEquals(900, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day02(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals(1857958050, answer)
        }
    }
}