/// CodeSignal - Intro - Island of Knowledge
/// Is IPv4 Address
/// Author: Carlos L. Cuenca
/// Date: 10/31/2020

import java.util.Stack

/// ------------------------
/// Function Implementations

fun isIPv4Address(string: String): Boolean {

	var strings   : Stack<String> = Stack()
	var last      : Int           = 0
	var isAddress : Boolean 

	for(index in 0 until string.length) {

		if(string[index] == '.') {

			if(last > 0) last += 1

			strings.push(string.substring(last, index))

			last = index

		}

		if(index == string.length - 1){

			strings.push(string.substring(IntRange(last + 1, index)))

		}

	}

	isAddress = strings.size == 4

	while(strings.size > 0 && isAddress) {

		var number : String = strings.peek()

		strings.pop()

		isAddress = isAddress&&(number.length > 0 && number.length <= 3)

		for(index in 0 until number.length) {

			isAddress = isAddress && (number[index] >= '0' && number[index] <= '9')
			isAddress = isAddress && !(number[0] == '0' && number.length > 1)

		}

		if(!isAddress) break

		isAddress = isAddress&&(number.toInt() >= 0 && number.toInt() <= 255)

	}

	return isAddress

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val address : String = readLine()!!

		println(isIPv4Address(address))

		inputCount--

	}

}
