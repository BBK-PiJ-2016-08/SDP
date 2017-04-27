package main.scala.decorator

/**
  * Created by jakeholdom on 25/04/2017.
  */
class SimplyVegPizza extends Pizza {
  def getDesc: String = {
    "Simply Veg Pizza"
  }

  def getPrice: Double = {
    1.00
  }
}
