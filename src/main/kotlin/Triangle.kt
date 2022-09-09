/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/Triangle.kt
 * A three-sided shape.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-09t18:43Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
open class Triangle (_name : String): Shape(_name){

    /**
     * The three sides of the triangle.
     * They must be modified through `setDimensions`.
     * @see #setDimensions
     */
    val sides = doubleArrayOf(0.0, 0.0, 0.0)

    /**
     * Updates the sides of this triangle.
     * @param _s1 : Double = side #1
     * @param _s2 : Double = side #2
     * @param _s3 : Double = side #3
     */
    fun setDimensions(_s1 : Double, _s2 : Double, _s3 : Double){
        sides[0] = _s1
        sides[1] = _s2
        sides[2] = _s3
    } /* end fun setDimensions(_length : Double, _height : Double) */

} /* end class Triangle */
