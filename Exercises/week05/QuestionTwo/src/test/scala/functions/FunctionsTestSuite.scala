package functions

import org.scalatest.FunSuite

class FunctionsTestSuite extends FunSuite {
  // Basics
  test("Get first name for new person") {
    assert(Person.apply("John doo").getFirstName() == "John")

  }

}
