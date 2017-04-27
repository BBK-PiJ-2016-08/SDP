package main.scala.iterator

/**
  * Created by jakeholdom on 24/04/2017.
  */
object TestIteratorPattern extends App {
  val storage = new ShapeStorage()
  storage.addShape("Polygon")
  storage.addShape("Hexagon")
  storage.addShape("Circle")
  storage.addShape("Rectangle")
  storage.addShape("Square")

  var iterator = new ShapeIterator(storage.shapes)

  while (iterator.hasNext) println(iterator.next())

  println("Apply removing while iterating...")
  iterator = new ShapeIterator(storage.shapes)

  while (iterator.hasNext) {
    println(iterator.next())
    iterator.remove()
  }
}
