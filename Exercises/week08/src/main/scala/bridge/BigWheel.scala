package main.scala.bridge

/**
  * Created by jakeholdom on 21/04/2017.
  */
case class BigWheel(product: Product, s: String) extends Car(product, s) {
  override def assemble: Unit = ???

  override def produceProduct: Unit = ???

  override def printDetails: Unit = ???
}
