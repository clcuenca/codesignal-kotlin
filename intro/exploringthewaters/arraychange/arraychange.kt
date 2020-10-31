/// CodeSignal - Intro - Exploring the Waters
/// Array Change
/// Author: Carlos L. Cuenca
/// Date: 10/31/2020

/// ------------------------
/// Function Implementations

fun arrayChange(inputArray: MutableList<Int>): Int {

	var moves      : Int = 0
	var difference : Int = 0

	for(index in 0 until inputArray.size - 1) {

		if(inputArray[index] >= inputArray[index + 1]) {

			difference = inputArray[index] - inputArray[index + 1]

			moves += difference + 1

			inputArray[index + 1] += difference + 1

		}

	}

	return moves

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val numbers : MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()

		println(arrayChange(numbers))

		inputCount--

	}

}
