package main.scala.chain

/**
  * Created by jakeholdom on 22/04/2017.
  */
case class TextFileHandler(s: String) extends Handler {
  override def setHandler(handler: Handler): Unit = TextFileHandler

  override def process(file: File): Unit = {

    if (file.fileType == "text"){

      println("Process and saving text file " + file.fileName +" by Text Handler")

    }else{

      println("Text Handler forwards request to Doc Handler")
      DocFileHandler(s).process(file)

    }

  }

  override def getHandlerName(): String = s
}
