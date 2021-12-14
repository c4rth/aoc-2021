package org.carth.aoc21.common

import java.io.File
import java.net.URI

internal object Resources {
    fun resourceAsString(fileName: String, delimiter: String = ""): String =
        resourceAsListOfString(fileName).reduce { a, b -> "$a$delimiter$b" }

    fun resourceAsText(fileName: String): String =
        File(fileName.toURI()).readText()

    fun resourceAsListOfString(fileName: String): List<String> =
        File(fileName.toURI()).readLines()

    fun resourceAsListOfInt(fileName: String): List<Int> =
        resourceAsListOfString(fileName).map { it.toInt() }

    fun resourceAsListOfLong(fileName: String): List<Long> =
        resourceAsListOfString(fileName).map { it.toLong() }

    fun testInputAsListOfString(day: String, suffix : String = ""): List<String> =
        File("$day/test$suffix.txt".toURI()).readLines()

    fun testInputAsListOfInt(day: String, suffix : String = ""): List<Int> =
        testInputAsListOfString(day, suffix).map { it.toInt() }

    fun inputAsListOfString(day: String): List<String> =
        File("$day/input.txt".toURI()).readLines()

    fun inputAsListOfInt(day: String): List<Int> =
        inputAsListOfString(day).map { it.toInt() }


    private fun String.toURI(): URI =
        Resources.javaClass.classLoader.getResource(this)?.toURI() ?: throw IllegalArgumentException("Cannot find Resource: $this")
}