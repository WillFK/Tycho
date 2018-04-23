package com.fk.tycho.string

class SubstringAlg {

    fun doIt(a: String): Int {

        fun Char.simpleIndex() = this.toUpperCase() - 'A'

        var length = 0
        var topLength = 0
        var array = Array(26)  { 0 }

        fun reset() { length = 0; array = Array(26)  { 0 } }

        (0 until a.length).forEach { index ->
            val charIndex = a[index].simpleIndex()
            if (array[charIndex] > 0) {
                if (topLength < length) topLength = length
                reset()
                length++
                array[charIndex]++
            } else {
                length++
                array[charIndex]++
            }
        }
        if (topLength < length) topLength = length
        return topLength
    }

}