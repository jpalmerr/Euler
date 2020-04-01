/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

object SmallestMultiple extends App {

    def smallestMultiple(x: Int): Int = {
      val range = Range(x, Int.MaxValue)
      range.find(n => Range(2, x + 1).forall(n % _ == 0)).get // ok to get as always returns a result
    }

    println(smallestMultiple(20)) // 232792560
}
