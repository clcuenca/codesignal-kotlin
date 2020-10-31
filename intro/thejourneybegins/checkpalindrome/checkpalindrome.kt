/// CodeSignal - Intro - The Journey Begins
/// Check Palindrome
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

/// ------------------------
/// Function Implementations

fun checkPalindrome(string: String): Boolean {

	var isPalindrome: Boolean = true;

	for(index in 0 until string.length) {

		isPalindrome = isPalindrome && (string[index] == string[string.length - index - 1])

	}

	return isPalindrome;

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val string : String = readLine()!!

		println(checkPalindrome(string))

		inputCount--

	}

}
