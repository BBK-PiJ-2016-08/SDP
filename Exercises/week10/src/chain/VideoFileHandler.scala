package chain

/**
  * Created by jakeholdom on 22/04/2017.
  */
case class VideoFileHandler(s: String) extends Handler {
  override def setHandler(handler: Handler): Unit = VideoFileHandler

  override def process(file: File): Unit = {
    if (file.fileType == "video"){

      println("Process and saving video file " + file.fileName +" by Video Handler")

    }else{

      println("Video Handler forwards request to Image Handler")
      ImageFileHandler(s).process(file)

    }

  }

  override def getHandlerName(): String = s
}