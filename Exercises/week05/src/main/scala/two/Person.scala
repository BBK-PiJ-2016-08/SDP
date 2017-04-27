package two

/**
  * Created by jakeholdom on 26/04/2017.
  */
object Person {

  var firstName = ""
  var lastName = ""
  def apply(name :String): Unit = {

    val names = name.split(" ")
    firstName = names(0)
    lastName = names(1)

  }

}

case class Person(name : String) {

  def apply(name: String): Person =
    new Person(name)

}
