import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.Assert.*

class Test {

    lateinit var alg: IsomorphismAlg

    @Before
    fun setup() {
        alg = IsomorphismAlg()
    }

    @Test
    fun shouldBeIsomorphic() {
        assertTrue(alg.doIt("egg", "add"))
        assertTrue(alg.doIt("paper", "title"))
        assertTrue(alg.doIt("AABB", "CCDD"))
        assertTrue(alg.doIt("ABAB", "CDCD"))
        assertTrue(alg.doIt("ABC", "CBD"))
    }

    @Test
    fun shouldNotBeIsomorphic() {
        assertFalse(alg.doIt("foo", "bar"))
        assertFalse(alg.doIt("AABB", "ABAB"))
        assertFalse(alg.doIt("ABBC", "DFEE"))
        assertFalse(alg.doIt("AABBA", "BAABB"))
        assertFalse(alg.doIt("ABCDC", "ABCDE"))
    }
}