package main.scala.interpreter

/**
  * Created by jakeholdom on 23/04/2017.
  */
trait Expression {
  def interpret(): Int
}