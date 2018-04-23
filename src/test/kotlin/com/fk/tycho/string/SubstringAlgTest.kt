package com.fk.tycho.string

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class SubstringAlgTest {

    lateinit var alg: SubstringAlg

    @Before
    fun setup() {
        alg = SubstringAlg()
    }

    @Test
    fun checkSubstringLength() {
        assertEquals(3, alg.doIt("abc"))
        assertEquals(1, alg.doIt("bbb"))
        assertEquals(2, alg.doIt("abab"))
        assertEquals(3, alg.doIt("abcab"))
        assertEquals(3, alg.doIt("ababc"))
        assertEquals(4, alg.doIt("abbcddacb"))
    }
}