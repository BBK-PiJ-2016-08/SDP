import vendor.{Instruction, ProgramParser}

import scala.io.Source

/**
  * Created by jakeholdom on 09/03/2017.
  */
class ProgramParserImpl extends ProgramParser{
  override type InstructionList = Vector[Instruction]

  /**
    * Parses a file representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param file the file to parse
    * @return an instruction list
    */
  override def parse(file: String): InstructionList = {


    val lines = Source.fromFile(file).getLines
    val instructions = new InstructionList

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

    val instructions = new InstructionList

    val fields = string.split(" ")
    if (fields.nonEmpty){

      for (field <- fields){

        instructions :+ field

      }

    }

    instructions
  }
}
