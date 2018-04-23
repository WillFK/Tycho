package com.fk.tycho.string

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class AnagramTest {

    lateinit var alg: AnagramAlg

    @Before
    fun setup() {
        alg = AnagramAlg()
    }

    @Test
    fun shouldBeAnagram() {
        assertTrue(alg.doIt("ABC", "ACB"))
        assertTrue(alg.doIt("AABB", "ABBA"))
        assertTrue(alg.doIt("ABCA", "BCAA"))
        assertTrue(alg.doIt("foobar", "barfoo"))
        assertTrue(alg.doIt("Tar", "rat"))
        assertTrue(alg.doIt("Elbow", "Below"))
        assertTrue(alg.doIt("State", "Taste"))
        assertTrue(alg.doIt("Cider", "Cried"))
        assertTrue(alg.doIt("Night", "Thing"))
        assertTrue(alg.doIt("Brag", "Grab"))
        assertTrue(alg.doIt("Cat", "act"))
        assertTrue(alg.doIt("Bored", "Robed"))
        assertTrue(alg.doIt("Save", "Vase"))
        assertTrue(alg.doIt("Angel", "Glean"))
        assertTrue(alg.doIt("Stressed", "Desserts"))
    }

    @Test
    fun shouldNotBeAnagram() {
        assertFalse(alg.doIt("AB", "AA"))
        assertFalse(alg.doIt("AB", "BB"))
        assertFalse(alg.doIt("AAB", "BBA"))
        assertFalse(alg.doIt("AABC", "ABBC"))
        assertFalse(alg.doIt("ABCD", "ABBC"))
    }
}