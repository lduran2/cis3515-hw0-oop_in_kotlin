/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/Triangle.kt
 * A three-sided shape.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-09t23:17Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
open class Triangle: Shape{

    /**
     * The three sides of the triangle.
     * They must be modified through `setDimensions`.
     * @see #setDimensions
     */
    protected val sides : DoubleArray

    /**
     * Allocates space for a new triangle and initializes it with the
     * given name and all 3 sides of length 0.0.
     * @param _name : String = name of this new triangle
     */
    constructor(_name : String): this(_name, DoubleArray(N_SIDES)){}

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
     * Returns the magnitude of the side given by index.
     * @param index : Int = of the side
     * @return magnitude of the side
     */
    fun getSide(index : Int) : Double{
        checkSideIndex(index)
        /* return magnitude of the corresponding side if within bounds */
        return this.sides[index]
    } /* end fun getSide(index : Int) : Double */

    /**
     * Checks if the side index is within of bounds (0 until N_SIDES).
     * @param index : Int = of the side
     * @throws IndexOutOfBoundsException if the side index is out of bounds
     */
    protected fun checkSideIndex(index : Int){
        /* check that the index is not out of range */
        if (index !in 0 until N_SIDES) {
            /* if so, stop the program */
            throw IndexOutOfBoundsException(
                "Index: ${index}, #sides: ${N_SIDES}")
        } /* end if (index !in 0 until N_SIDES) */
    } /* end fun checkSideIndex(index : Int) */

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
    } /* end fun setDimensions(_s1 : Double, _s2 : Double, _s3 : Double) */

} /* end class Triangle */

/**
 * The number of sides in a triangle.
 */
private const val N_SIDES = 3
