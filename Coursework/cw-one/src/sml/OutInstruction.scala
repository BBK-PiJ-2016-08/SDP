package sml

/**
  * Created by jakeholdom on 06/02/2017.
  */
class OutInstruction(label: String, op: String, var register: Int)
  extends Instruction(label, op) {

  override def execute(m: Machine) {
    var result = m.regs(register)
    println("Register " + register + " = " + result)
  }

  override def toString(): String = {
    super.toString + " output register " + register + "\n"
  }
}

object OutInstruction {
  def apply(label: String, register: Int) =
    new OutInstruction(label, "out", register)
}