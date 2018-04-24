package com.fk.tycho.array

import org.junit.Before
import org.junit.Test
import org.junit.Assert.*


class ArraySumTest {

    lateinit var alg: ArraySumAlg

    @Before
    fun setup() {
        alg = ArraySumAlg()
    }

    @Test
    fun checkSums() {
        assertEquals(Pair(1, 3), alg.doIt(arrayOf(1, 2, 3, 4), 6))
        assertEquals(Pair(0, 3), alg.doIt(arrayOf(1, 2, 3, 4), 5))
        assertEquals(Pair(1, 2), alg.doIt(arrayOf(1, 2, 2, 4), 4))
        assertEquals(Pair(2, 3), alg.doIt(arrayOf(1, 2, 3, 4), 7))
        assertEquals(Pair(-1, -1), alg.doIt(arrayOf(1, 2, 3, 4), 10))
    }
}