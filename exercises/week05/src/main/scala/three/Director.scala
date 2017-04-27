package three

/**
  * Created by jakeholdom on 27/04/2017.
  */
class Director(firstName: String, lastName:String, yearOfBirthCon:Int) {

  val yearOfBirth:Int = yearOfBirthCon

  def name: String ={

    val name = firstName + " " + lastName

    name
  }

}

object Director{

  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director =
    new Director(firstName, lastName, yearOfBirth)



  def older(director: Director, director2: Director): Director ={

    if(director.yearOfBirth > director2.yearOfBirth){

      director
    }else{
      director2
    }


  }
}