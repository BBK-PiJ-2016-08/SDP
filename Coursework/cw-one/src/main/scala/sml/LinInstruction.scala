package sml

import scala.collection.mutable.ArrayBuffer

case class LinInstruction(label: String, opcode: String, array: ArrayBuffer[Any]) extends Instruction(label, opcode) {

  override def execute(m: Machine) =
    m.regs(array(0).toString.toInt) = array(1).toString.toInt

  override def toString(): String = {
    super.toString + " register " + array(0).toString.toInt + " value is " + array(1).toString.toInt + "\n"
  }
}

object LinInstruction {
  def apply(label: String, array: ArrayBuffer[Any]) =
    new LinInstruction(label, "lin", array)
}