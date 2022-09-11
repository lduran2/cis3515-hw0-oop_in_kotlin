import java.lang.System.`in`
import java.lang.System.`err`
import java.util.Scanner
import java.io.PrintWriter

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/Main.kt
 * Demonstrates the shape objects.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-11t19:17Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
fun main(args: Array<String>){
    val shapes = createShapes()     /* shapes to manipulate */
    inputDimensionsFor(shapes)       /* input their dimensions */
} /* end fun main(args: Array<String>)*/

/**
 * Creates an array of Square ABCD, Circle P, Triangle EFG, and
 * Equilateral Triangle HIJ.
 * @return the array of shapes
 */
fun createShapes() : List<Shape>{
    /* instances of shape classes */
    /* store each in a variable of type Shape */
    return listOf<Shape>(
        Square("Square ABCD"),
        Circle("Circle P"),
        Triangle("Triangle EFG"),
        EquilateralTriangle("Equilateral Triangle HIJ")
    ) /* end val shapes */
} /* end fun createShapes() */

/**
 * Retrieves dimensions from STDIN and updates the shapes with these.
 * @param shapes : Iterable<Shapes> = to manipulate
 */
fun inputDimensionsFor(shapes : Iterable<Shape>){
    val sc = Scanner(`in`)          /* scanner on STDIN */
    val err = PrintWriter(`err`)    /* printer on STDERR for prompts */
    /* loop through the shapes */
    for (shape in shapes){
        /* use input to update the shapes' dimensions */
        shape.scanDimensionsFrom(sc, err)
    } /* end for (shape in shapes) */
} /* end fun inputDimensionsFor(shapes : Iterable<Shape>) */
