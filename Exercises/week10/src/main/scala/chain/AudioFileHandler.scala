package main.scala.chain

/**
  * Created by jakeholdom on 22/04/2017.
  */
case class AudioFileHandler(s: String) extends Handler {
  override def setHandler(handler: Handler): Unit = AudioFileHandler

  override def process(file: File): Unit = {

    if (file.fileType == "audio"){

      println("Process and saving audio file " + file.fileName +" by Audio Handler")

    }else{

      println("Audio Handler forwards request to Video Handler")
      VideoFileHandler(s).process(file)

    }


  }

  override def getHandlerName(): String = s
}