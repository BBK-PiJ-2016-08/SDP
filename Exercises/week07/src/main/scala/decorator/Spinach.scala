package main.scala.decorator

/**
  * Created by jakeholdom on 25/04/2017.
  */
class Spinach(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    "Spinach"
  }

  def getPrice: Double = {
    0.50
  }
}
