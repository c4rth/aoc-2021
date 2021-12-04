package org.carth.aoc21.day02

import org.carth.aoc21.common.Resources.resourceAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

class Day02Test {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day02PartOneTest {

        @Test
        @Order(1)
        fun `solve part one sample`() {
            // Act
            val answer = Day02(resourceAsListOfString("day02_test.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 150)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day02(resourceAsListOfString("day02.txt")).solvePartOne()

            // Assert
            assertEquals(answer, 1693300)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day02PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two sample`() {
            // Act
            val answer = Day02(resourceAsListOfString("day02_test.txt")).solvePartTwo()

            // Assert
            assertEquals(answer, 900)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day02(resourceAsListOfString("day02.txt")).solvePartTwo()
            // Assert
            assertEquals(answer, 1857958050)
        }
    }
}