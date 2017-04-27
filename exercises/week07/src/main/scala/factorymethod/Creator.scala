package main.scala.factorymethod

/**
  * Created by jakeholdom on 24/04/2017.
  */
trait Creator {

  def createProduct(x : Any):Product
}
