package chain

/**
  * Created by jakeholdom on 22/04/2017.
  */
case class ImageFileHandler(s: String) extends Handler {
  override def setHandler(handler: Handler): Unit = ImageFileHandler

  override def process(file: File): Unit = {
    if (file.fileType == "image"){

      println("Process and saving Image file " + file.fileName +" by Image Handler")

    }else{

      println("File not supported")

    }

  }

  override def getHandlerName(): String = s
}
