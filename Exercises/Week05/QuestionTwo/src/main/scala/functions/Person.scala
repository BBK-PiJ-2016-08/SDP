package functions

/**
  * Created by jakeholdom on 11/02/2017.
  */

abstract case class Person private[Person] (name : String) {

  def getFirstName: String = {

    val parts = name.split(" ")

    parts(0)
  }

}


object Person {



  def apply(name : String): Person = new Person(name) {


  }


}
