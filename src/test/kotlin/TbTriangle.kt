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

} /* end class TbTriangle */

/**
 * Holds the constants for test benching triangles.
 */
object TbTriangleConsts{
    /** test triangle name */
    const val NAME = "triangle ABC"

    /** sides of a test regular triangle */
    val SIDES1 = doubleArrayOf(1.0, 1.0, 1.0)
    /** expected string representation of test regular triangle */
    const val DIMENSIONS1 =
        "side #1 = 1.0000e+00, side #2 = 1.0000e+00, side #3 = 1.0000e+00"

    /** sides of the 3-4-5 triangle */
    val SIDES345 = doubleArrayOf(3.0, 4.0, 5.0)
    /** expected string representation of the 3-4-5 triangle */
    const val DIMENSIONS345 =
        "side #1 = 3.0000e+00, side #2 = 4.0000e+00, side #3 = 5.0000e+00"

} /* end object TbTriangleConsts */
