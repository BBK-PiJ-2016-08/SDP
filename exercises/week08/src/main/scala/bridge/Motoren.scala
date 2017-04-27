package main.scala.bridge

/**
  * Created by jakeholdom on 21/04/2017.
  */
case class Motoren(product: Product, s: String) extends Car(product, s) {
  override def assemble: Unit = {

    println("Modifying product " + product.productName + " according to " + s)

    println("Assembling " + product.productName + " for " + s)
  }

  override def produceProduct: Unit = product.produce

  override def printDetails: Unit = println("Car: " + s + ", Product:" + product.productName)
}