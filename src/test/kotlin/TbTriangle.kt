import org.junit.Test
import kotlin.test.assertEquals

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/test/kotlin/TbTriangle.kt
 * Tests the name and dimension accessors of the dimensions of the triangle.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t23:14Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class TbTriangle{

    /** the object holding the testing constants */
    private val consts = TbTriangleConsts

    /**
     * Tests the constructor and name accessor.
     */
    @Test
    fun testGetName(){
        /* create a triangle */
        val shape : Shape = Triangle(consts.NAME)
        /* check the name */
        assertEquals(consts.NAME, shape.name)
    } /* end fun testGetName() */

    /**
     * Tests the name mutator.
     */
    @Test
    fun testSetName(){
        /* create a triangle */
        val triangle = Triangle("")
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
        val triangle = Triangle(consts.NAME)
        /* set the dimensions */
        triangle.setDimensions(
            consts.SIDES0[0],
            consts.SIDES0[1],
            consts.SIDES0[2])
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
        val triangle = Triangle(consts.NAME)
        /* set the dimensions */
        triangle.setDimensions(
            consts.SIDES1[0],
            consts.SIDES1[1],
            consts.SIDES1[2])
        /* check the dimensions */
        assertEquals(consts.DIMENSIONS1, triangle.dimensionsToString())
    } /* end fun testDimensions1() */

    /**
     * Tests the dimension mutator and `dimensionsToString` of a 3-4-5
     * triangle.
     */
    @Test
    fun testDimensions345(){
        /* create a triangle */
        val triangle = Triangle(consts.NAME)
        /* set the initial dimensions */
        triangle.setDimensions(
            consts.SIDES1[0],
            consts.SIDES1[1],
            consts.SIDES1[2])
        /* update the dimensions */
        triangle.setDimensions(
            consts.SIDES345[0],
            consts.SIDES345[1],
            consts.SIDES345[2])
        /* check the dimensions */
        assertEquals(consts.DIMENSIONS345, triangle.dimensionsToString())
    } /* end fun testDimensions345() */

    /**
     * Tests the perimeter calculation of the vacuous triangle.
     */
    @Test
    fun testPerimeter0(){
        /* create a triangle */
        val triangle = Triangle(consts.NAME)
        /* set the initial dimensions */
        triangle.setDimensions(
            consts.SIDES0[0],
            consts.SIDES0[1],
            consts.SIDES0[2])
        /* calculate the perimeter */
        val perimeter = triangle.getPerimeter()
        /* check against the expected value */
        assertEquals(consts.PERIMETER0, perimeter, consts.ABSOLUTE_TOLERANCE
            )
    } /* end fun testPerimeter0() */

    /**
     * Tests the perimeter calculation of the regular triangle.
     */
    @Test
    fun testPerimeter1(){
        /* create a triangle */
        val triangle = Triangle(consts.NAME)
        /* set the initial dimensions */
        triangle.setDimensions(
            consts.SIDES1[0],
            consts.SIDES1[1],
            consts.SIDES1[2])
        /* calculate the perimeter */
        val perimeter = triangle.getPerimeter()
        /* check against the expected value */
        assertEquals(consts.PERIMETER1, perimeter, consts.ABSOLUTE_TOLERANCE
        )
    } /* end fun testPerimeter1() */

    /**
     * Tests the perimeter calculation of the 3-4-5 triangle.
     */
    @Test
    fun testPerimeter345(){
        /* create a triangle */
        val triangle = Triangle(consts.NAME)
        /* set the initial dimensions */
        triangle.setDimensions(
            consts.SIDES345[0],
            consts.SIDES345[1],
            consts.SIDES345[2])
        /* calculate the perimeter */
        val perimeter = triangle.getPerimeter()
        /* check against the expected value */
        assertEquals(consts.PERIMETER345, perimeter, consts.ABSOLUTE_TOLERANCE
        )
    } /* end fun testPerimeter1() */

    /**
     * Tests the area calculation of the vacuous triangle.
     */
    @Test
    fun testArea0(){
        /* create a triangle */
        val triangle = Triangle(consts.NAME)
        /* set the initial dimensions */
        triangle.setDimensions(
            consts.SIDES0[0],
            consts.SIDES0[1],
            consts.SIDES0[2])
        /* calculate the area */
        val area = triangle.getArea()
        /* check against the expected value */
        assertEquals(consts.AREA0, area, consts.ABSOLUTE_TOLERANCE)
    } /* end fun testArea0() */

    /**
     * Tests the area calculation of the regular triangle.
     */
    @Test
    fun testArea1(){
        /* create a triangle */
        val triangle = Triangle(consts.NAME)
        /* set the initial dimensions */
        triangle.setDimensions(
            consts.SIDES1[0],
            consts.SIDES1[1],
            consts.SIDES1[2])
        /* calculate the area */
        val area = triangle.getArea()
        /* check against the expected value */
        assertEquals(consts.AREA1, area, consts.ABSOLUTE_TOLERANCE)
    } /* end fun testArea0() */

    /**
     * Tests the area calculation of the 3-4-5 triangle.
     */
    @Test
    fun testArea365(){
        /* create a triangle */
        val triangle = Triangle(consts.NAME)
        /* set the initial dimensions */
        triangle.setDimensions(
            consts.SIDES345[0],
            consts.SIDES345[1],
            consts.SIDES345[2])
        /* calculate the area */
        val area = triangle.getArea()
        /* check against the expected value */
        assertEquals(consts.AREA345, area, consts.ABSOLUTE_TOLERANCE)
    } /* end fun testArea0() */

} /* end class TbTriangle */

/**
 * Holds the constants for test benching triangles.
 */
object TbTriangleConsts{
    /** test triangle name */
    const val NAME = "triangle ABC"
    /** sides of a test vacuous triangle */
    val SIDES0 = doubleArrayOf(0.0, 0.0, 0.0)
    /** expected string representation of test vacuous triangle */
    const val DIMENSIONS0 =
        "side #1 = 0.0000e+00, side #2 = 0.0000e+00, side #3 = 0.0000e+00"
    /** expected perimeter of test vacuous triangle */
    const val PERIMETER0 = 0.0
    /** expected area of test vacuous triangle */
    const val AREA0 = 0.0
    /** sides of a test regular triangle */
    val SIDES1 = doubleArrayOf(1.0, 1.0, 1.0)
    /** expected string representation of test regular triangle */
    const val DIMENSIONS1 =
        "side #1 = 1.0000e+00, side #2 = 1.0000e+00, side #3 = 1.0000e+00"
    /** expected perimeter of test regular triangle */
    const val PERIMETER1 = 3.0
    /** expected area of test regular triangle */
    const val AREA1 = 4.3301e-01
    /** sides of the 3-4-5 triangle */
    val SIDES345 = doubleArrayOf(3.0, 4.0, 5.0)
    /** expected string representation of the 3-4-5 triangle */
    const val DIMENSIONS345 =
        "side #1 = 3.0000e+00, side #2 = 4.0000e+00, side #3 = 5.0000e+00"
    /** expected perimeter of the 3-4-5 triangle */
    const val PERIMETER345 = 12.0
    /** expected area of the 3-4-5 triangle */
    const val AREA345 = 6.0000
    /** the maximum allowable difference between calculated areas */
    const val ABSOLUTE_TOLERANCE = 0.00005
} /* end object TbTriangleConsts */
