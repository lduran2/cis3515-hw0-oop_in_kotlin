import org.junit.Test
import kotlin.test.assertEquals

import java.util.Scanner
import java.io.OutputStream.nullOutputStream
import java.io.PrintWriter

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/test/kotlin/TbSquare.kt
 * Tests the name and dimension accessors of the dimensions of the square.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-11t14:01Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class TbSquare{

    /** the object holding the testing constants */
    private val consts = TbSquareConsts

    /** printer that no-ops */
    private val nullOut = PrintWriter(nullOutputStream())

    /**
     * Tests the constructor and name accessor.
     */
    @Test
    fun testGetName(){
        /* create a square */
        val shape : Shape = Square(consts.NAME)
        /* check the name */
        assertEquals(consts.NAME, shape.name)
    } /* end fun testGetName() */

    /**
     * Tests the name mutator.
     */
    @Test
    fun testSetName(){
        /* create a square */
        val square = Square("")
        /* change the name */
        square.name = consts.NAME
        /* check the name */
        assertEquals(consts.NAME, square.name)
    } /* end fun testSetName() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of a
     * vacuous square.
     */
    @Test
    fun testDimensions0(){
        /* create a square */
        val square = Square(consts.NAME)
        /* set the dimensions */
        square.setDimensions(consts.LENGTH0, consts.HEIGHT0)
        /* check the dimensions */
        assertEquals(consts.DIMENSIONS0, square.dimensionsToString())
    } /* end fun testDimensions0() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of a
     * regular square.
     */
    @Test
    fun testDimensions1(){
        /* create a square */
        val square = Square(consts.NAME)
        /* set the dimensions */
        square.setDimensions(consts.LENGTH1, consts.HEIGHT1)
        /* check the dimensions */
        assertEquals(consts.DIMENSIONS1, square.dimensionsToString())
    } /* end fun testDimensions1() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of an
     * irregular square.
     */
    @Test
    fun testDimensions2(){
        /* create a square */
        val square = Square(consts.NAME)
        /* set the initial dimensions */
        square.setDimensions(consts.LENGTH1, consts.HEIGHT1)
        /* update the dimensions */
        square.setDimensions(consts.LENGTH2, consts.HEIGHT2)
        /* check the dimensions */
        assertEquals(consts.DIMENSIONS2, square.dimensionsToString())
    } /* end fun testDimensions2() */

    /**
     * Tests `scanDimensionsFrom` with a regular square.
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
    } /* end fun testScanDimensions1() */

    /**
     * Tests `scanDimensionsFrom` with a irregular square.
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
    } /* end fun testScanDimensions2() */

} /* end class TbSquare */

/**
 * Holds the constants for test benching squares.
 */
object TbSquareConsts{
    /** test square name */
    const val NAME = "square ABCD"

    /** length and height of test vacuous square */
    const val LENGTH0 = 0.0
    const val HEIGHT0 = 0.0
    /** expected string representation of test vacuous square's
     * dimensions */
    const val DIMENSIONS0 = "length = 0.0000e+00, height = 0.0000e+00"

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
