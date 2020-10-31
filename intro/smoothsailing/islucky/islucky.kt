/// CodeSignal - Intro - Smooth Sailing
/// Is Lucky
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun isLucky(n: Int): Boolean {

	var firstSum  : Int = 0
	var secondSum : Int = 0
	var digits    : Int = 0
	var copy      : Int = n

	while(copy != 0) { digits++; copy /= 10; }

    copy = n

	for(count in 0 until digits) {

		if(count < digits / 2) secondSum += (copy % 10)
		else 				   firstSum  += (copy % 10)

		copy /= 10

	}

	return firstSum == secondSum

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val number : Int = readLine()!!.toInt()

		println(isLucky(number))

		inputCount--

	}

}
