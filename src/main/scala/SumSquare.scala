/*
The sum of the squares of the first ten natural numbers is,
12+22+...+102=385

The square of the sum of the first ten natural numbers is,
(1+2+...+10)2=552=3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

object SumSquare extends App {

  def difference(lowerBound: Int = 1, upperBound: Int): Int = {
    squareOfSum(lowerBound, upperBound) - sumOfSquared(lowerBound, upperBound)
  }

  def squareOfSum(lowerBound: Int, upperBound: Int): Int =
    square((lowerBound to upperBound).sum)

  def sumOfSquared(lowerBound: Int, upperBound: Int): Int = {
    (lowerBound to upperBound).map(square).sum
  }

  private def square(n: Int): Int = n * n

  println(s"We get correct solution for first 10 natural numbers (2640): ${difference(upperBound = 10) == 2640}")
  println(difference(upperBound = 100)) // 25164150

}
