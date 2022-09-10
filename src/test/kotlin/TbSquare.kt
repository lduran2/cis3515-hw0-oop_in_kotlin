import org.junit.Test
import kotlin.test.assertEquals

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/test/kotlin/TbSquare.kt
 * Tests the name and dimension accessors of the dimensions of the square.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t16:25Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class TbSquare {

    /**
     * Tests the constructor and name accessor.
     */
    @Test
    fun testGetName(){
        /* create a square */
        val shape : Shape = Square(SQUARE_NAME)
        /* check the name */
        assertEquals(SQUARE_NAME, shape.name)
    } /* end fun testGetName() */

    /**
     * Tests the name mutator.
     */
    @Test
    fun testSetName(){
        /* create a square */
        val square = Square("")
        /* change the name */
        square.name = SQUARE_NAME
        /* check the name */
        assertEquals(SQUARE_NAME, square.name)
    } /* end fun testSetName() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of a
     * regular square.
     */
    @Test
    fun testDimensions1(){
        /* create a square */
        val square = Square(SQUARE_NAME)
        /* set the dimensions */
        square.setDimensions(SQUARE1_LENGTH, SQUARE1_HEIGHT)
        /* check the dimensions */
        assertEquals(SQUARE1_DIMENSIONS, square.dimensionsToString())
    } /* end fun testDimensions1() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of an
     * irregular square.
     */
    @Test
    fun testDimensions2(){
        /* create a square */
        val square = Square(SQUARE_NAME)
        /* set the initial dimensions */
        square.setDimensions(SQUARE1_LENGTH, SQUARE1_HEIGHT)
        /* update the dimensions */
        square.setDimensions(SQUARE2_LENGTH, SQUARE2_HEIGHT)
        /* check the dimensions */
        assertEquals(SQUARE2_DIMENSIONS, square.dimensionsToString())
    } /* end fun testDimensions2() */

} /* end class TbSquare */

/** test square name */
const val SQUARE_NAME = "square ABCD"
/** length and height of test regular square */
const val SQUARE1_LENGTH = 10.0
const val SQUARE1_HEIGHT = 10.0
/** expected string representation of test regular square's dimensions */
const val SQUARE1_DIMENSIONS = "length = 1.0000e+01, height = 1.0000e+01"
/** length and height of test irregular square */
const val SQUARE2_LENGTH = 8.0
const val SQUARE2_HEIGHT = 12.0
/** expected string representation of test irregular square's
 * dimensions */
const val SQUARE2_DIMENSIONS = "length = 8.0000e+00, height = 1.2000e+01"
