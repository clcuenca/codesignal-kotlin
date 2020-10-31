/// CodeSignal - Intro - The Journey Begins
/// Array Maximal Adjacent Difference
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun arrayMaximalAdjacentDifference(inputArray: MutableList<Int>): Int {

	var maximumDifference : Int = 0

	for(index in 0 until inputArray.size - 1)
		maximumDifference = Math.max(maximumDifference, Math.abs(inputArray[index] - inputArray[index + 1]))

	return maximumDifference

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val numbers : MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()

		println(arrayMaximalAdjacentDifference(numbers))

		inputCount--

	}

}
