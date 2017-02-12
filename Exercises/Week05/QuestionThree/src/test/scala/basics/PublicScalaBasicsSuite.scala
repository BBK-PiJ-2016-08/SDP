package basics

import Films.Director
import org.scalatest.FunSuite
import support.TreeTraversals

class PublicScalaBasicsSuite extends FunSuite {

  test("add new director and get name") {
    assert(new Director("John", "Doe", 1990).name == "John Doe")

  }
  test("test film is directed by director and age of director when they directed the film") {
    val newDirector = new Director("John", "Doe", 1950)
    val newFilm = new Films.Film("Jaws", 1976, 9.6, newDirector)
    assert(newFilm.isDirectedBy(newDirector))
    assert(newFilm.directorsAge == 26)
  }
  test("test film copy") {
    val newDirector = new Director("John", "Doe", 1950)
    val newFilm = new Films.Film("Jaws", 1976, 9.6, newDirector)
    val copiedFilm = newFilm.copy()
    assert(newFilm.directorsAge == copiedFilm.directorsAge)
    val copiedFilm2 = newFilm.copy(yearOfRelease2 = 1986)
    assert(copiedFilm2.directorsAge == 36)

  }
  test("test director older method") {
    val newDirector = new Director("John", "Doe", 1950)
    val newDirector2 = new Director("Pete", "Koe", 1970)
    assert(Director.older(newDirector,newDirector2) == newDirector)

  }
  test("test highest rating film") {
    val newDirector = new Director("John", "Doe", 1950)
    val newFilm = new Films.Film("Jaws", 1976, 9.6, newDirector)
    val newFilm2 = new Films.Film("Inception", 1976, 9.8, newDirector)
    assert(Films.Film.highestRating(newFilm,newFilm2) == newFilm)

  }

  test("test get older director at the time") {
    val newDirector = new Director("John", "Doe", 1950)
    val newDirector2 = new Director("John", "Doe", 1940)

    val newFilm = new Films.Film("Jaws", 1976, 9.6, newDirector)
    val newFilm2 = new Films.Film("Inception", 2005, 9.8, newDirector2)
    assert(Films.Film.oldestDirectorAtTheTime(newFilm,newFilm2) == newDirector2)

  }
}