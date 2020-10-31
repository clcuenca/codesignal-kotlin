/// CodeSignal - Intro - Edge of the Ocean
/// Almost Increasing Sequence
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
    
    var count    : Int = 0
    var position : Int = 0
    
    for(index in 0 until sequence.size - 1) {
        
        if(sequence[index] >= sequence[index + 1]) {
            
            count++
            
            position = index
            
        }
        
    }
    
    var atBoundary : Boolean = position == 0 || position >= sequence.size - 2
    
    if(!atBoundary) atBoundary = sequence[position - 1] < sequence[position + 1] || sequence[position] < sequence[position + 2]
    
    return count <= 1 && atBoundary
    
}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val numbers : MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()

		println(almostIncreasingSequence(numbers))

		inputCount--

	}

}
