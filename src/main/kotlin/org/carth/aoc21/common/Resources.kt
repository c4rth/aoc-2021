package org.carth.aoc21.common

import java.io.File
import java.net.URI

internal object Resources {

    fun testInputAsString(day: String, suffix: String = ""): String =
        File("$day/test$suffix.txt".toURI()).readLines().first()

    fun testInputAsListOfString(day: String, suffix: String = ""): List<String> =
        File("$day/test$suffix.txt".toURI()).readLines()

    fun testInputAsListOfInt(day: String, suffix: String = ""): List<Int> =
        testInputAsListOfString(day, suffix).map { it.toInt() }

    fun inputAsString(day: String): String =
        File("$day/input.txt".toURI()).readLines().first()

    fun inputAsListOfString(day: String): List<String> =
        File("$day/input.txt".toURI()).readLines()

    fun inputAsListOfInt(day: String): List<Int> =
        inputAsListOfString(day).map { it.toInt() }

    private fun String.toURI(): URI =
        Resources.javaClass.classLoader.getResource(this)?.toURI() ?: throw IllegalArgumentException("Cannot find Resource: $this")
}