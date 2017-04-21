package sml

import org.scalatest.FunSuite
import sml.Machine
import sml.AddInstruction

/**
  * Created by jakeholdom on 01/03/2017.
  */
class AddInstructionTest extends FunSuite {

  val add = new AddInstruction()
  val machine = new Machine(Labels)

  test("[1] make method should create correct bytecode instance") {

    val iconst = bcf.make(bytecode("iconst"), 4)
    assert(iconst.code == bytecode("iconst"))
    assert(iconst.isInstanceOf[IconstByteCode])


    val iadd = bcf.make(bytecode("iadd"))
    assert(iadd.code == bytecode("iadd"))
    assert(iadd.isInstanceOf[IaddByteCode])


    val iswap = bcf.make(bytecode("iswap"))
    assert(iswap.code == bytecode("iswap"))
    assert(iswap.isInstanceOf[IswapByteCode])




  }


}
