/// CodeSignal - Intro - Edge of the Ocean
/// Matrix Elements Sum
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
    
    var sum        : Int = 0
    var notHaunted : MutableList<Boolean> = MutableList<Boolean>(matrix[0].size){ true }
    
    for(row in 0 until matrix.size)
        for(column in 0 until matrix[row].size) {
            
            notHaunted[column] = notHaunted[column] && matrix[row][column] != 0
            
            if(notHaunted[column]) sum += matrix[row][column]
        
        }
        
    return sum
    
}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val values  : List<Int> = readLine()!!.split(' ').map(String::toInt)
		val rows    : Int       = values[0]

		var matrix : MutableList<MutableList<Int>> = mutableListOf<MutableList<Int>>()

		for(row in 0 until rows) {
			
			val numbers : MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()

			matrix.add(numbers)

		}

		println(matrixElementsSum(matrix))

		inputCount--

	}

}
