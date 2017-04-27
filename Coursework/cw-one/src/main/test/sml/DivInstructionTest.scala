import org.scalatest.FunSuite
import sml.{DivInstruction, Labels, Machine}

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jakeholdom on 27/04/2017.
  */
class DivInstructionTest extends FunSuite{
  test("[1] divInstruction should divide numbers from the machine regs") {
    val machine:Machine = new Machine(Labels(), Vector())

    val label = "L1"
    val opCode = "div"
    machine.regs(1) = 5
    machine.regs(2) = 10
    val array : ArrayBuffer[Any] = new ArrayBuffer[Any]()

    array += 3
    array += 2
    array += 1
    val divInstruction = new DivInstruction(label,opCode, array)
    divInstruction.execute(machine)

    assert(machine.regs(3) == 2)
  }

}
