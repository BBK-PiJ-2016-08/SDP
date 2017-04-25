package main.scala.decorator

/**
  * Created by jakeholdom on 25/04/2017.
  */
class SimplyNonVegPizza extends Pizza {
  def getDesc: String = {
    "Simply Non Veg Pizza"
  }

  def getPrice: Double = {
    1.00
  }
}