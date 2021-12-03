package org.carth.aoc21.day03

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class Day03Tests {

    @Nested
    inner class Day03PartOneTest {

        @Test
        fun `solve part one of sample`() {
            // Act
            val answer = Day03(resourceAsListOfString("day03_test.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 198)
        }

        @Test
        fun `solve part one`() {
            // Act
            val answer = Day03(resourceAsListOfString("day03.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 3148794)
        }
    }

    @Nested
    inner class Day03PartTwoTest {

        @Test
        fun `solve part two of sample`() {

            // Act
            val answer = Day03(resourceAsListOfString("day03_test.txt")).solvePartTwo()

            // Assert
            assertEquals(answer, 230)
        }

        @Test
        fun `solve part two`() {
            // Act
            val answer = Day03(resourceAsListOfString("day03.txt")).solvePartTwo()
            // Assert
            assertEquals(answer, 2795310)
        }
    }
}