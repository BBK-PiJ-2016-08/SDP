package main.scala.chain

/**
  * Created by jakeholdom on 22/04/2017.
  */
case class ExcelFileHandler(s: String) extends Handler {
  override def setHandler(handler: Handler): Unit = ExcelFileHandler

  override def process(file: File): Unit = {
    if (file.fileType == "excel"){

      println("Process and saving excel file " + file.fileName +" by Excel Handler")

    }else{

      println("Excel Handler forwards request to Audio Handler")
      AudioFileHandler(s).process(file)

    }


  }

  override def getHandlerName(): String = s
}
