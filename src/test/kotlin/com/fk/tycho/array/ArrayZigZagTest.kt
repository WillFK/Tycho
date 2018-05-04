package com.fk.tycho.array

import org.junit.Before
import org.junit.Test
import org.junit.Assert.*


class ArrayZigZagTest {

    lateinit var alg: ArrayZigZagAlg

    @Before
    fun setup() {
        alg = ArrayZigZagAlg()
    }

    private fun check(array: Array<Int>): Boolean {
        var lower = true
        var last = array[0]
        (1 until array.size).forEach {
            if ((lower && array[it] < last) || (!lower && array[it] > last))
                return false
            lower = !lower
            last = array[it]
        }
        return true
    }

    private fun test(array: Array<Int>) {
        array.forEach { print("$it, ") }
        println()
        alg.doIt(array)
        array.forEach { print("$it, ") }
        println()
        assert(check(array))
    }

    private fun genArray(): Array<Int> {
        val size = 4 + (Math.random() * 27).toInt()
        val array = Array(size) { 0 }

        (0 until 100)
                .map { it }
                .toMutableList()
                .apply {
                    (0 until size).forEach {
                        array[it] = this.removeAt((Math.random() * this.size).toInt())
                    }
                }

        return array
    }

    @Test
    fun checkPredefinedArrays() {
        test(arrayOf(2, 7, 9, 4, 3, 2, 1, 0))
        test(arrayOf(3, 2, 5, 6, 7, 0, 1))
        test(arrayOf(1, 2, 3, 9, 8, 7, 5, 6, 10))
        test(arrayOf(1, 2, 3, 9, 8, 7))
        test(arrayOf(3, 9, 8, 7))
    }

    @Test
    fun checkRandomArrays() {
        // generates a lot of randoms arrays to test it because I have no idea
        // what's a good data set for this sh*t
        (0 until 1000).forEach {
            test(genArray())
        }
    }
}