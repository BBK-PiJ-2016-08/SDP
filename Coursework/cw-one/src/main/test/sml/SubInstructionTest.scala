import org.scalatest.FunSuite
import sml.{SubInstruction, Labels, Machine}

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jakeholdom on 27/04/2017.
  */
class SubInstructionTest extends FunSuite{

  test("[1] subInstruction should subtract numbers from the machine regs") {
    val machine:Machine = new Machine(Labels(), Vector())

    val label = "L1"
    val opCode = "out"
    machine.regs(1) = 5
    val array : ArrayBuffer[Any] = new ArrayBuffer[Any]()

    array += 3
    array += 2
    array += 1
    val subInstruction = new SubInstruction(label,opCode, array)
    subInstruction.execute(machine)

    assert(machine.regs(3) == 5)
  }


}
