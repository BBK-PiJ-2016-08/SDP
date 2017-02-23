package sml

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jakeholdom on 06/02/2017.
  */
class BnzInstruction(label: String, op: String, array: ArrayBuffer[Any])
  extends Instruction(label, op) {

  override def execute(m: Machine) {

    if (m.regs(array(0).toString.toInt) != 0) {
      m.pc = m.labels.labels.indexOf(array(1).toString)
      m.execute()
    }

  }


  override def toString(): String = {
    super.toString + " " + array(0).toString.toInt + " moves to " + array(1).toString + "\n"
  }
}

object BnzInstruction {
  def apply(label: String,array: ArrayBuffer[Any]) =
    new BnzInstruction(label, "add", array)
}
