package main.scala.visitor

trait Element {
  def accept(visitor: Visitor): Unit
}
