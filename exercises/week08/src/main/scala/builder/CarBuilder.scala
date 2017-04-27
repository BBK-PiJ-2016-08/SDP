package main.scala.builder

/**
  * Created by jakeholdom on 07/03/2017.
  */
abstract class CarBuilder extends Car(""){
  def getCar: Car
  def buildBodyStyle()



  def buildPower()


  def buildEngine()


  def buildBreaks()


  def buildSeats()

  def buildWindows()


  def buildFuelType()
}
