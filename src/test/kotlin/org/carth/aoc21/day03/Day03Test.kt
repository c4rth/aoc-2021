package org.carth.aoc21.day03

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day03"

class Day03Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day03PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {

            // Act
            val answer = Day03(testInputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals( 198, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day03(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals( 3148794, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day03PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {

            // Act
            val answer = Day03(testInputAsListOfString(DAY)).solvePartTwo()

            // Assert
            assertEquals( 230, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day03(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals( 2795310, answer)
        }
    }
}