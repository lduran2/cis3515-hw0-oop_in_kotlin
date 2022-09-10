import org.junit.Test
import kotlin.test.assertEquals
import java.lang.Math.pow
import kotlin.math.PI

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/test/kotlin/TbCircle.kt
 * Tests the name and dimension accessors of the dimensions of the circle.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t16:53Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class TbCircle {

    /**
     * Tests the constructor and name accessor.
     */
    @Test
    fun testGetName(){
        /* create a circle */
        val shape : Shape = Circle(CIRCLE_NAME)
        /* check the name */
        assertEquals(CIRCLE_NAME, shape.name)
    } /* end fun testGetName() */

    /**
     * Tests the name mutator.
     */
    @Test
    fun testSetName(){
        /* create a circle */
        val circle = Circle("")
        /* change the name */
        circle.name = CIRCLE_NAME
        /* check the name */
        assertEquals(CIRCLE_NAME, circle.name)
    } /* end fun testSetName() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of a
     * circle.
     */
    @Test
    fun testDimensions1(){
        /* create a circle */
        val circle = Circle(CIRCLE_NAME)
        /* set the dimensions */
        circle.setDimensions(CIRCLE1_RADIUS)
        /* check the dimensions */
        assertEquals(CIRCLE1_DIMENSIONS, circle.dimensionsToString())
    } /* end fun testDimensions1() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of another
     * circle.
     */
    @Test
    fun testDimensions2(){
        /* create a circle */
        val circle = Circle(CIRCLE_NAME)
        /* set the initial dimensions */
        circle.setDimensions(CIRCLE1_RADIUS)
        /* update the dimensions */
        circle.setDimensions(CIRCLE2_RADIUS)
        /* check the dimensions */
        assertEquals(CIRCLE2_DIMENSIONS, circle.dimensionsToString())
    } /* end fun testDimensions2() */

} /* end class TbCircle */

/** test circle name */
const val CIRCLE_NAME = "circle P"
/** radius of test circle */
const val CIRCLE1_RADIUS = 1.0
/** expected string representation of test circle */
const val CIRCLE1_DIMENSIONS = "radius = 1.0000e+00"
/** radius of another test circle */
val CIRCLE2_RADIUS = pow(PI, (-1.0/2.0))
/** expected string representation of another test circle */
const val CIRCLE2_DIMENSIONS = "radius = 5.6419e-01"
