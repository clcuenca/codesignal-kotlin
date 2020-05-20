
/**
 * Finds the smallest factorial result relative to the given integer n
 *
 * Problem #25
 *
 * @author Carlos L. Cuenca
 * @date 05/19/2020
 */

fun leastFactorial(n: Int): Int {

	var factorial = 1
	var result    = 1

	while(result < n) {

		factorial++
		result *= factorial

	}

	return result

}

/**
 * Returns the amount of ways to sum the integer n
 *
 * Problem #26
 *
 * @author Carlos L. Cuenca
 * @date 05/19/2020
 */

fun countSumOfTwoRepresentations2(n: Int, l: Int, r: Int): Int {

    var count = 0
    var index = l

    while(index <= r) {

    	if(index <= (n - index) && (n - index) <= r) count++

    	index++

    }
    
    return count;

}