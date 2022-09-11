/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/Shape.kt
 * Represents a shape taking up an area in two dimensions.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-11t11:14Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
abstract class Shape (_name : String): Dimensionable{
    /** name referring to this shape */
    var name = _name

    /**
     * Calculates the area of this shape.
     * @return the area of this shape
     */
    open fun getArea(): Double{
        return 0.0
    } /* end class getArea() */

    /**
     * Prints the dimensions of this shape.
     * Delegates to `print` and `dimensionsToString`.
     * @see #dimensionsToString
     */
    override fun printDimensions() {
        print(dimensionsToString())
    } /* end fun printDimensions() */

    /**
     * Represents the dimensions of this shape as a string.
     * @return the string representation
     */
    open fun dimensionsToString() : String {
        return ""
    } /* end fun dimensionsToString() */

} /* end class Shape */