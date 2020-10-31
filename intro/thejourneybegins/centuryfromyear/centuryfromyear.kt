/// CodeSignal - Intro - The Journey Begins
/// Century From Year
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun centuryFromYear(year: Int): Int {

	var century: Int = year / 100

	if(year % 100 != 0) century++

	return century

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		var year: Int = readLine()!!.toInt();

		println(centuryFromYear(year))

		inputCount--

	}

}
