
class AtTheCrossroads {

    /**
     * Given experience, threshold, & reward, returns a boolean value indicating
     * if the player will reach the next level
     *
     * Problem #9
     *
     * @param experience The current amount of experience
     * @param threshold The threshold to level up
     * @param reward The current rewarded experience
     * @return boolean denoting if a player has reached the next level
     */
    fun reachNextLevel(experience: Int, threshold: Int, reward: Int): Boolean {

        return (experience + reward) >= threshold

    }

    /**
     * Given two weights, their values, and a maximum weight this returns the maximum value
     * of what can be carried.
     *
     * Problem #10
     *
     * @param value1 The value of the first stone
     * @param weight1 The weight of the first stone
     * @param value2 The value of the second stone
     * @param weight2 The weight of the second stone
     * @param maxW The maximum weight that can be carried
     * @return int denoting the maximum value from the stones that can be carried
     */
    fun knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {

        if((weight1 + weight2) <= maxW) {

            return value1 + value2

        }

        // If either exceeds the max, you can't carry either of them
        if((weight1 > maxW) && (weight2 > maxW)) {

            return 0

        }

        // We make a deduction based on value
        if(value1 >= value2 || weight2 > maxW) {

            return value1

        }

        return value2

    }

    /**
     * Given three numbers, find the one number that is not the same as the other two
     *
     * Problem #11
     *
     * @param a The first number
     * @param b The second number
     * @param c The third number
     * @return Number that does not match the other two
     */
    fun extraNumber(a: Int, b: Int, c: Int): Int {

        return a xor b xor c

    }

    /**
     * Given two numbers, returns a boolean indicating if the pseudocode terminates
     * (runs infinitely)
     *
     * Problem #12
     *
     * @param a The first number
     * @param b The second number
     * @return boolean value indicating if the process runs infinitely
     */
    fun isInfiniteProcess(a: Int, b: Int): Boolean {

        return (a > b) ||  ((a - b) % 2 != 0)

    }

    /**
     * Given a, b, & c this function returns a boolean indicating if any of the
     * arithmetic expressions are true. (a + b = c, a - b = c, a * b = c, a / b = c)
     *
     * Problem #13
     *
     * @param a The first term
     * @param b The second term
     * @param c The resulting term
     * @return boolean indicating if the terms equal
     */
    fun arithmeticExpression(a: Int, b: Int, c: Int): Boolean {

        return (a + b == c) || (a - b == c) || (a * b ==c) || ((a / b == c) && (a % b == 0))

    }

    /**
     * Given two scores (score1 & score2) this function returns a boolean value indicating
     * if a tennis set can be completed
     *
     * Problem #14
     *
     * @param score1 The first player's score
     * @param score2 The second player's score
     * @return boolean value indicating a completable
     */
    fun tennisSet(score1: Int, score2: Int): Boolean {

        if((score1 + score2) >= 6) {

            if((score1 == 6) && score2 < 5) {

                return true

            }

            if((score2 == 6) && score1 < 5) {

                return true

            }

        }

        if((score1 + score2) >= 12) {

            if((score1 == 7) && ((score2 == 5) || (score2 == 6))) {

                return true

            }

            if((score2 == 7) && ((score1 == 5) || (score1 == 6))){

                return true

            }

        }

        return false

    }

    /**
     * Returns a boolean value that shatters expectations
     *
     * Problem #15
     *
     * @param young Young
     * @param beautiful Beautiful
     * @param loved Loved
     * @return Truth shattering boolean value
     */
    fun willYou(young: Boolean, beautiful: Boolean, loved: Boolean): Boolean {

        return (young and beautiful and !loved) xor (loved and !(young and beautiful))

    }

    /**
     * Given The last number of days, this method returns the possible number of days
     * the metro card will refill by.
     *
     * Problem #16
     *
     * @param lastNumberOfDays The last number of days the card was filled
     * @return int[] array containing the possible refill
     */
    fun metroCard(lastNumberOfDays: Int): MutableList<Int> {

        val returnArray = mutableListOf<Int>()

        if(lastNumberOfDays == 31) {

            returnArray.addAll(listOf(28,30,31))

        } else {

            returnArray.addAll(listOf(31))

        }

        return returnArray

    }

}