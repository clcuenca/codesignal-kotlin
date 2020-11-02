/// CodeSignal - Intro - The Journey Begins
/// Box Blur
/// Author: Carlos L. Cuenca
/// Date: 11/1/2020

/// ------------------------
/// Function Implementations

fun boxBlur(image: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {

	var matrix: MutableList<MutableList<Int>> = mutableListOf()

	for(row in 1 until image.size - 1) {

		var newRow : MutableList<Int> = mutableListOf()

		for(column in 1 until image[row].size - 1) {

			var average = (image[row - 1][column - 1]  + image[row - 1][column] + image[row - 1][column + 1] +
							image[row][column - 1]     + image[row][column]     + image[row][column + 1]     + 
							image[row + 1][column - 1] + image[row + 1][column] + image[row + 1][column + 1]) / 9

			newRow.add(average)

		}

		matrix.add(newRow)

	}

	return matrix

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		var rows    : Int                           = readLine()!!.toInt()
		var image   : MutableList<MutableList<Int>> = mutableListOf()

		for(index in 0 until rows) {

			val row = readLine()!!.split(' ').map(String::toInt).toMutableList()

			image.add(row)

		}

		image = boxBlur(image)

		for(line in image) {

			println(line)

		}

		println('\n')

		inputCount--

	}

}
