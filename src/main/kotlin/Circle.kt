/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/Circle.kt
 * A shape consisting of all equidistant points from a central point.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-09t19:25Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class Circle (_name : String): Shape(_name){

    /**
     * The distance between the central point and any point on the
     * circle.
     * It must be modified through `setDimensions`.
     * @see #setDimensions
     */
    var radius = 0.0
        private set(_double){}

    /**
     * Updates the radius of this circle.
     * @param _radius : Double = new radius of this circle
     */
    fun setDimensions(_radius : Double){
        this.radius = _radius
    } /* end fun setDimensions(_radius : Double) */

} /* end class Circle */
