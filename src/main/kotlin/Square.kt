import kotlin.reflect.typeOf

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/Square.kt
 * A shape with 4 equal sides.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t19:06Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class Square (_name : String): Shape(_name){

    /**
     * The horizontal length of the square.
     * @see #setDimensions
     * @see #printDimensions
     */
    private var length = 0.0

    /**
     * The vertical length of the square.
     * @see #setDimensions
     * @see #printDimensions
     */
    private var height = 0.0

    /**
     * Updates the horizontal and vertical lengths of this square.
     * @param _length : Double = new horizontal length of this square
     * @param _height : Double = new vertical length of this square
     */
    fun setDimensions(_length : Double, _height : Double){
        this.length = _length
        this.height = _height
    } /* end fun setDimensions(_length : Double, _height : Double) */

    /**
     * Represents the dimensions of this square as a string.
     * @return the string representation
     */
    override fun dimensionsToString() : String{
        return ("length = ${"%.4e".format(this.length)}, "
            + "height = ${"%.4e".format(this.height)}")
    } /* end fun dimensionsToString() */

    /**
     * Calculates the area of this square.
     * @return the area of this square
     */
    override fun getArea(): Double{
        return (this.length * this.height)
    } /* end class getArea() */

} /* end class Square */
