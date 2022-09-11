import java.io.PrintWriter
import java.util.*

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/EquilateralTriangle.kt
 * A triangle with equal sides.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-11t18:30Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class EquilateralTriangle (_name : String): Triangle(_name, DoubleArray(1)){

    /**
     * @inheritDoc
     * All three sides are equal in magnitude.
     */
    override fun getSideUnsafe(index : Int) : Double{
        /* all sides stored at 0,
         * so call super class to get size 0 */
        return super.getSideUnsafe(0)
    } /* end fun getSide(index : Int) : Double */

    /**
     * Updates the sides of this triangle.
     * @param side : Double = new magnitude of each side
     */
    fun setDimensions(side : Double){
        this.setSideUnsafe(0, side)
    } /* end fun setDimensions(side : Double) */

    /**
     * Prints a prompt for each side, scanning them from input.
     * @param sc : Scanner = from which to scan new dimensions
     * @param out : PrintWriter = to which to print prompts for input
     */
    override fun scanDimensionsFrom(sc : Scanner, out : PrintWriter){
        val length : Double     /* of all sides of triangle */
        /* header */
        out.print("For ${name},")
        /* prompt for length */
        out.print(" enter length of all sides: ")
        out.flush()
        /* get the length */
        length = sc.nextDouble()
        /* update the dimensions */
        this.setDimensions(length)
    } /* end fun scanDimensionsFrom(sc : Scanner, out : PrintWriter) */

} /* end class EquilateralTriangle */
