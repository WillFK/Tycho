package com.fk.tycho.string

class IsomorphismAlg {

    /*
    * both strings should be composed by characters between A and Z (upper case)
    * */
    fun doIt(a: String, b: String): Boolean {

        fun Char.simpleIndex() = this.toUpperCase() - 'A'

        fun checkMapping(a: Int, b: Int, array: Array<Int>) =
            when (array[a]) {
                -1 -> { array[a] = b; true }
                b -> true
                else -> false
            }

        val arrayA = Array(26) { -1 }
        val arrayB = Array(26) { -1 }

        (0 until a.length).forEach { index ->
            val aL = a[index].simpleIndex()
            val bL = b[index].simpleIndex()
            if (!checkMapping(aL, bL, arrayA) or !checkMapping(bL, aL, arrayB))
                return false
        }
        return true
    }
}