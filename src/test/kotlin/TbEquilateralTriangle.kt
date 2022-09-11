import org.junit.Test
import kotlin.test.assertEquals
import java.lang.Math.pow

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/test/kotlin/TbEquilateralTriangle.kt
 * Tests the name and dimension accessors of the dimensions of the equilateral triangle.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t18:15Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class TbEquilateralTriangle {

    /** the object holding the testing constants */
    private val consts = TbEquilateralTriangleConsts

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
    /** sides of a test regular triangle */
    const val SIDES_LENGTH1 = 1.0
    /** expected string representation of test triangle */
    const val DIMENSIONS1 =
        "side #1 = 1.0000e+00, side #2 = 1.0000e+00, side #3 = 1.0000e+00"
    /** sides of the 3-4-5 triangle */
    val SIDES_LENGTH2 = ((2.0 * pow(3.0, 0.75))/3.0)
    /** expected string representation of the 3-4-5 triangle */
    const val DIMENSIONS2 =
        "side #1 = 1.5197e+00, side #2 = 1.5197e+00, side #3 = 1.5197e+00"
    /** the maximum allowable difference between calculated areas */
    const val ABSOLUTE_TOLERANCE = 0.00005
} /* end object TbEquilateralTriangleConsts */
