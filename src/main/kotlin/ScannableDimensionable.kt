import java.io.PrintWriter
import java.util.*

/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/ScannableDimensionable.kt
 * Represents a shape taking up an area in two dimensions that can be
 * scanned from input.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-11t02:14Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
interface ScannableDimensionable : Dimensionable {

    /**
     * Prints a prompt to the output stream, then scans in new
     * dimensions from input.
     * @param out : PrintWriter = to which to print prompts for input
     * @param sc : Scanner = from which to scan new dimensions
     */
    fun scanDimensions(out : PrintWriter, sc : Scanner);

} /* end interface ScannableDimensionable */
