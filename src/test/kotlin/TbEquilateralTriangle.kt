import org.junit.Test
import kotlin.test.assertEquals
import java.lang.Math.pow

import java.util.Scanner
import java.io.OutputStream.nullOutputStream
import java.io.PrintWriter

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/test/kotlin/TbEquilateralTriangle.kt
 * Tests the name and dimension accessors of the dimensions of the equilateral triangle.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-11t16:42Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class TbEquilateralTriangle{

    /** the object holding the testing constants */
    private val consts = TbEquilateralTriangleConsts

    /** printer that no-ops */
    private val nullOut = PrintWriter(OutputStream.nullOutputStream())

    /**
     * Tests the constructor and name accessor.
     */
    @Test
    fun testGetName(){
        /* create a triangle */
        val shape : Shape = EquilateralTriangle(consts.NAME)
        /* check the name */
        assertEquals(consts.NAME, shape.name)
    } /* end fun testGetName() */

    /**
     * Tests the name mutator.
     */
    @Test
    fun testSetName(){
        /* create a triangle */
        val triangle = EquilateralTriangle("")
        /* change the name */
        triangle.name = consts.NAME
        /* check the name */
        assertEquals(consts.NAME, triangle.name)
    } /* end fun testSetName() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of a
     * vacuous triangle.
     */
    @Test
    fun testDimensions0(){
        /* create a triangle */
        val triangle = EquilateralTriangle(consts.NAME)
        /* set the dimensions */
        triangle.setDimensions(consts.SIDES_LENGTH0)
        /* check the dimensions */
        assertEquals(consts.DIMENSIONS0, triangle.dimensionsToString())
    } /* end fun testDimensions0() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of a
     * triangle.
     */
    @Test
    fun testDimensions1(){
        /* create a triangle */
        val triangle = EquilateralTriangle(consts.NAME)
        /* set the dimensions */
        triangle.setDimensions(consts.SIDES_LENGTH1)
        /* check the dimensions */
        assertEquals(consts.DIMENSIONS1, triangle.dimensionsToString())
    } /* end fun testDimensions1() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of another
     * triangle.
     */
    @Test
    fun testDimensions2(){
        /* create a triangle */
        val triangle = EquilateralTriangle(consts.NAME)
        /* set the initial dimensions */
        triangle.setDimensions(consts.SIDES_LENGTH1)
        /* update the dimensions */
        triangle.setDimensions(consts.SIDES_LENGTH2)
        /* check the dimensions */
        assertEquals(consts.DIMENSIONS2, triangle.dimensionsToString())
    } /* end fun testDimensions2() */

    /**
     * Tests `scanDimensionsFrom` with a test equilateral triangle.
     */
    @Test
    fun testScanDimensions1(){
        /* create the equilateral triangle */
        val shape : Shape = EquilateralTriangle(consts.NAME)
        /* create scanner on input string */
        val sc = Scanner(consts.IN1)
        /* read in the dimensions */
        shape.scanDimensionsFrom(sc, nullOut)
        /* compare to expected */
        assertEquals(consts.DIMENSIONS1, shape.dimensionsToString())
    } /* end fun testScanDimensions1() */

    /**
     * Tests `scanDimensionsFrom` with another test equilateral triangle.
     */
    @Test
    fun testScanDimensions2(){
        /* create the equilateral triangle */
        val shape : Shape = EquilateralTriangle(consts.NAME)
        /* create scanner on input string */
        val sc = Scanner(consts.IN2)
        /* read in the dimensions */
        shape.scanDimensionsFrom(sc, nullOut)
        /* compare to expected */
        assertEquals(consts.DIMENSIONS2, shape.dimensionsToString())
    } /* end fun testScanDimensions2() */

} /* end class TbEquilateralTriangle */

/**
 * Holds the constants for test benching equilateral triangles.
 */
object TbEquilateralTriangleConsts{
    /** test triangle name */
    const val NAME = "triangle ABC"

    /** sides of a test vacuous triangle */
    const val SIDES_LENGTH0 = 0.0
    /** expected string representation of test vacuous triangle */
    const val DIMENSIONS0 =
        "side #1 = 0.0000e+00, side #2 = 0.0000e+00, side #3 = 0.0000e+00"

    /** sides of a test equilateral triangle */
    const val SIDES_LENGTH1 = 1.0
    /** input for a test equilateral triangle */
    const val IN1 = "${SIDES_LENGTH1}"
    /** expected string representation of test equilateral triangle */
    const val DIMENSIONS1 =
        "side #1 = 1.0000e+00, side #2 = 1.0000e+00, side #3 = 1.0000e+00"

    /** sides of another test equilateral triangle */
    val SIDES_LENGTH2 = ((2.0 * pow(3.0, 0.75))/3.0)
    /** input for another test equilateral triangle */
    const val IN2 = "${SIDES_LENGTH2}"
    /** expected string representation of another test equilateral triangle */
    const val DIMENSIONS2 =
        "side #1 = 1.5197e+00, side #2 = 1.5197e+00, side #3 = 1.5197e+00"

} /* end object TbEquilateralTriangleConsts */
