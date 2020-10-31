/// CodeSignal - Intro - Exploring the Waters
/// Add Border
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun addBorder(image: MutableList<String>): MutableList<String> {

	var borderImage : MutableList<String> = mutableListOf()

	var topBorder    : String = ""
	var bottomBorder : String = ""

	for(index in 0 until image[0].length + 2) {

			topBorder += '*'
			bottomBorder += '*'

	}

	borderImage.add(topBorder)


	for(row in 1 until image.size + 1) {

		var line : String = ""

		for(column in 0 until image[0].length + 2) {
            
			if(column == 0 || column == image[0].length + 1) line += '*'

			else line += image[row - 1][column - 1]

		}

		borderImage.add(line)

	}

	borderImage.add(bottomBorder)

	return borderImage

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val rows  : Int                 = readLine()!!.toInt()
		var image : MutableList<String> = mutableListOf()

		for(line in 0 until rows) {

			val row: String = readLine()!!

			image.add(row)

		}

		image = addBorder(image)

		for(row in 0 until image.size)

			println(image[row])


		inputCount--

	}

}
