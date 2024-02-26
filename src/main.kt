fun main() {
    // Área de un rectángulo
    val base = 5.0
    val altura = 3.0
    val areaRectangulo = calcularAreaRectangulo(base, altura)
    println("El área del rectángulo es: $areaRectangulo")

    // Volumen de un prisma rectangular
    val profundidad = 4.0
    //Área del rectángulo calculada anteriormente con la función calcularAreaRectangulo
    val volumenPrisma = calcularVolumenPrisma(areaRectangulo, profundidad)
    println("El volumen del prisma rectangular es: $volumenPrisma")

    // Promedio de calificaciones
    //Caso 0: Todas las calificaciones
    var promedioCalificaciones = calcularPromedio(7,8,9)
    println("El promedio de las calificaciones, caso 0, es: $promedioCalificaciones")

    //Caso 1: Sólo una calificación
    //promedioCalificaciones = calcularPromedio(7)
    println("El promedio de las calificaciones, caso 1, es: Kotlin: No value passed for parameter 'calificacion3'")

    //Caso 2: Dos calificaciones
    //promedioCalificaciones = calcularPromedio(7,8)
    println("El promedio de las calificaciones, caso 2, es: Kotlin: No value passed for parameter 'calificacion3'")

    //Caso 3: Sólo la tercer calificación
    promedioCalificaciones = calcularPromedio(calificacion3 = 10)
    println("El promedio de las calificaciones, caso 3, es: $promedioCalificaciones")

    // Tipo de triángulo
    tipoTriangulo(5, 5, 5) // Equilátero
    tipoTriangulo(5, 5, 4) // Isósceles
    tipoTriangulo(3, 4, 6) // Escaleno

    //Tipo dato
    var variable: Any

    // Caso String
    variable = "Hola"
    identificarTipo(variable)

    // Caso Int
    variable = 5
    identificarTipo(variable)

    // Caso Double
    variable = 3.14
    identificarTipo(variable)

    // Caso Otro
    variable = true
    identificarTipo(variable)

    //Repeticiones en una lista de nombres
    val nombres = listOf(
        "Pedro Luis", "Juan Manuel", "Juan Luis", "María Inés", "Romeo",
        "Ernesto", "Juan Pedro", "Ariadna", "Mireya María", "Ana Sofía", "José Juan"
    )

    val nombreBuscar = "Juan"
    val repeticiones = contarRepeticiones(nombres, nombreBuscar)

    println("El nombre '$nombreBuscar' se repite $repeticiones veces en la lista.")
}

fun calcularAreaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun calcularVolumenPrisma(areaBase: Double, profundidad: Double): Double {
    return areaBase * profundidad
}

fun calcularPromedio(calificacion1: Int = 8, calificacion2: Int = 8, calificacion3: Int): Double {
    val totalCalificaciones = calificacion1 + calificacion2 + calificacion3
    return totalCalificaciones.toDouble() / 3
}

fun tipoTriangulo(lado1: Int, lado2: Int, lado3: Int) {
    if (lado1 == lado2 && lado2 == lado3) {
        println("El triángulo es Equilátero")
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        println("El triángulo es Isósceles")
    } else {
        println("El triángulo es Escaleno")
    }

}

fun identificarTipo(variable: Any) {
    val tipo = when (variable) {
        is String -> "String"
        is Int -> "Int"
        is Double -> "Double"
        else -> "Otro"
    }

    println("El tipo de dato de la variable es: $tipo")
}

fun contarRepeticiones(nombres: List<String>, nombreBuscar: String): Int {
    var contador = 0
    for (nombre in nombres) {
        if (nombre.contains(nombreBuscar)) {
            contador++
        }
    }
    return contador
}
