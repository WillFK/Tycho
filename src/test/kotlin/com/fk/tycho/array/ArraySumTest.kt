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
    }
}