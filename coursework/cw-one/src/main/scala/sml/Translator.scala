package sml

import scala.collection.mutable.ArrayBuffer

/*
 * The translator of a <b>S</b><b>M</b>al<b>L</b> program.
 */
class Translator(fileName: String) {
  /**
    * translate the small program in the file into lab (the labels) and prog (the program)
    */

  def readAndTranslate(m: Machine): Machine = {
    val labels = m.labels
    var program = m.prog
    import scala.io.Source
    val lines = Source.fromFile(fileName).getLines

    val name = "Instruction"
    for (line <- lines) {
      val fields = line.split(" ")
      if (fields.nonEmpty) {
        labels.add(fields(0))
        var field = fields(1)
        val firstLetter = field.substring(0, 1).toUpperCase // capitalises first letter of label field
        val restOfLetters = field.substring(1).toLowerCase // makes sure the other letters are lower case
        field = firstLetter + restOfLetters // concatenates the two strings

        try {

          val fieldArray = ArrayBuffer[Any]()
          for (i <- 2 until fields.size) {
            fieldArray += fields(i) // adds all fields after the function number and label to an array
          }

          val actualClass = Class.forName("sml." + field + name)


          program = program :+ instantiateSMLClass(actualClass)(fields(0),fields(1), fieldArray) // instantiates
          // the class via reflection and adds it to the program object

        } catch {
          case ex: ClassNotFoundException =>
            println("Class Not Found Exception " + ex.printStackTrace())

        }
      }
    }
    new Machine(labels, program)

  }
  def instantiateSMLClass[T](actualClass: java.lang.Class[T])(label: String,opcode: String, args: ArrayBuffer[Any]):
  Instruction = {

    val constructor = actualClass.getConstructors()(0) // creates a new constructor object from the incoming class


    constructor.newInstance(label,opcode,args).asInstanceOf[Instruction]

  }
}


object Translator {
  def apply(file: String) = new Translator(file)
}
