/// CodeSignal - Intro - Smooth Sailing
/// Common Character Count
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun commonCharacterCount(string1: String, string2: String): Int {

	var shared : Int        = 0
	var hash1   = IntArray(26)
	var hash2   = IntArray(26)

	for(index in 0 until string1.length)
		hash1[string1[index] - 'a']++

	for(index in 0 until string2.length)
		hash2[string2[index] - 'a']++

	for(index in 0 until 26)
		shared += Math.min(hash1[index], hash2[index])


	return shared

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val string1 : String = readLine()!!
		val string2 : String = readLine()!!

		println(commonCharacterCount(string1, string2))

		inputCount--

	}

}
