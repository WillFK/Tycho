package com.fk.tycho.string

class PalindromeAlg {

    fun doIt(a: String): Boolean {

        fun Char.validCharacter() =
            this in 'A'..'z' || this in '0'..'9'

        var indexA = 0
        var indexB = a.length - 1

        while (indexA < indexB) {
            val pivotA = a[indexA]
            if (pivotA.validCharacter()) {
                val pivotB = a[indexB]
                if (pivotB.validCharacter()) {
                    if (pivotA.equals(pivotB, true)) {
                        indexA++
                        indexB--
                    } else {
                        return false
                    }
                } else {
                    indexB--
                }
            } else {
                indexA++
            }
        }

        return true
    }
}