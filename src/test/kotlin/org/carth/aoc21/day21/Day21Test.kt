package org.carth.aoc21.day21

import org.carth.aoc21.common.Resources.inputAsListOfString
import org.carth.aoc21.common.Resources.testInputAsListOfString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

private const val DAY = "day21"

class Day21Tests {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day21PartOneTest {

        @Test
        @Order(1)
        fun `solve part one of sample`() {
            // Act
            val answer = Day21(testInputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(739_785, answer)
        }

        @Test
        @Order(2)
        fun `solve part one`() {
            // Act
            val answer = Day21(inputAsListOfString(DAY)).solvePartOne()

            // Assert
            assertEquals(598_416, answer)
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation::class)
    inner class Day21PartTwoTest {

        @Test
        @Order(1)
        fun `solve part two of sample`() {
            // Act
            val answer = Day21(testInputAsListOfString(DAY)).solvePartTwo()

            // Assert
            assertEquals(444_356_092_776_315, answer)
        }

        @Test
        @Order(2)
        fun `solve part two`() {
            // Act
            val answer = Day21(inputAsListOfString(DAY)).solvePartTwo()
            // Assert
            assertEquals(27_674_034_218_179, answer)
        }
    }
}