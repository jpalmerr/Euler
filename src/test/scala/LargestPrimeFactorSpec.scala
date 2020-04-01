import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class LargestPrimeFactorSpec extends AnyWordSpec with Matchers {

  "primeFactors" should {
    "return list of all prime factors" in {
      LargestPrimeFactor.primeFactors(13195) should equal(List(5, 7, 13, 29))
    }
  }

  "largestPrimeFactors" should {
    "return the largest prime factor" in {
      LargestPrimeFactor.largestPrimeFactor(13195) should equal(29)
    }
  }
}
