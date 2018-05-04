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

    @Test
    fun checkLargestSortedArray() {
        test(arrayOf(2, 7, 9, 4, 3, 2, 1, 0))
        test(arrayOf(3, 2, 5, 6, 7, 0, 1))
        test(arrayOf(1, 2, 3, 9, 8, 7, 5, 6, 10))
        test(arrayOf(1, 2, 3, 9, 8, 7))
        test(arrayOf(3, 9, 8, 7))
    }
}