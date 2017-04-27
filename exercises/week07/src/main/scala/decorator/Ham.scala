package main.scala.decorator

/**
  * Created by jakeholdom on 25/04/2017.
  */
class Ham(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    "Ham"
  }

  def getPrice: Double = {
    1.00
  }
}
