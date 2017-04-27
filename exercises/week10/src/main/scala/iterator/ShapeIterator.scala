package main.scala.iterator

import java.util.Iterator

/**
  * Created by jakeholdom on 24/04/2017.
  */

class ShapeIterator(private var shapes: Array[Shape]) extends Iterator[Shape] {

  var index = 0

  override def hasNext(): Boolean = {
    if (index < shapes.length) {
      true
    } else {
      false
    }
  }

  override def next(): Shape = {
    if (hasNext()) {
      index = index + 1
      shapes(index-1)
    } else {
      null
    }

  }

  override def remove(): Unit = {
    if (hasNext()){

      shapes(index) = null
      shapes = shapes.filter(shape => shape != null)

    }

  }
}