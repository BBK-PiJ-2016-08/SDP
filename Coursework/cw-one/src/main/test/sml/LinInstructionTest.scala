import org.scalatest.FunSuite
import sml.{LinInstruction, Labels, Machine}

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jakeholdom on 27/04/2017.
  */
class LinInstructionTest extends FunSuite{

  test("[1] linInstruction should place number onto the machine regs") {
    val machine:Machine = new Machine(Labels(), Vector())

    val label = "L1"
    val opCode = "lin"
    val array : ArrayBuffer[Any] = new ArrayBuffer[Any]()

    array += 2
    array += 1
    val linInstruction = new LinInstruction(label,opCode, array)
    linInstruction.execute(machine)

    assert(machine.regs(2) == 1)
  }

}
