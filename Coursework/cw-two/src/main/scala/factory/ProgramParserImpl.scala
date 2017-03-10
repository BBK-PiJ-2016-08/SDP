package factory

import com.sun.org.apache.bcel.internal.generic.InstructionList

import scala.io.Source
import vendor.{Instruction, InvalidInstructionFormatException, ProgramParser}
/**
  * Created by jakeholdom on 09/03/2017.
  */
class ProgramParserImpl extends ProgramParser{
  /**
    * Parses a file representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param file the file to parse
    * @return an instruction list
    */
  override def parse(file: String): InstructionList = {

    val lines = Source.fromFile(file).getLines
    var instructions = new InstructionList

    for (line <- lines){
      if (line.nonEmpty){

        instructions :+ parseString(line)

      }else{
        println("Reached end of file")

      }
    }

    println(instructions)
    instructions
  }

  /**
    * Parses a string representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param string the string to parse
    * @return an instruction list
    */
  override def parseString(string: String): InstructionList = {

    var instructions = new InstructionList

    val fields = string.split(" ")
    if (fields.nonEmpty){

      for (field <- fields){

        instructions :+ field

      }

    }

    instructions
  }
}
