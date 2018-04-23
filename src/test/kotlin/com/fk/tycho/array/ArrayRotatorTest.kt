package com.fk.tycho.array

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ArrayRotatorTest {

    lateinit var alg: ArrayRotator

    @Before
    fun setup() {
        alg = ArrayRotator()
    }

    @Test
    fun checkRotation() {
        assertArrayEquals(arrayOf(6, 0, 1, 2, 3, 4, 5), alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 1))
        assertArrayEquals(arrayOf(5, 6, 0, 1, 2, 3, 4), alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 2))
        assertArrayEquals(arrayOf(4, 5, 6, 0, 1, 2, 3), alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 3))
        assertArrayEquals(arrayOf(3, 4, 5, 6, 0, 1, 2), alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 4))
        assertArrayEquals(arrayOf(2, 3, 4, 5, 6, 0, 1), alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 5))
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6, 0), alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 6))
        assertArrayEquals(arrayOf(0, 1, 2, 3, 4, 5, 6), alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 7))
        assertArrayEquals(arrayOf(6, 0, 1, 2, 3, 4, 5), alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 8))
    }
}