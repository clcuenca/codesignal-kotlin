/// CodeSignal - Intro - Island of Knowledge
/// Are Equally Strong
/// Author: Carlos L. Cuenca
/// Date: 10/31/2020

/// ------------------------
/// Function Implementations

fun areEquallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean {

	return ((yourLeft == friendsRight) || (yourLeft == friendsLeft)) &&
			((yourRight == friendsLeft) || (yourRight == friendsRight))

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val numbers : List<Int> = readLine()!!.split(' ').map(String::toInt)

		println(areEquallyStrong(numbers[0], numbers[1], numbers[2], numbers[3]))

		inputCount--

	}

}
