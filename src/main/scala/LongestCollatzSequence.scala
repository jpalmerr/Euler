/*
n → n/2 (n is even)
n → 3n + 1 (n is odd)

is thought all starting numbers end at 1

Which starting number, under one million, produces the longest chain?
 */

object LongestCollatzSequence extends App {

  def iterate(n: Int, iterations: Int = 0): Int = {
    n match {
      case 1 => iterations + 1
      case _ if n % 2 == 0 => iterate(n / 2, iterations + 1)
      case _ => iterate((3 * n) + 1, iterations + 1)
    }
  }

  println(iterate(13)) // 10

  // use view for lazyness
  def longestChain(highestStartingPoint: Int) = (1 until highestStartingPoint).view.map { n =>
    (n, iterate(n))
  }.reduceLeft((a, b) => if (a._2 > b._2) a else b)

  val run = longestChain(1000)

  println(s"biggest Starting point ${longestChain(1000)._1}")
  println(s"longestChain ${longestChain(1000)._2}")
}
