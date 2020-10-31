/// CodeSignal - Intro - Smooth Sailing
/// Reverse in Parenthesis
/// Author: Carlos L. Cuenca
/// Date: 10/30/2020

import java.util.Stack;

/// ------------------------
/// Function Implementations

fun reverseInParentheses(string: String): String {

	var track      : Stack<Pair<Int, Int>> = Stack()
    var workString : String                = string

	for(index in 0 until workString.length) {

		if(workString.get(index) == '(') track.push(Pair(index, -1))

		if(workString.get(index) == ')') {

			val pair : Pair<Int, Int> = Pair(track.peek().first, index)

			track.pop()

			workString = workString.substring(0, pair.first) + 
					workString.substring(pair.first, pair.second).reversed() +
					workString.substring(pair.second)
                    
		}

	}
    
    var returnString: String = ""
    
    for(index in 0 until workString.length)
        if(workString.get(index) != '(' && workString.get(index) != ')')
            returnString += workString.get(index)

	return returnString

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val string : String = readLine()!!

		println(reverseInParentheses(string))

		inputCount--

	}

}
