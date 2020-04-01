/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

object LargestPrimeFactor extends App {

  // find prime factors
  // could use distinct but doesn't really provide us much in this use case

  def primeFactors(n: Long): List[Long] = {
    // won't bother with the semantics behind the prime factor of 1!
    val range: Seq[Long] = 2L to math.sqrt(n).toLong// no point going above square root
    val divisibleBy = range.iterator.find(n % _ == 0) // finds first divisible by

    divisibleBy match {
      case Some(divisible) => divisible :: primeFactors(n / divisible) // if divisibleBy, prepend to list
      case None => List(n) // is itself prime => only prime factor is itself (1 isn't prime)
    }
  }

  // find largest of those prime factors

  def largestPrimeFactor(n: Long): Long = primeFactors(n).max

  println(largestPrimeFactor(600851475143L)) // 6857
}
