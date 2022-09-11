/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/Square.kt
 * A shape with 4 equal sides.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-09t19:17Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class Square (_name : String): Shape(_name){

    /**
     * The horizontal length of the square.
     * It must be modified through `setDimensions`.
     * @see #setDimensions
     */
    var length = 0.0
        private set(_double){}

    /**
     * The vertical length of the square.
     * It must be modified through setDimensions.
     * @see #setDimensions
     */
    var height = 0.0
        private set(_double){}

    /**
     * Updates the horizontal and vertical lengths of this square.
     * @param _length : Double = new horizontal length of this square
     * @param _height : Double = new vertical length of this square
     */
    fun setDimensions(_length : Double, _height : Double){
        this.length = _length
        this.height = _height
    } /* end fun setDimensions(_length : Double, _height : Double) */

} /* end class Square */
