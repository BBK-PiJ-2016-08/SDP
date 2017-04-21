package main.scala.builder

/**
  * Created by jakeholdom on 07/03/2017.
  */
object TestBuilderPattern {
  def main(args: Array[String]) {
    var carBuilder: CarBuilder = SedanCarBuilder
    var director: CarDirector = CarDirector(carBuilder)
    director.build
    println(carBuilder.getCar)
    carBuilder = SportsCarBuilder
    director = CarDirector(carBuilder)
    director.build
    println(carBuilder.getCar)
  }
}
