class IsomorphismAlg {

    /*
    * both strings should be composed by characters between A and Z (upper case)
    * */
    fun doIt(a: String, b: String): Boolean {

        fun Char.fkIndex() = this.toUpperCase() - 'A'

        val array = Array(26) { -1 }

        (0 until a.length).forEach { index ->
            val aL = a[index].fkIndex()
            val bL = b[index].fkIndex()
            when (array[aL]) {
                -1 -> array[aL] = bL
                bL -> {}
                else -> return false
            }
        }
        return true
    }
}