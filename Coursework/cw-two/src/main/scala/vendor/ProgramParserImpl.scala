package vendor

import com.sun.org.apache.bcel.internal.generic.InstructionList
import vendor.{Instruction, ProgramParser}

import scala.io.Source

/**
  * Created by jakeholdom on 09/03/2017.
  */
class ProgramParserImpl extends ProgramParser{
  override type InstructionList = Vector[Instruction]

   def instructionList(instruction: Instruction*) = Vector(instruction: _*)

  /**
    * Parses a file representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param file the file to parse
    * @return an instruction list
    */
  override def parse(file: String): InstructionList = {


    val lines = Source.fromFile(file).getLines
    val instructions = instructionList()

    for (line <- lines){
      if (line.nonEmpty){

        instructions :+ parseString(line)

      }else{
        println("Reached end of file")

      }
    }

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

    var instructions = instructionList()

    val fields = string.split("\n")
    if (fields.nonEmpty){
      for (field <- fields){
        val fieldOne = field
        var fieldTwo:Vector[Int] = Vector[Int]()
        if(field.contains(" ")){
          val multipleInstr = field.split(" ")
          val fieldOne = multipleInstr(0)
           fieldTwo = fieldTwo :+ multipleInstr(1).toInt


          instructions = instructions :+ new Instruction(fieldOne, fieldTwo)
        }else{
          instructions = instructions :+ new Instruction(fieldOne, fieldTwo)

        }

      }

    }

    instructions
  }
}
