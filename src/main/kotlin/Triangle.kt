import java.util.Scanner
import java.io.PrintWriter

import kotlin.math.sqrt

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/Triangle.kt
 * A three-sided shape.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-11t19:49Q
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
     * Updates the magnitude of the side given by index.
     * Since this is a protected function, no index bound check is
     * performed.
     * @param index : Int = of the side
     * @param _side : Double = new magnitude of the side
     */
    protected open fun setSideUnsafe(index : Int, _side : Double){
        this.sides[index] = _side
    } /* end fun getSide(index : Int) : Double */

    /**
     * Represents the dimensions of this triangle as a string.
     * @return the string representation
     */
    override fun dimensionsToString() : String {
        /* for each side */
        return (0 until TriangleConsts.N_SIDES)
            /* format as an equation, */
            .map{"side #${it + 1} = ${"%.4e".format(this.getSideUnsafe(it))}"}
            /* join with ", " */
            .joinToString(", ")
        ;
    } /* end fun dimensionsToString() */

    /**
     * Prints a prompt for each side, scanning them from input.
     * @param sc : Scanner = from which to scan new dimensions
     * @param out : PrintWriter = to which to print prompts for input
     */
    override fun scanDimensionsFrom(sc : Scanner, out : PrintWriter){
        /* all sides of the triangle, 1-indexed */
        val sides = DoubleArray(TriangleConsts.N_SIDES + 1)
        /* header */
        out.print("For ${name}:\n")

        /* get each side */
        for (i in 1..TriangleConsts.N_SIDES){
            out.print("\tEnter side #${i}: ")
            out.flush()
            sides[i] = sc.nextDouble()
        } /* end for (i in 1..TriangleConsts.N_SIDES) */

        /* update the dimensions */
        this.setDimensions(sides[1], sides[2], sides[3])
    } /* end fun scanDimensionsFrom(sc : Scanner, out : PrintWriter) */

    /**
     * Finds the area of this triangle.
     * @return the area of this triangle
     */
    override fun getArea() : Double{
        val s = (this.getPerimeter() / 2)       /* semi-perimeter */
        /* product of (s - si) for each side */
        val prod = (0 until TriangleConsts.N_SIDES)
            .map{s - this.getSideUnsafe(it)}
            .reduce(Double::times)
        /* return square root of total product */
        return sqrt((s * prod))
    } /* end fun getArea() */

    /**
     * Finds the perimeter of this triangle.
     * @return the perimeter of this triangle
     */
    fun getPerimeter() : Double{
        /* find the sum of each side */
        return (0 until TriangleConsts.N_SIDES)
            .map{this.getSideUnsafe(it)}
            .sum()
    } /* end fun getPerimeter() */

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
