import org.junit.Test
import kotlin.test.assertEquals

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/test/kotlin/TbSquare.kt
 * Tests the name and dimension accessors of the dimensions of the square.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t21:07Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class TbSquare{

    /**
     * Always fails.
     */
    @Test
    fun fail(){
        assertEquals(false, true)
    } /* end fun fail() */

    /**
     * Greets and passes.
     */
    @Test
    fun pass(){
        print("Hello world!")
        assertEquals(true, true)
    } /* end fun fail() */

} /* end class TbSquare */
