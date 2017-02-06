package sml

/**
  * Created by jakeholdom on 06/02/2017.
  */
class OutInstruction(label: String, op: String, val result: Int, val register: Int)
  extends Instruction(label, op) {

  override def execute(m: Machine) {
    m.regs(result) = m.regs(register)
  }

  override def toString(): String = {
    super.toString + " " + result
  }
}

object OutInstruction {
  def apply(label: String, result: Int, register: Int) =
    new OutInstruction(label, "out", result, register)
}