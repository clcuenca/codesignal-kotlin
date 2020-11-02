/// CodeSignal - Intro - Island of Knowledge
/// Avoid Obstacles
/// Author: Carlos L. Cuenca
/// Date: 10/31/2020

/// ------------------------
/// Function Implementations

fun avoidObstacles(array: MutableList<Int>): Int {

	var multiple : Int = 2
    var index    : Int = 0
    
    while(index < array.size) {
        
        if(array[index] % multiple == 0) {
            
            multiple++
            
            index = -1
            
        }
        
        index++
        
    }

	return multiple

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val numbers : MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()

		println(avoidObstacles(numbers))

		inputCount--

	}

}
