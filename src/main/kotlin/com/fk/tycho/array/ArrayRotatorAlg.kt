package com.fk.tycho.array

class ArrayRotatorAlg {

    fun doIt(array: Array<Int>, steps: Int): Array<Int> {
        val result = Array(array.size) { 0 }
        (0 until array.size).forEach { index ->
            result[(index + steps) % array.size] = array[index]
        }
        return result
    }
}