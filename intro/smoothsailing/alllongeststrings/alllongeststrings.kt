/// CodeSignal - Intro - Smooth Sailing
/// All Longest Strings
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    
    var maximumLength  : Int = 0
    var longestStrings : MutableList<String> = mutableListOf<String>()
    
    for(string in inputArray) {
        
        if(string.length > maximumLength) {
            
            maximumLength = string.length
            
            longestStrings.clear()
            
            longestStrings.add(string)
            
        } else if(string.length == maximumLength) {
            
            longestStrings.add(string)
            
        }
        
    }
    
    return longestStrings
    
}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val stringCount : Int = readLine()!!.toInt()
		val strings     : MutableList<String> = mutableListOf<String>()

		for(line in 0 until stringCount) {

			val string : String = readLine()!!

			strings.add(string)

		}

		println(allLongestStrings(strings))

		inputCount--

	}

}
