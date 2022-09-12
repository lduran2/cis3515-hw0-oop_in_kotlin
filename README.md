# CIS 3515 Assignment #0
### Object Oriented Programming in Kotlin
###### by Leomar Durán

Exploration of inheritance, interfaces, encapsulation and polymorphism in Kotlin.

## Deliverables

### Executables

#### [Main.kt](src/main/kotlin/Main.kt)

Builds a list of shape objects, allows the user to change its dimensions, and then describes them.

### Tests

#### [TbSquare.kt](src/test/kotlin/TbSquare.kt)

1. Tests the name constructor, mutator and accessor for squares.
1. Tests the `setDimensions` and `dimensionsToString` (intermediate output for `printDimensions`) methods given a vacuous, regular, and irregular square.
1. Tests the `scanDimensionsFrom` method simulating user input for regular and irregular squares.
1. Tests the `getArea` method given vacuous, regular and irregular squares.

#### [TbCircle.kt](src/test/kotlin/TbCircle.kt)

1. Tests the name constructor, mutator and accessor for circles.
1. Tests the `setDimensions` and `dimensionsToString` (intermediate output for `printDimensions`) methods given a vacuous, unit, and another circle.
1. Tests the `scanDimensionsFrom` method simulating user input for unit and another circles.
1. Tests the `getArea` method given a vacuous, unit, and another circle.

#### [TbTriangle.kt](src/test/kotlin/TbTriangle.kt)

1. Tests the name constructor, mutator and accessor for triangles.
1. Tests the `setDimensions` and `dimensionsToString` (intermediate output for `printDimensions`) methods given a vacuous, regular, and the 3-4-5 triangle.
1. Tests the `scanDimensionsFrom` method simulating user input for regular and 3-4-5 triangles.
1. Tests the `getPerimeter` method given a vacuous, regular, and the 3-4-5 triangle.
1. Tests the `getArea` method given a vacuous, regular, and the 3-4-5 triangle.

#### [TbEquilateralTriangle.kt](src/test/kotlin/TbEquilateralTriangle.kt)

1. Tests the name constructor, mutator and accessor for triangles.
1. Tests the `setDimensions` and `dimensionsToString` (intermediate output for `printDimensions`) methods given a vacuous triangle and 2 other different
equilateral triangles.
1. Tests the `scanDimensionsFrom` method simulating user input for 2 different equilateral triangles.
