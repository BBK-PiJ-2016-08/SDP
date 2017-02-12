package Films

/**
  * Created by jakeholdom on 12/02/2017.
  */
class Film(name: String, yearOfRelease: Int, imdbRating: Double, director: Director) {



  def directorsAge: Int = {

    yearOfRelease - this.director.yearBorn
  }

  def isDirectedBy(directedBy: Director): Boolean = directedBy match {
    case a if a.equals(this.director) => true
    case _ => false
  }
  def getDirector : Director = {

    this.director
  }
  def getImdbRating:Double = {

    this.imdbRating
  }

  def copy(name2: String = this.name, yearOfRelease2: Int = this.yearOfRelease,
           imdbRating2: Double = this.imdbRating, director2: Director = this.director): Film = {
    val copyFilm: Film = new Film(name2, yearOfRelease2, imdbRating2, director2)
    copyFilm

  }

}

object Film{

  def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director): Film =
    new Film(name, yearOfRelease, imdbRating, director)

  def highestRating(film1 : Film, film2 : Film) : Film =
    Film match {
      case a if film1.getImdbRating < film2.getImdbRating => film1
      case b if film1.getImdbRating > film2.getImdbRating => film2
    }

  def oldestDirectorAtTheTime(film1 : Film, film2 : Film) : Director = {
    Film match {
      case a if film1.directorsAge > film2.directorsAge => film1.getDirector
      case b if film1.directorsAge < film2.directorsAge => film2.getDirector

    }


  }
}