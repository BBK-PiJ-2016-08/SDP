package main.scala.command

/**
  * Created by jakeholdom on 22/04/2017.
  */
class FileIOJob extends Job {

  var fileIO :FileIO = _
  def setFileIO(fileIO: FileIO): Unit = this.fileIO = fileIO

  override def run(): Unit = this.fileIO.execute()
}
