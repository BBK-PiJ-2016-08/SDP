package main.scala.interpreter

import java.security.InvalidParameterException

/**
  * Created by jakeholdom on 23/04/2017.
  */
object ExpressionUtils {

  def isOperator(s: String): Boolean = s match {
    case "+" => true
    case "*" => true
    case "-" => true
    case _ => false

  }

  def getOperator(s: String, left: Expression, right: Expression): Expression = s match {

    case "+" => new Add(left,right)
    case "*" => new Product(left,right)
    case "-" => new Number(left.interpret() - right.interpret())
    case _ => throw new InvalidParameterException()


  }
}
