package sml

import scala.collection.mutable.ArrayBuffer

class AddInstruction(label: String, op: String, array: ArrayBuffer[Any])
  extends Instruction(label, op) {

  override def execute(m: Machine) {
    val value1 = m.regs(array(1).toString.toInt)
    val value2 = m.regs(array(2).toString.toInt)
    m.regs(array(0).toString.toInt) = value1 + value2
  }

  override def toString(): String = {
    super.toString + " " + array(1).toString.toInt + " + " + array(2).toString.toInt + " to " + array(0).toString.toInt + "\n"
  }
}

object AddInstruction {
  def apply(label: String, array: ArrayBuffer[Any]) =
    new AddInstruction(label, "add", array)
}