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

	/**
	 * Returns the total amount of whole candy pieces that will be eaten by n children,
	 * such that each child eats the same amount of candy as the other children
	 * without splitting a candy piece given m total candies.
	 * 
	 * Problem #3
	 *
	 * @author Carlos L. Cuenca
	 * @date 07/08/2020
	 * @param int n The total amount of children
	 * @param int m The total amount of candy pieces
	 * @param int The total amount of candy that will be eaten between 
	 * the children
	 */

	fun candies(n: Int, m: Int): Int {

		return n * (m / n).toInt()

	} 

	/**
	 * Returns the amount of people behind you, and to the left given the current
	 * rows and columns in the theater and your current row and column within the 
	 * theater
	 *
	 * Problem #4
	 * 
	 * @author Carlos L. Cuenca
	 * @date 07/08/2020
	 * @param int nCols The amount of columns in the theater
	 * @param int nRows The amount of rows in the theater
	 * @param int col The current column you're residing in
	 * @param int row The current row you're residing in
	 */

	fun seatsInTheater(nCols: Int, nRows: Int, col: Int, row: Int): Int {
	    
	    return (nCols - col + 1) * (nRows - row)
	    
	}

	


}