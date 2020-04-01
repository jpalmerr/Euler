/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

object Palindrome extends App {

  def largestPalindrome(lowerBound: Int, upperBound: Int): Int = {
    (lowerBound to upperBound).flatMap { i => // set range
      (i to upperBound).map(_ * i) // multiply each number in range
        .filter(predicate) // apply predicate
    }.max
  }

  def predicate(n: Int): Boolean = n.toString == n.toString.reverse


  println(largestPalindrome(100, 999)) // 906609

}
