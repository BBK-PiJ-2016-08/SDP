package main.scala.iterator

/**
  * Created by jakeholdom on 24/04/2017.
  */
class ShapeStorage {

  var shapes = new Array[Shape](5)

  private var index: Int = 0

  def addShape(name: String): Unit = {
    shapes(index) = new Shape(index, name)
    index += 1
  }

}
