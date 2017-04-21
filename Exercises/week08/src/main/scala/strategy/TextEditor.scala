package main.scala.strategy

/**
  * Created by jakeholdom on 03/03/2017.
  */
case class TextEditor(textFormatter: TextFormatter) {

  def publishText(string: String): Unit ={

    val returnString = textFormatter.format(string)
    println(returnString)
  }

}
