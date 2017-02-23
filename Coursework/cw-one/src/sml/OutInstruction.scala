package sml

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jakeholdom on 06/02/2017.
  */
class OutInstruction(label: String, op: String, array: ArrayBuffer[Any])
  extends Instruction(label, op) {

  override def execute(m: Machine) {
    var result = m.regs(array(0).toString.toInt)
    println("Register " + array(0).toString.toInt + " = " + result)
  }

  override def toString(): String = {
    super.toString + " output register " + array(0).toString.toInt + "\n"
  }
}

object OutInstruction {
  def apply(label: String, array: ArrayBuffer[Any]) =
    new OutInstruction(label, "out", array)
}