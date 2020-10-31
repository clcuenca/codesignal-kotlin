/// CodeSignal - Intro - Smooth Sailing
/// Sort By Height
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun sortByHeight(array: MutableList<Int>): MutableList<Int> {

	var people: MutableList<Int> = mutableListOf()

	for(index in 0 until array.size)
		if(array[index] != -1) people.add(array[index])

    people.sort()

	var current : Int = 0

	for(index in 0 until array.size) {

		if(array[index] != -1) {

			array[index] = people[current]

			current++

		}

	}

	return array

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val values : MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()

		println(sortByHeight(values))

		inputCount--

	}

}
