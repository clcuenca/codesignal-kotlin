/// CodeSignal - Intro - Exploring the Waters
/// Palindrome Rearranging
/// Author: Carlos L. Cuenca
/// Date: 10/31/2020

/// ------------------------
/// Function Implementations

fun palindromeRearranging(string: String): Boolean {

	var hash  : MutableList<Int> = MutableList<Int>(26) { 0 }
	var fault : Int 		     = 0

	for(index in 0 until string.length)
		hash[string[index] - 'a']++

	for(index in 0 until 26) {

		if(hash[index] % 2 != 0) fault++

		if(fault > 1) break

	}

	return fault <= 1

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val line : String = readLine()!!

		println(palindromeRearranging(line))

		inputCount--

	}

}
