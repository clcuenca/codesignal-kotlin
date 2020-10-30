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

	/**
	 * Returns a largest integer n such that n is divisible by divisor
	 * and less than or equal to the bound. The function will subtract the remainder
	 * of bound divided by the divisor from the bound to reach the largest n
	 *
	 * Problem #5
	 *
	 * @author Carlos L. Cuenca
	 * @date 07/08/2020
	 * @param int divisor The multiple of n
	 * @param int bound The highest n  can reach
	 */

	fun maxMultiple(divisor: Int, bound: Int): Int {

		return bound - (bound % divisor).toInt()

	}

	/**
	 * Given the amount of numbers in a circle, n, and the firstNumber
	 * this function will return the radially opposite number from firstNumber
	 * within the given range of numbers.
	 * Since there are some radially opposite numbers that are less than 
	 * the given firstNumber this function takes into account wrap-around
	 *
	 * Problem #6
	 *
	 * @author Carlos L. Cuenca
	 * @date 7/08/2020
	 * @param int n The amount of numbers in the circle
	 * @param int firstNumber The number that is the point of reference
	 * @return int The radially opposite number from firstNumber
	 */

	fun circleOfNumbers(n: Int, firstNumber: Int): Int  {

		return (firstNumber + (n / 2).toInt()) % n

	}

	/**
	 * Given n minutes, returns the sum of the digits displayed as the time after
	 * 00:00
	 * 
	 * Problem #7
	 *
	 * @author: Carlos L. Cuenca
	 * @since: 07/08/2020
	 * @param int n The amount of minutes elapsed after 00:00
	 * @return int the sum of the digits of n minutes ater 00:00
	 */

	fun lateRide(n: Int): Int {

			return (n/60/10) + (n/60%10) + (n%60/10) + (n%60%10)

	}

	/**
	 * Given the minute rates min1, min2_10, & min11. This function will return 
	 * the amount of minutes available from the given cents and the applicable 
	 * rates.
	 *
	 * Problem #8
	 *
	 * @author: Carlos L. Cuenca
	 * @since: 07/08/2020
	 * @param int min1 The cost of the first minute
	 * @param int min2_10 The cost of the second to 10th minute
	 * @param int min11 The cost of the 11th and above minute
	 * @param int s The amount of available cents
	 * @return int The amount of minutes given cents, s
	 */

	fun phoneCall(min1: Int, min2_10: Int, min11: Int, s: Int): Int {
    
	    if((s - min1) < 0) return 0
	    
	    if((s - min1 - 9*min2_10) < 0) {
	        
	        return (s - min1) / min2_10 + 1
	        
	    }
	    
	    return (s - min1 - 9*min2_10) / min11 + 10
	    
	}



}