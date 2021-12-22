package org.carth.aoc21.day22

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day22"

class Day22Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day22PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day22(testInputAsListOfString(DAY,"1")).solvePartOne()

            // Assert
            assertEquals(590784, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day22(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(655005, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day22PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day22(testInputAsListOfString(DAY,"2")).solvePartTwo()

            // Assert
            assertEquals(2758514936282235, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day22(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals(1125649856443608, answer)
        }
    }
}