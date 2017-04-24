package main.scala.chain

/**
  * Created by jakeholdom on 22/04/2017.
  */
case class DocFileHandler(s: String) extends Handler {
  override def setHandler(handler: Handler): Unit = DocFileHandler

  override def process(file: File): Unit = {

    if (file.fileType == "doc"){

      println("Process and saving doc file " + file.fileName +" by doc Handler")

    }else{

      println("Doc Handler forwards request to Excel Handler")
      ExcelFileHandler(s).process(file)

    }

  }

  override def getHandlerName(): String = s
}