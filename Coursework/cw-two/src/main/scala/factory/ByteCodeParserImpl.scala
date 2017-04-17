package factory

import bc.{ByteCode, ByteCodeParser, ByteCodeValues}
/**
  * Created by jakeholdom on 17/03/2017.
  */
class ByteCodeParserImpl extends ByteCodeParser{
  /**
    * Parses a vector of `Byte` into a vector of `ByteCode`.
    *
    * You should use [[ByteCodeValues.bytecode]] to help translate
    * the individual `Byte`s into a corresponding [[ByteCode]].
    *
    * @param bc a vector of bytes representing bytecodes
    * @return a vector of `ByteCode` objects
    */
  override def parse(bc: Vector[Byte]): Vector[ByteCode] = ???
}
