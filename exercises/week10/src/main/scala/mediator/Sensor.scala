package main.scala.mediator

/**
  * Created by jakeholdom on 24/04/2017.
  */
class Sensor {
  def checkTemperature(temp: Int): Boolean = if (temp > 0) true else false
}
