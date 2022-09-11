import kotlin.math.PI

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/Circle.kt
 * A shape consisting of all equidistant points from a central point.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-09t22:28Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class Circle (_name : String): Shape(_name){

    /**
     * The distance between the central point and any point on the
     * circle.
     * @see #setDimensions
     * @see #printDimensions
     */
    var radius = 0.0

    /**
     * Updates the radius of this circle.
     * @param _radius : Double = new radius of this circle
     */
    fun setDimensions(_radius : Double){
        this.radius = _radius
    } /* end fun setDimensions(_radius : Double) */

    /**
     * Represents the dimensions of this circle as a string.
     * @return the string representation
     */
    override fun dimensionsToString() : String{
        return "radius = ${"%.4e".format(this.radius)}"
    } /* end fun dimensionsToString() */

    /**
     * Calculates the area of this square.
     * @return the area of this square
     */
    override fun getArea(): Double{
        return (PI * this.radius * this.radius)
    } /* end class getArea() */

} /* end class Circle */
