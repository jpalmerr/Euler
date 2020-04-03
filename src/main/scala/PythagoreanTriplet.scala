import scala.math.Ordering

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

object PythagoreanTriplet extends App {

  private def limit(lowerBound: Int, upperBound: Int): Int =
    (lowerBound to upperBound).find(n => n + math.sqrt(n) >= upperBound).get

  def xxx(lowerBound: Int, upperBound: Int) = {
    val x =
    for (b <- 2 until limit(lowerBound, upperBound); a <- 1 until b; c = upperBound - a - b
    if a * a + b * b == c * c) yield a * b * c

    x.distinct.head
  }

  println(xxx(0, 1000 ))
}
