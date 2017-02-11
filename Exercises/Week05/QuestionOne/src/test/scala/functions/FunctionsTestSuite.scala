package functions

import functions.Counter
import org.scalatest.FunSuite

class FunctionsTestSuite extends FunSuite {
  test("increment and decrement methods return integer with correct value") {
    assert(Counter(10).inc().inc().inc().dec().count.getNumber == 12)
  }
  test("increment and decrement methods with parameters") {
    assert(Counter().inc(5).inc(5).inc(2).dec(4).count.getNumber == 8)
  }


}
