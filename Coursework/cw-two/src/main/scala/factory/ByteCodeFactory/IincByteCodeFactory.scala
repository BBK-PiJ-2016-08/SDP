package factory.ByteCodeFactory

import bc.{ByteCode, ByteCodeFactory, InvalidBytecodeException, ByteCodeValues}

/**
  * Created by jakeholdom on 17/03/2017.
  */
class IincByteCodeFactory extends ByteCodeFactory{
  /**
    * Returns a [[ByteCode]].
    *
    * This method creates a new [[ByteCode]] object given the `byte`
    * that corresponds to the bytecode (see [[ByteCodeValues]]. If
    * the bytecode requires arguments then an optional integer
    * argument is provided.
    *
    * This method should throw an [[InvalidBytecodeException]] if the
    * given bytecode value is unknown.
    *
    * @param byte the byte code of a bytecode
    * @param args an optional integer argument (depends on bytecode)
    * @return a new bytecode object
    */
  // TODO
  override def make(byte: Byte, args: Int*): ByteCode = ???
}
