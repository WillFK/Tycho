package com.fk.tycho.string

class AnagramAlg {

    /*
    * Strings of the same size composed by characters from A to Z
    * */
    fun doIt(a: String, b: String): Boolean {

        fun Char.simpleIndex() = this.toUpperCase() - 'A'

        val array = Array(26) { 0 }
        (0 until a.length).forEach { index ->
            array[a[index].simpleIndex()]++
        }
        (0 until a.length).forEach { index ->
            if (--array[b[index].simpleIndex()] < 0)
                return false
        }
        return true
    }
}