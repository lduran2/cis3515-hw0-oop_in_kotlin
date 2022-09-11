import org.junit.Test
import java.io.OutputStream.nullOutputStream
import java.io.PrintWriter
import java.util.*
import kotlin.test.assertEquals

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/test/kotlin/TbSquare.kt
 * Tests the name and dimension accessors of the dimensions of the square.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t21:07Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class TbSquare{

    /** the object holding the testing constants */
    private val consts = TbSquareConsts

    /** printer that no-ops */
    private val nullOut = PrintWriter(nullOutputStream())

    /**
     * Tests scanDimensionsFrom with a regular square.
     */
    @Test
    fun testScanDimensions1(){
        /* create the square */
        val shape : Shape = Square(consts.NAME)
        /* create scanner on input string */
        val sc = Scanner(consts.IN1)
        /* read in the dimensions */
        shape.scanDimensionsFrom(sc, nullOut)
        /* compare to expected */
        assertEquals(consts.DIMENSIONS1, shape.dimensionsToString())
    }

    /**
     * Tests scanDimensionsFrom with a irregular square.
     */
    @Test
    fun testScanDimensions2(){
        /* create the square */
        val shape : Shape = Square(consts.NAME)
        /* create scanner on input string */
        val sc = Scanner(consts.IN2)
        /* read in the dimensions */
        shape.scanDimensionsFrom(sc, nullOut)
        /* compare to expected */
        assertEquals(consts.DIMENSIONS2, shape.dimensionsToString())
    }

} /* end class TbSquare */

/**
 * Holds the constants for test benching squares.
 */
object TbSquareConsts{
    /** test square name */
    const val NAME = "square ABCD"

    /** length and height of test regular square */
    const val LENGTH1 = 10.0
    const val HEIGHT1 = 10.0
    /** input for test regular square */
    const val IN1 = "${LENGTH1} ${HEIGHT1}"
    /** expected string representation of test regular square's
     * dimensions */
    const val DIMENSIONS1 = "length = 1.0000e+01, height = 1.0000e+01"

    /** length and height of test irregular square */
    const val LENGTH2 = 8.0
    const val HEIGHT2 = 12.0
    /** input for test irregular square */
    const val IN2 = "${LENGTH2} ${HEIGHT2}"
    /** expected string representation of test irregular square's
     * dimensions */
    const val DIMENSIONS2 = "length = 8.0000e+00, height = 1.2000e+01"

} /* end object TbSquareConsts */
