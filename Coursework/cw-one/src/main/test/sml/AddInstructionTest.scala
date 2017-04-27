package sml

import org.scalatest.FunSuite
import sml.Machine
import sml.AddInstruction

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jakeholdom on 01/03/2017.
  */
class AddInstructionTest extends FunSuite {



  test("[1] addInstruction should add numbers from the machine regs") {
    val machine:Machine = new Machine(Labels(), Vector())

    val label = "L1"
    val opCode = "add"
    machine.regs(1) = 5
    machine.regs(2) = 10
    val array : ArrayBuffer[Any] = new ArrayBuffer[Any]()

    array += 3
    array += 2
    array += 1
    val addInstruction = new AddInstruction(label,opCode, array)
    addInstruction.execute(machine)

    assert(machine.regs(3) == 15)
  }


}
