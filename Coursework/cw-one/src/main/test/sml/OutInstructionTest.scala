import org.scalatest.FunSuite
import sml.{Labels, Machine, OutInstruction}

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jakeholdom on 27/04/2017.
  */
class OutInstructionTest extends FunSuite{
  test("[1] outInstruction should display the number from the machine regs") {
    val machine:Machine = new Machine(Labels(), Vector())

    val label = "L1"
    val opCode = "out"
    machine.regs(1) = 5
    val array : ArrayBuffer[Any] = new ArrayBuffer[Any]()

    array += 1
    val outInstruction = new OutInstruction(label,opCode, array)
    outInstruction.execute(machine)

    assert(machine.regs(1) == 5)
  }

}
