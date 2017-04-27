package main.scala.bridge

/**
  * Created by jakeholdom on 21/04/2017.
  */
abstract class Car(product: Product, carType: String) {

  def assemble

  def produceProduct

  def printDetails
}