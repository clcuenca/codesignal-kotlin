/// CodeSignal - Intro - The Journey Begins
/// Add
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun add(a: Int, b: Int) {

	return a + b

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val numbers : List<Int> = readLine()!!.split(' ').map(String::toInt)

		println(add(numbers[0], numbers[1]))

		inputCount--

	}

}
