package main.scala.decorator

/**
  * Created by jakeholdom on 25/04/2017.
  */
class GreenOlives(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    "Green Olives"
  }

  def getPrice: Double = {
    0.50
  }
}
