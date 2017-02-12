package Films

/**
  * Created by jakeholdom on 12/02/2017.
  */
case class Director(firstName: String, lastName: String, yearOfBirth:Int) {


  def yearBorn :Int = {

    this.yearOfBirth
  }

  def name: String = {

    val fullName = this.firstName + " " + this.lastName

    fullName
  }

}

object Director{


  def older(director1 : Director, director2 : Director) : Director =
  Director match {
    case a if director1.yearBorn < director2.yearBorn => director1
    case b if director1.yearBorn > director2.yearBorn => director2
  }


}