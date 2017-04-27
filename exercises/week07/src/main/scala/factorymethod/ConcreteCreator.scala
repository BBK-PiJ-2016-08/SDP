package main.scala.factorymethod

/**
  * Created by jakeholdom on 24/04/2017.
  */
class ConcreteCreator extends Creator{
  override def createProduct(x: Any): Product = {

    new ConcreteProduct(x)

  }
}
