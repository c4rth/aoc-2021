package org.carth.aoc21.common

abstract class Puzzle<T1, T2> {
    abstract fun solvePartOne(): T1
    abstract fun solvePartTwo(): T2
}