package main.scala.decorator

/**
  * Created by jakeholdom on 25/04/2017.
  */
class Cheese(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    "Cheese"
  }

  def getPrice: Double = {
    0.50
  }
}
