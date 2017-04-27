package main.scala.strategy

/**
  * Created by jakeholdom on 03/03/2017.
  */


object TestStrategyPattern extends App {
  var formatter: TextFormatter = CapTextFormatter()
  var editor: TextEditor = TextEditor(formatter)
  editor.publishText("Testing text in caps formatter")
  formatter = LowerTextFormatter()
  editor = TextEditor(formatter)
  editor.publishText("Testing text in lower formatter")
}
