/// CodeSignal - Intro - Exploring the Waters
/// Are Similar?
/// Author: Carlos L. Cuenca
/// Date: 10/31/2020

import java.util.Stack

/// ------------------------
/// Function Implementations

fun areSimilar(a: MutableList<Int>, b: MutableList<Int>): Boolean {

	var pairs: Stack<Pair<Int, Int>> = Stack()

	for(index in 0 until a.size)
		if(a[index] != b[index]) pairs.push(Pair(a[index], b[index]))

	var canSwap : Boolean = pairs.size == 0

	while(pairs.size == 2) {

		var top : Pair<Int, Int> = pairs.peek()

		pairs.pop()

		canSwap = (top.first == pairs.peek().second) &&
			(top.second == pairs.peek().first)

	}

	return canSwap

}

/// --------------
/// Driver Program

fun main(args: Array<String>) {

	var inputCount : Int = readLine()!!.toInt()

	while(inputCount != 0) {

		val a : MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()
		val b : MutableList<Int> = readLine()!!.split(' ').map(String::toInt).toMutableList()

		println(areSimilar(a, b))

		inputCount--

	}

}
