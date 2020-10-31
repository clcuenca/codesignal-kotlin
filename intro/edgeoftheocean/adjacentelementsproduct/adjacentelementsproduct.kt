/// CodeSignal - Intro - Edge of the Ocean
/// Adjacent Elements Product
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {

	var maximum = -999999999;

	for(index in 0 until inputArray.size - 1) {

		maximum = Math.max(maximum, inputArray[index]*inputArray[index + 1])

	}

	return maximum

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val numbers : MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()

		println(adjacentElementsProduct(numbers))

		inputCount--

	}

}
