/**
 * Canonical : https://github.com/lduran2/cis3515-hw0-oop_in_kotlin/blob/dev/src/main/kotlin/Main.kt
 * Demonstrates the shape objects.
 * By        : Leomar Durán <https://github.com/lduran2>
 * When      : 2022-09-11t03:23Q
 * For       : CIS3515/Intro to Mobile Application Development
 */
fun main(args: Array<String>) {
    /* instances of shape classes */
    /* store each in a variable of type Shape */
    val shapes = arrayOf<Shape>(
        Square(),
        Circle(),
        Triangle(),
        EquilateralTriangle()
    )

    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}