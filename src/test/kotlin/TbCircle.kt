import org.junit.Test
import kotlin.test.assertEquals
import java.lang.Math.pow
import kotlin.math.PI

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/test/kotlin/TbCircle.kt
 * Tests the name and dimension accessors of the dimensions of the circle.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t17:48Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class TbCircle{

    /** the object holding the testing constants */
    private val consts = TbCircleConsts

    /**
     * Tests the constructor and name accessor.
     */
    @Test
    fun testGetName(){
        /* create a circle */
        val shape : Shape = Circle(consts.NAME)
        /* check the name */
        assertEquals(consts.NAME, shape.name)
    } /* end fun testGetName() */

    /**
     * Tests the name mutator.
     */
    @Test
    fun testSetName(){
        /* create a circle */
        val circle = Circle("")
        /* change the name */
        circle.name = consts.NAME
        /* check the name */
        assertEquals(consts.NAME, circle.name)
    } /* end fun testSetName() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of a
     * circle.
     */
    @Test
    fun testDimensions1(){
        /* create a circle */
        val circle = Circle(consts.NAME)
        /* set the dimensions */
        circle.setDimensions(consts.RADIUS1)
        /* check the dimensions */
        assertEquals(consts.DIMENSIONS1, circle.dimensionsToString())
    } /* end fun testDimensions1() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of another
     * circle.
     */
    @Test
    fun testDimensions2(){
        /* create a circle */
        val circle = Circle(consts.NAME)
        /* set the initial dimensions */
        circle.setDimensions(consts.RADIUS1)
        /* update the dimensions */
        circle.setDimensions(consts.RADIUS2)
        /* check the dimensions */
        assertEquals(consts.DIMENSIONS2, circle.dimensionsToString())
    } /* end fun testDimensions2() */

} /* end class TbCircle */

/**
 * Holds the constants for test benching circles.
 */
object TbCircleConsts{
    /** test circle name */
    const val NAME = "circle P"
    /** radius of test circle */
    const val RADIUS1 = 1.0
    /** expected string representation of test circle */
    const val DIMENSIONS1 = "radius = 1.0000e+00"
    /** radius of another test circle */
    val RADIUS2 = pow(PI, (-1.0/2.0))
    /** expected string representation of another test circle */
    const val DIMENSIONS2 = "radius = 5.6419e-01"
} /* end object TbCircleConsts */
