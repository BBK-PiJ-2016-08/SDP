package three

/**
  * Created by jakeholdom on 27/04/2017.
  */
class Film(name:String, yearOfRelease: Int, imdbRating: Double, directorCon: Director) {

  val director:Director = directorCon

  def getDirectorsAge: Int ={

    director.yearOfBirth - yearOfRelease

  }

  def getDirector: Director ={
  this.director

  }

  def isDirectedBy(director: Director): Boolean ={

    if(director.equals(this.director)){
      true

    }else{

      false
    }

  }

  def getImdbRating: Double ={

    this.imdbRating

  }
  def copy(name:String = "name", yearOfRelease: Int = 0, imdbRating: Double = 0,
           director: Director = new Director("a", "a", 0)): Film ={

     new Film(name, yearOfRelease,imdbRating,director)

  }

}

object Film{


  def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director): Film =
    new Film(name, yearOfRelease, imdbRating, director)

  def highestRating(film: Film, film2: Film): Double ={

    if(film.getImdbRating > film2.getImdbRating){

      film.getImdbRating
    }else{
      film2.getImdbRating

    }

  }

  def oldestDirectorAtTheTime(film: Film, film2: Film): Director ={

    if(film.getDirectorsAge > film2.getDirectorsAge){
      film.getDirector

    }else{
      film2.getDirector

    }
  }


}
