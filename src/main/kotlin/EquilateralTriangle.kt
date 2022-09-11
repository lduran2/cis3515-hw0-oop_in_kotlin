/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/EquilateralTriangle.kt
 * A triangle with equal sides.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t20:10Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
class EquilateralTriangle (_name : String): Triangle(_name, DoubleArray(1)){

    /**
     * @inheritDoc
     * All three sides are equal in magnitude.
     */
    override fun getSideUnsafe(index : Int) : Double{
        /* all sides stored at 0 */
        return this.getSideUnsafe(0)
    } /* end fun getSide(index : Int) : Double */

    /**
     * Updates the sides of this triangle.
     * @param side : Double = new magnitude of each side
     */
    fun setDimensions(side : Double){
        this.setSideUnsafe(0, side)
    } /* end fun setDimensions(side : Double) */

} /* end class EquilateralTriangle */
