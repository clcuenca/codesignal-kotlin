/// CodeSignal - Intro - Edge of the Ocean
/// Make Array Consecutive 2
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun makeArrayConsecutive2(statues: MutableList<Int>): Int {

	statues.sort()

	var count: Int = 0

	for(index in 1 until statues.size) {

		count += statues[index] - statues[index - 1] - 1;

	}

	return count

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val statues : MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()

		println(makeArrayConsecutive2(statues))

		inputCount--

	}

}
