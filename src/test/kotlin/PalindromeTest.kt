import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class PalindromeTest {

    lateinit var alg: PalindromeAlg

    @Before
    fun setup() {
        alg = PalindromeAlg()
    }

    @Test
    fun shouldBeIsomorphic() {
        assertTrue(alg.doIt("ABCCBA"))
        assertTrue(alg.doIt("ABCBA"))
        assertTrue(alg.doIt("this is cool looc si siht"))
        assertTrue(alg.doIt("Red rum, sir, is murder"))
        assertTrue(alg.doIt("socorram-me, subi no onibus em marrocos"))
        assertTrue(alg.doIt("Al lets Della call Ed \"Stella.\""))
        assertTrue(alg.doIt("Amore, Roma."))
        assertTrue(alg.doIt("Are we not pure? “No, sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man—a prisoner up to new era"))
        assertTrue(alg.doIt("Taco cat"))
        assertTrue(alg.doIt("Ed, I saw Harpo Marx ram Oprah W. aside."))
        assertTrue(alg.doIt("Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel, and Ellen sinned"))
    }

    @Test
    fun shouldNotBeIsomorphic() {
        assertFalse(alg.doIt("ABAB"))
        assertFalse(alg.doIt("Programcreek is awesome"))
        assertFalse(alg.doIt("King, are you glad you are king?"))
    }
}