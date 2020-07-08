class IntroGates {

	/**
	 * Returns the sum of the given number's digits
	 *
	 * Problem #1
	 *
	 * @author: Carlos L. Cuenca
	 * @date 05/19/2020
	 * @param n int The number to sum the digits
	 * @return int the sum of the number n's digits
	 */

	fun addTwoDigits(n: Int): Int {

		return (n % 10) + (n / 10)

	}

	/**
	 * Returns the largest base 10 number given the amount of digits, n
	 *
	 * Problem #2
	 *
	 * @author Carlos L. Cuenca
	 * @date 07/08/2020
	 * @param n int the amount of digits the number should have
	 * @return int The largest resulting number with n digits
	 */

	fun largestNumber(n: Int): Int {

		return Math.pow(10.0, n.toDouble()).toInt() - 1

	}




}