package com.fk.tycho.string

class SubstringAlg {

    fun doIt(a: String): Int {

        fun Char.simpleIndex() = this.toUpperCase() - 'A'

        var length = 0
        var topLength = 0
        var array = Array(26)  { -1 }

        fun reset() { length = 0; array = Array(26)  { -1 } }
        var index = 0
        while (index < a.length) {
            val charIndex = a[index].simpleIndex()
            if (array[charIndex] > -1) {
                if (topLength < length) topLength = length
                index = array[charIndex]+1
                reset()
            } else {
                array[charIndex] = index
                index++
                length++
            }
        }

        if (topLength < length) topLength = length
        return topLength
    }

}