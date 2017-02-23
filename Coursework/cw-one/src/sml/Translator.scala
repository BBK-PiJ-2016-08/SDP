package sml

import java.{lang, util}

import scala.reflect
import java.lang.ClassLoader

import sun.tools.asm.Instruction

import scala.collection.mutable.ArrayBuffer

/*
 * The translator of a <b>S</b><b>M</b>al<b>L</b> program.
 */
class Translator(fileName: String) {
  /**
    * translate the small program in the file into lab (the labels) and prog (the program)
    */
  def instantiate[T](actualClass: java.lang.Class[T])(label: String, args: ArrayBuffer[Any]): Instruction = {

    val constructor = actualClass.getConstructors()(0)

    constructor.newInstance(label, args).asInstanceOf[Instruction]

  }
  def readAndTranslate(m: Machine): Machine = {
    val labels = m.labels
    var program = m.prog
    import scala.io.Source
    val lines = Source.fromFile(fileName).getLines

    val name = "Instruction"
    for (line <- lines) {
      val fields = line.split(" ")
      if (fields.length > 0) {
        labels.add(fields(0))
        var field = fields(1)
        val firstLetter = field.substring(0, 1).toUpperCase
        val restOfLetters = field.substring(1).toLowerCase()
        field = firstLetter + restOfLetters

        try {


          val fieldArray = ArrayBuffer[Any]()
          for (i <- 2 until fields.size) {
            fieldArray += fields(i)
          }

          val actualClass = Class.forName("sml." + field + name)

          //val cons = constructor.newInstance(String: fields(0), ArrayBuffer[Any]).asInstanceOf[Instruction]

          //val instance = instantiate(classOf[Instruction])(new java.lang.Integer(42), "foo")
         // val cons = actualClass.getConstructor()

          program = program :+ instantiate(actualClass)(fields(0), fieldArray)
          //val method = loadedMyClass.getMethod();


        } catch {
          case ex: ClassNotFoundException =>
            println("Class Not Found Exception " + ex.printStackTrace())

        }
      }
    }
    new Machine(labels, program)

  }
}


object Translator {
  def apply(file: String) = new Translator(file)
}

/*
 fields(1) match {
        case ADD =>
          program = program :+ AddInstruction(fields(0), fields(2).toInt, fields(3).toInt, fields(4).toInt)
        case LIN =>
          program = program :+ LinInstruction(fields(0), fields(2).toInt, fields(3).toInt)
        case MUL =>
          program = program :+ MulInstruction(fields(0), fields(2).toInt, fields(3).toInt, fields(4).toInt)
        case DIV =>
          program = program :+ DivInstruction(fields(0), fields(2).toInt, fields(3).toInt, fields(4).toInt)
        case SUB =>
          program = program :+ SubInstruction(fields(0), fields(2).toInt, fields(3).toInt, fields(4).toInt)
        case OUT =>
          program = program :+ OutInstruction(fields(0), fields(2).toInt)
        case BNZ =>
          program = program :+ BnzInstruction(fields(0), fields(2).toInt, fields(3))
        case x =>
          println(s"Unknown instruction $x")
 */