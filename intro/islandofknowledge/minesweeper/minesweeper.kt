/// CodeSignal - Intro - Island of Knowledge
/// Minesweeper
/// Author: Carlos L. Cuenca
/// Date: 11/2/2020

/// ------------------------
/// Function Implementations

fun minesweeper(board: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> {

	var returnBoard : MutableList<MutableList<Int>> = mutableListOf()
	var buffer      : Int

	for(row in 0 until board.size) {
        
        returnBoard.add(mutableListOf())
        
		for(column in 0 until board[row].size) {

			buffer = 0

			if((row - 1 >= 0) && (column - 1 >= 0) && board[row - 1][column - 1]) buffer++
			if((row - 1 >= 0) && board[row - 1][column]) buffer++
			if((row - 1 >= 0) && (column + 1 < board[row].size) && board[row - 1][column + 1]) buffer++
            
            if((column - 1 >= 0) && board[row][column - 1]) buffer++
            if((column + 1 < board[row].size) && board[row][column + 1]) buffer++
            
            if((row + 1 < board.size) && (column - 1 >= 0) && board[row + 1][column - 1]) buffer++
            if((row + 1 < board.size) && board[row + 1][column]) buffer++
            if((row + 1 < board.size) && (column + 1 < board[row + 1].size) && board[row + 1][column + 1]) buffer++

			returnBoard[row].add(buffer)

		}
        
    }

	return returnBoard

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val rows   : Int = readLine()!!.toInt()
		var matrix : MutableList<MutableList<Boolean>> = mutableListOf()

		for(index in 0 until rows) {

			val numbers : MutableList<Boolean> = readLine()!!.split(' ').map(String::toBoolean).toMutableList()
			
			matrix.add(numbers)

		}

		var outMatrix = minesweeper(matrix)

		for(row in outMatrix) {

			println(row)

		}

		inputCount--

	}

}
