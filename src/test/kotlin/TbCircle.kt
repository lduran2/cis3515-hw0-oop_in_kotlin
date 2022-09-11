import org.junit.Test
import kotlin.test.assertEquals
import java.lang.Math.pow
import kotlin.math.PI

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/test/kotlin/TbCircle.kt
 * Tests the name and dimension accessors of the dimensions of the circle.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t21:29Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class TbCircle{

    /** the object holding the testing constants */
    private val consts = TbCircleConsts

} /* end class TbCircle */

/**
 * Holds the constants for test benching circles.
 */
object TbCircleConsts{
    /** test circle name */
    const val NAME = "circle P"
    /** radius of test unit circle */
    const val RADIUS1 = 1.0
    /** expected string representation of test unit circle */
    const val DIMENSIONS1 = "radius = 1.0000e+00"
    /** radius of another test circle */
    val RADIUS2 = pow(PI, (-1.0/2.0))
    /** expected string representation of another test circle */
    const val DIMENSIONS2 = "radius = 5.6419e-01"
} /* end object TbCircleConsts */
