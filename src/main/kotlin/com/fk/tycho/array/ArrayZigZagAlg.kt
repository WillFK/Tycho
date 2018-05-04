package com.fk.tycho.array

class ArrayZigZagAlg {

    fun doIt(array: Array<Int>) {

        fun swap(i: Int, j: Int) {
            array[i] = array[i] + array[j]
            array[j] = array[i] - array[j]
            array[i] = array[i] - array[j]
        }

        fun check(i: Int) {
            if (array[i] > array[i+1]) {
                if (i > 0 && array[i+1] > array[i-1]) {
                    swap(i-1, i)
                } else {
                    swap(i, i+1)
                }
            } else if (i > 0 && array[i] > array[i-1]) {
                swap(i-1, i)
            }
        }

        fun checkLast(i: Int) {
            if (array[i] > array[i-1]) swap(i, i-1)
        }

        var index = 0
        while (index < array.size-1) {
            check(index++)
            when (++index) {
                array.size - 1 -> checkLast(index)
            }
        }
    }
}

fun main(args: Array<String>) {
    //ArrayZigZagAlg().doIt(arrayOf(2, 7, 9, 4, 3, 2, 1, 0))
    //ArrayZigZagAlg().doIt(arrayOf(3, 2, 5, 6, 7, 0, 1))
    //ArrayZigZagAlg().doIt(arrayOf(1, 2, 3, 9, 8, 7, 5, 6, 10))
    //ArrayZigZagAlg().doIt(arrayOf(1, 2, 3, 9, 8, 7))
    //ArrayZigZagAlg().doIt(arrayOf(3, 9, 8, 7))
}