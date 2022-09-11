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
class TbEquilateralTriangle{

    /** the object holding the testing constants */
    private val consts = TbEquilateralTriangleConsts

} /* end class TbEquilateralTriangle */

/**
 * Holds the constants for test benching equilateral triangles.
 */
object TbEquilateralTriangleConsts{
    /** test triangle name */
    const val NAME = "triangle ABC"

    /** sides of a test equilateral triangle */
    const val SIDES_LENGTH1 = 1.0
    /** expected string representation of test equilateral triangle */
    const val DIMENSIONS1 =
        "side #1 = 1.0000e+00, side #2 = 1.0000e+00, side #3 = 1.0000e+00"

    /** sides of another test equilateral triangle */
    val SIDES_LENGTH2 = ((2.0 * pow(3.0, 0.75))/3.0)
    /** expected string representation of another test equilateral triangle */
    const val DIMENSIONS2 =
        "side #1 = 1.5197e+00, side #2 = 1.5197e+00, side #3 = 1.5197e+00"

} /* end object TbEquilateralTriangleConsts */
