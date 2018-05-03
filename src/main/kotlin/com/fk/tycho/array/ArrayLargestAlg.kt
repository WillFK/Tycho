package com.fk.tycho.array

class ArrayLargestAlg {

    fun doIt(array: Array<Int>, kth: Int): Int {

        fun swap(a: Int, b: Int) {
            // showing off swapping values without a temp value
            array[a] = array[a] + array[b]
            array[b] = array[a] - array[b]
            array[a] = array[a] - array[b]
        }

        fun hoarePartition(low: Int, high: Int): Int {
            val pivot = array[low]
            var i = low - 1
            var j = high + 1
            while (true) {
                do {
                    i++
                } while (array[i] < pivot)

                do {
                    j--
                } while (array[j] > pivot)

                if (i >= j)
                    return j
                else
                    swap(i, j)
            }
        }

        fun pseudoquicksort(lo: Int, hi: Int) {
            if (lo < hi) {
                hoarePartition(lo, hi).let {
                    val pos = array.size - kth
                    /*
                        The difference from the usual quicksort is I sort only the partition we need
                        in order to get the kth element. It's a similar logic behind the quickselect
                        (https://en.wikipedia.org/wiki/Quickselect), I think
                     */
                    when {
                        pos > it -> pseudoquicksort(it+1, hi)
                        else -> pseudoquicksort(lo, it)
                    }
                }
            }
        }

        pseudoquicksort(0, array.size-1)
        return array[array.size - kth]
    }
}

fun main(args: Array<String>) {
    //val array = arrayOf(23, 4, 28, 2, 25, 28)
    val array = (0 until 10)
            .map { Math.random() * 30 }
            .map { it.toInt() }
            .toTypedArray()
    ArrayLargestAlg().doIt(array, 5)
}