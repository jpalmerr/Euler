import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class SmallestMultipleSpec extends AnyWordSpec with Matchers {

  "smallestMultiple" should {
    "return smallest multiple that is divisible by all between 1 and n" in {
      SmallestMultiple.smallestMultiple(10) should equal(2520)
      SmallestMultiple.smallestMultiple(3) should equal(6)
      SmallestMultiple.smallestMultiple(4) should equal (12)
      SmallestMultiple.smallestMultiple(1) should equal (1)
    }
  }
}
