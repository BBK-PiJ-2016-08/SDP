package factory

import bc.{ByteCodeFactory, ByteCodeParser}
// import sun.tools.asm.Instruction / Optimized import just to make the sbt test pass
import vendor.{ProgramParser, ProgramParserImpl}
import vm.{VirtualMachine, VirtualMachineParser}
import factory.ByteCodeParserImpl

/**
  * The `VirtualMachineFactory` follows the *factory pattern*. It provides
  * methods for each of the important parts in this assignment. You must
  * implement each method such that it returns an object of the correct type.
  */
object VirtualMachineFactory {

  def byteCodeFactory: ByteCodeFactory = new ByteCodeFactoryImpl //return new instance

  def vendorParser: ProgramParser = new ProgramParserImpl //return new instance


  def byteCodeParser: ByteCodeParser = new ByteCodeParserImpl

  // TODO
  def virtualMachineParser: VirtualMachineParser = ???

  // TODO
  def virtualMachine: VirtualMachine = ???
}