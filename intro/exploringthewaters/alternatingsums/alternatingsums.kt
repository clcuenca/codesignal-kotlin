/// CodeSignal - Intro - Exploring the Waters
/// Alternating Sums
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun alternatingSums(array: MutableList<Int>): MutableList<Int> {

	var returnArray : MutableList<Int> = MutableList<Int>(2) { 0 }

	for(index in 0 until array.size) {

		if((index % 2) == 0) returnArray[0] += array[index]
		else 				 returnArray[1] += array[index]

	}
    
	return returnArray

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val input : MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()

		println(alternatingSums(input))

		inputCount--

	}

}
