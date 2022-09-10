import org.junit.Test
import kotlin.test.assertEquals
import java.lang.Math.pow

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/test/kotlin/TbEquilateralTriangle.kt
 * Tests the name and dimension accessors of the dimensions of the equilateral triangle.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t17:23Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class TbEquilateralTriangle {

    /**
     * Tests the constructor and name accessor.
     */
    @Test
    fun testGetName(){
        /* create a triangle */
        val shape : Shape = EquilateralTriangle(EQUILATERAL_TRIANGLE_NAME)
        /* check the name */
        assertEquals(EQUILATERAL_TRIANGLE_NAME, shape.name)
    } /* end fun testGetName() */

    /**
     * Tests the name mutator.
     */
    @Test
    fun testSetName(){
        /* create a triangle */
        val triangle = EquilateralTriangle("")
        /* change the name */
        triangle.name = EQUILATERAL_TRIANGLE_NAME
        /* check the name */
        assertEquals(EQUILATERAL_TRIANGLE_NAME, triangle.name)
    } /* end fun testSetName() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of a
     * triangle.
     */
    @Test
    fun testDimensions1(){
        /* create a triangle */
        val triangle = EquilateralTriangle(EQUILATERAL_TRIANGLE_NAME)
        /* set the dimensions */
        triangle.setDimensions(EQUILATERAL_TRIANGLE1_SIDE)
        /* check the dimensions */
        assertEquals(
            EQUILATERAL_TRIANGLE1_DIMENSIONS, triangle.dimensionsToString())
    } /* end fun testDimensions1() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of another
     * triangle.
     */
    @Test
    fun testDimensions2(){
        /* create a triangle */
        val triangle = EquilateralTriangle(EQUILATERAL_TRIANGLE_NAME)
        /* set the initial dimensions */
        triangle.setDimensions(EQUILATERAL_TRIANGLE1_SIDE)
        /* update the dimensions */
        triangle.setDimensions(EQUILATERAL_TRIANGLE2_SIDE)
        /* check the dimensions */
        assertEquals(
            EQUILATERAL_TRIANGLE2_DIMENSIONS, triangle.dimensionsToString())
    } /* end fun testDimensions2() */

} /* end class TbEquilateralTriangle */

/** test triangle name */
const val EQUILATERAL_TRIANGLE_NAME = "triangle ABC"
/** sides of a test regular triangle */
const val EQUILATERAL_TRIANGLE1_SIDE = 1.0
/** expected string representation of test triangle */
const val EQUILATERAL_TRIANGLE1_DIMENSIONS = "side #1 = 1.0000e+00, side #2 = 1.0000e+00, side #3 = 1.0000e+00"
/** sides of the 3-4-5 triangle */
val EQUILATERAL_TRIANGLE2_SIDE = ((2.0 * pow(3.0, 0.75))/3.0)
/** expected string representation of the 3-4-5 triangle */
const val EQUILATERAL_TRIANGLE2_DIMENSIONS =  "side #1 = 1.5197e+00, side #2 = 1.5197e+00, side #3 = 1.5197e+00"
