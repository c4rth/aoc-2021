package org.carth.aoc21.day03

import org.carth.aoc21.common.Puzzle

class Day03(private val data: List<String>) : Puzzle<Int, Int>() {

    override fun solvePartOne(): Int {
        val length = data.first().length - 1
        val counterOf1 = IntArray(length + 1) { 0 }
        val counterOf0 = IntArray(length +1 ) { 0 }
        for (index in 0..length) {
            data.forEach { line ->
                if (line[index] == '1') counterOf1[index] += 1 else counterOf0[index] += 1
            }
        }
        var gamma = ""
        var epsilon = ""
        for (index in 0..length) {
            if (counterOf1[index] >= counterOf0[index]) {
                gamma += "1"
                epsilon += "0"
            } else {
                gamma += "0"
                epsilon += "1"
            }
        }
        println("gamma : $gamma - ${gamma.toInt(2)}")
        println("epsilon : $epsilon- ${epsilon.toInt(2)}")
        return gamma.toInt(2) * epsilon.toInt(2)
    }

    override fun solvePartTwo(): Int {
        var index = 0
        var dataOxygen = data.toMutableList()
        while (dataOxygen.size > 1) {
            var counterOf1 = 0
            var counterOf0 = 0
            dataOxygen.forEach { line ->
                if (line[index] == '1') counterOf1 += 1 else counterOf0 += 1
            }
            val mostFound = if (counterOf1 >= counterOf0) '1' else '0'
            val newData = mutableListOf<String>()
            dataOxygen.forEach { line ->
                if (line[index] == mostFound) newData += line
            }
            dataOxygen = newData
            index++
            println(dataOxygen)
        }
        val oxygen = dataOxygen.first()
        println("oxygen : $oxygen - ${oxygen.toInt(2)}")

        index = 0
        var dataCo2 = data.toMutableList()
        while (dataCo2.size > 1) {
            var counterOf1 = 0
            var counterOf0 = 0
            dataCo2.forEach { line ->
                if (line[index] == '1') counterOf1 += 1 else counterOf0 += 1
            }
            val mostFound = if (counterOf0 <= counterOf1) '0' else '1'
            val newData = mutableListOf<String>()
            dataCo2.forEach { line ->
                if (line[index] == mostFound) newData += line
            }
            dataCo2 = newData
            index++
            println(dataCo2)
        }
        val co2 = dataCo2.first()
        println("co2 : $co2 - ${co2.toInt(2)}")

        return oxygen.toInt(2) * co2.toInt(2)
    }
}