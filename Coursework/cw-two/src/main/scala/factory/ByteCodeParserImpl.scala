package factory
import bc.{ByteCode, ByteCodeValues}

/**
  * Created by Eric on 18/04/2017.
  */
class ByteCodeParserImpl extends bc.ByteCodeParser with bc.ByteCodeValues {

  trait ByteCodeParser extends ByteCodeValues {
    /**
      * This method parses a vector of 'Byte' into a vector of 'ByteCode'.
      * Helped by [[ByteCodeValues.bytecode]] to translate an individual 'Byte'
      * into a corresponding [[ByteCode]]
      *
      * @param bc a vector of bytes representing ByteCode
      * @return a vector of ByteCode
      */
    def parse(bc: Vector[Byte]): Vector[ByteCode] = ???
  }
}