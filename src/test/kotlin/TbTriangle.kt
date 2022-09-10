import org.junit.Test
import kotlin.test.assertEquals
import java.lang.Math.pow
import kotlin.math.PI

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/test/kotlin/TbTriangle.kt
 * Tests the name and dimension accessors of the dimensions of the triangle.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t17:01Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class TbTriangle {

    /**
     * Tests the constructor and name accessor.
     */
    @Test
    fun testGetName(){
        /* create a triangle */
        val shape : Shape = Triangle(TRIANGLE_NAME)
        /* check the name */
        assertEquals(TRIANGLE_NAME, shape.name)
    } /* end fun testGetName() */

    /**
     * Tests the name mutator.
     */
    @Test
    fun testSetName(){
        /* create a triangle */
        val triangle = Triangle("")
        /* change the name */
        triangle.name = TRIANGLE_NAME
        /* check the name */
        assertEquals(TRIANGLE_NAME, triangle.name)
    } /* end fun testSetName() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of a
     * triangle.
     */
    @Test
    fun testDimensions1(){
        /* create a triangle */
        val triangle = Triangle(TRIANGLE_NAME)
        /* set the dimensions */
        triangle.setDimensions(
            TRIANGLE1_SIDES[0],
            TRIANGLE1_SIDES[1],
            TRIANGLE1_SIDES[2])
        /* check the dimensions */
        assertEquals(TRIANGLE1_DIMENSIONS, triangle.dimensionsToString())
    } /* end fun testDimensions1() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of a 3-4-5
     * triangle.
     */
    @Test
    fun testDimensions345(){
        /* create a triangle */
        val triangle = Triangle(TRIANGLE_NAME)
        /* set the initial dimensions */
        triangle.setDimensions(
            TRIANGLE1_SIDES[0],
            TRIANGLE1_SIDES[1],
            TRIANGLE1_SIDES[2])
        /* update the dimensions */
        triangle.setDimensions(
            TRIANGLE345_SIDES[0],
            TRIANGLE345_SIDES[1],
            TRIANGLE345_SIDES[2])
        /* check the dimensions */
        assertEquals(TRIANGLE345_DIMENSIONS, triangle.dimensionsToString())
    } /* end fun testDimensions345() */

} /* end class TbTriangle */

/** test triangle name */
const val TRIANGLE_NAME = "triangle ABC"
/** sides of a test regular triangle */
val TRIANGLE1_SIDES = doubleArrayOf(1.0, 1.0, 1.0)
/** expected string representation of test triangle */
const val TRIANGLE1_DIMENSIONS = "side #1 = 1.0000e+00, side #2 = 1.0000e+00, side #3 = 1.0000e+00"
/** sides of the 3-4-5 triangle */
val TRIANGLE345_SIDES = doubleArrayOf(3.0, 4.0, 5.0)
/** expected string representation of the 3-4-5 triangle */
const val TRIANGLE345_DIMENSIONS =  "side #1 = 3.0000e+00, side #2 = 4.0000e+00, side #3 = 5.0000e+00"
