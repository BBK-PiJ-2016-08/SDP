package main.scala.decorator

/**
  * Created by jakeholdom on 25/04/2017.
  */
class RomaTomatoes(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    "Roma Tomatoes"
  }

  def getPrice: Double = {
    0.50
  }
}
