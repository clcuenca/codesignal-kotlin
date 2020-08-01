
class LoopTunnel {

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
		var result = 1

		while (result < n) {

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

		while (index <= r) {

			if (index <= (n - index) && (n - index) <= r) count++

			index++

		}

		return count;

	}

	/**
	 * Calculates the amount of money given by the magical well
	 * when casting a marble
	 *
	 * Problem #27
	 *
	 * @author Carlos L. Cuenca
	 * @date 07/05/2020
	 */

	fun magicalWell(a: Int, b: Int, n: Int): Int {

		if (n == 0) return 0

		return a * b + magicalWell(a + 1, b + 1, n - 1)

	}

}
