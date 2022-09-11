import org.junit.Test
import java.io.OutputStream
import java.io.PrintWriter
import kotlin.test.assertEquals
import java.lang.Math.pow
import java.util.*

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
