package com.fk.tycho.array

class ArraySumAlg {

    fun doIt(array: Array<Int>, target: Int): Pair<Int, Int> {
        var first = 0
        var second = 1

        while (first < array.size-1) {
            while (second < array.size) {
                if (array[first] + array[second] == target)
                    return Pair(first, second)
                second++
            }
            first++
            second = first+1
        }

        return Pair(-1, -1)
    }
}