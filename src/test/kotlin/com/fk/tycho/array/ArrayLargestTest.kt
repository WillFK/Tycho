package com.fk.tycho.array

import org.junit.Before
import org.junit.Test
import org.junit.Assert.*


class ArrayLargestTest {

    lateinit var alg: ArrayLargestAlg

    @Before
    fun setup() {
        alg = ArrayLargestAlg()
    }

    @Test
    fun checkLargestSortedArray() {
        assertEquals(6, alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 1))
        assertEquals(5, alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 2))
        assertEquals(4, alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 3))
        assertEquals(3, alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 4))
        assertEquals(2, alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 5))
        assertEquals(1, alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 6))
        assertEquals(0, alg.doIt(arrayOf(0, 1, 2, 3, 4, 5, 6), 7))
    }

    @Test
    fun checkLargestUnsortedUniqueArray() {
        assertEquals(6, alg.doIt(arrayOf(2, 1, 3, 6, 4, 0, 5), 1))
        assertEquals(5, alg.doIt(arrayOf(2, 1, 3, 6, 4, 0, 5), 2))
        assertEquals(4, alg.doIt(arrayOf(2, 1, 3, 6, 4, 0, 5), 3))
        assertEquals(3, alg.doIt(arrayOf(2, 1, 3, 6, 4, 0, 5), 4))
        assertEquals(2, alg.doIt(arrayOf(2, 1, 3, 6, 4, 0, 5), 5))
        assertEquals(1, alg.doIt(arrayOf(2, 1, 3, 6, 4, 0, 5), 6))
        assertEquals(0, alg.doIt(arrayOf(2, 1, 3, 6, 4, 0, 5), 7))
    }

    @Test
    fun checkLargestUnsortedNonUniqueArray() {
        assertEquals(3, alg.doIt(arrayOf(3, 2, 0, 1, 2, 1, 3), 1))
        assertEquals(3, alg.doIt(arrayOf(3, 2, 0, 1, 2, 1, 3), 2))
        assertEquals(2, alg.doIt(arrayOf(3, 2, 0, 1, 2, 1, 3), 3))
        assertEquals(2, alg.doIt(arrayOf(3, 2, 0, 1, 2, 1, 3), 4))
        assertEquals(1, alg.doIt(arrayOf(3, 2, 0, 1, 2, 1, 3), 5))
        assertEquals(1, alg.doIt(arrayOf(3, 2, 0, 1, 2, 1, 3), 6))
        assertEquals(0, alg.doIt(arrayOf(3, 2, 0, 1, 2, 1, 3), 7))
    }
}