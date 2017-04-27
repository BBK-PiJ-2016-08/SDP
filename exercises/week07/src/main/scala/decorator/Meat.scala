package main.scala.decorator

/**
  * Created by jakeholdom on 25/04/2017.
  */
class Meat(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    "Meat"
  }

  def getPrice: Double = {
    1.00
  }
}
