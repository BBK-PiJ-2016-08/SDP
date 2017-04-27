package two
import org.scalatest.FunSuite

/**
  * Created by jakeholdom on 26/04/2017.
  */

class PersonTest extends FunSuite {


  test("[1] Person should split names") {

    val person = two.Person
    person.apply("test testy")

    assert(person.firstName == "test")
    assert(person.lastName == "testy")

  }
}
