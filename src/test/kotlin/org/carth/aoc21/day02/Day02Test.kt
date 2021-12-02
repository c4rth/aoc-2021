package org.carth.aoc21.day02

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class Day02Test {

    @Nested
    inner class Day02PartOneTest {

        @Test
        fun `solve part one sample`() {
            // Act
            val answer = Day02(resourceAsListOfString("day02_test.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 150)
        }

        @Test
        fun `solve part one`() {
            // Act
            val answer = Day02(resourceAsListOfString("day02.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 1693300)
        }
    }

    @Nested
    inner class Day02PartTwoTest {

        @Test
        fun `solve part two sample`() {
            // Act
            val answer = Day02(resourceAsListOfString("day02_test.txt")).solvePartTwo()

            // Assert
            assertEquals(answer, 900)
        }

        @Test
        fun `solve part two`() {
            // Act
            val answer = Day02(resourceAsListOfString("day02.txt")).solvePartTwo()
            // Assert
            assertEquals(answer, 1857958050)
        }
    }
}