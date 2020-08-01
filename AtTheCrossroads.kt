
class AtTheCrossroads {

    fun reachNextLevel(experience: Int, threshold: Int, reward: Int): Boolean {

        return (experience + reward) >= threshold

    }

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

    fun extraNumber(a: Int, b: Int, c: Int): Int {

        return a xor b xor c

    }

    fun isInfiniteProcess(a: Int, b: Int): Boolean {

        return (a > b) ||  ((a - b) % 2 != 0)

    }

    fun arithmeticExpression(a: Int, b: Int, c: Int): Boolean {

        return (a + b == c) || (a - b == c) || (a * b ==c) || ((a / b == c) && (a % b == 0))

    }

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

    fun willYou(young: Boolean, beautiful: Boolean, loved: Boolean): Boolean {

        return (young and beautiful and !loved) xor (loved and !(young and beautiful))

    }

    

}