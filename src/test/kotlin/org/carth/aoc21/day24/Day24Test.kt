package org.carth.aoc21.day24

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day24"

class Day24Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day24PartOneTest {

        @Test
        @Order(1)
        fun `solve part one`() {
            // Act
            val answer = Day24(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(59_692_994_994_998, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day24PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two`() {
            // Act
            val answer = Day24(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals(16_181_111_641_521, answer)
        }
    }
}