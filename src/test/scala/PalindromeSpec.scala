import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class PalindromeSpec extends AnyWordSpec with Matchers {

  "largestPalindrome" should {
    "return largest palindrome" in {
      Palindrome.largestPalindrome(10, 99) should equal(9009)
    }
  }

}
