import org.scalatest.FunSuite
import sml.{Labels, Machine, MulInstruction}

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jakeholdom on 27/04/2017.
  */
class MulInstructionTest extends FunSuite{

  test("[1] mulInstruction should multiply numbers from the machine regs") {
    val machine:Machine = new Machine(Labels(), Vector())

    val label = "L1"
    val opCode = "mul"
    machine.regs(1) = 5
    machine.regs(2) = 10
    val array : ArrayBuffer[Any] = new ArrayBuffer[Any]()

    array += 3
    array += 2
    array += 1
    val mulInstruction = new MulInstruction(label,opCode, array)
    mulInstruction.execute(machine)

    assert(machine.regs(3) == 50)
  }

}
