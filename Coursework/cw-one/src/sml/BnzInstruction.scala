package sml

/**
  * Created by jakeholdom on 06/02/2017.
  */
class BnzInstruction(label: String, op: String, val register: Int, val nextLabel: String)
  extends Instruction(label, op) {

  override def execute(m: Machine) {

    if (m.regs(register) != 0) {
      m.pc = getInstructionNumber(m)
      m.execute()
    }

  }

  def getInstructionNumber(m: Machine):Int = m.labels.labels.indexOf(nextLabel)
    /*
    var count = 0

    if (m.regs(register) != 0){
      for (labels <- m.labels.labels){
        count += 1
        if (labels.equals(nextLabel)){
          m.pc = count -1
          m.execute()
        }
      }
    }
     */

  override def toString(): String = {
    super.toString + " " + register + " moves to " + nextLabel + "\n"
  }
}

object BnzInstruction {
  def apply(label: String, register: Int, nextLabel: String) =
    new BnzInstruction(label, "add", register, nextLabel)
}
