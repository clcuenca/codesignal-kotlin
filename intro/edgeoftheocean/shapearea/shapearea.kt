/// CodeSignal - Intro - Edge of the Ocean
/// Shape Area
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun shapeArea(number: Int): Int {

	var area: Int = 1

	for(index in 1 until number + 1) {

		area += 4*(index - 1)

	}

	return area

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val number : Int = readLine()!!.toInt()

		println(shapeArea(number))

		inputCount--

	}

}
