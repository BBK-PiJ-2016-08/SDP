package factory

import bc.{ByteCode, ByteCodeParser, ByteCodeValues}
/**
  * Created by jakeholdom on 17/03/2017.
  */
class ByteCodeParserImpl extends ByteCodeParser{

  var byteCodeFactory :ByteCodeFactoryImpl = new ByteCodeFactoryImpl
  /**
    * Parses a vector of `Byte` into a vector of `ByteCode`.
    *
    * You should use [[ByteCodeValues.bytecode]] to help translate
    * the individual `Byte`s into a corresponding [[ByteCode]].
    *
    * @param bc a vector of bytes representing bytecodes
    * @return a vector of `ByteCode` objects
    */
  override def parse(bc: Vector[Byte]): Vector[ByteCode] = {

    var byteCodeVector : Vector[ByteCode] = Vector[ByteCode]()

    var isIconst = false
    var iConstByte = bc.head
    for (byte <- bc){

      if (byte == bytecode("iconst") || isIconst){
        if(!isIconst){
          iConstByte = byte
          isIconst = true
        }else{
          byteCodeVector = byteCodeVector :+ byteCodeFactory.make(iConstByte, byte)
          isIconst = false
        }
      }else{
        byteCodeVector = byteCodeVector :+ byteCodeFactory.make(byte)

      }

    }
    byteCodeVector
  }
}
