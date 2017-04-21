package main.scala.bridge

/**
  * Created by jakeholdom on 21/04/2017.
  */
case class CentralLocking(s: String) extends Product {
  override def productName: String = s

  override def produce: Unit = println("Producing " + s)
}
