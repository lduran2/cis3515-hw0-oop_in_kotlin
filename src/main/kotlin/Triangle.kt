/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/Triangle.kt
 * A three-sided shape.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-10t20:07Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
open class Triangle: Shape{

    /**
     * The three sides of the triangle.
     * @see #constructor(String, DoubleArray)
     * @see #setDimensions
     * @see #printDimensions
     */
    private val sides : DoubleArray

    /**
     * Allocates space for a new triangle and initializes it with the
     * given name and all 3 sides of length 0.0.
     * @param _name : String = name of this new triangle
     */
    constructor(_name : String):
            this(_name, DoubleArray(TriangleConsts.N_SIDES)){}

    /**
     * Allocates space for a new triangle and initializes it with the
     * given name and the sides given .
     * @param _name : String = name of this new triangle
     */
    protected constructor(_name : String, _sides : DoubleArray):
            super(_name)
    {
        this.sides = _sides
    } /* end constructor(_name : String, _sides : DoubleArray) */

    /**
     * Updates the sides of this triangle.
     * @param _s1 : Double = new magnitude of side #1
     * @param _s2 : Double = new magnitude of side #2
     * @param _s3 : Double = new magnitude of side #3
     */
    fun setDimensions(_s1 : Double, _s2 : Double, _s3 : Double){
        /* set each side called open setSideUnsafe */
        this.setSideUnsafe(0, _s1)
        this.setSideUnsafe(1, _s2)
        this.setSideUnsafe(2, _s3)
    } /* end fun setDimensions(_s1 : Double, _s2 : Double, _s3 : Double) */

    /**
     * Returns the magnitude of the side given by index.
     * Since this is a protected function, no index bound check is
     * performed.
     * @param index : Int = of the side
     * @return magnitude of the side
     */
    protected open fun getSideUnsafe(index : Int) : Double{
        return this.sides[index]
    } /* end fun getSide(index : Int) : Double */

    /**
     * Updates the magnitude of the side given by index.
     * Since this is a protected function, no index bound check is
     * performed.
     * @param index : Int = of the side
     * @param _side : Double = new magnitude of the side
     */
    protected open fun setSideUnsafe(index : Int, _side : Double){
        this.sides[index] = _side
    } /* end fun getSide(index : Int) : Double */

} /* end class Triangle */

/**
 * Holds the constants for implementing triangles.
 */
object TriangleConsts {
    /**
     * The number of sides in a triangle.
     */
    const val N_SIDES = 3
} /* end object TriangleConsts */
