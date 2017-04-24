package main.scala.command

/**
  * Created by jakeholdom on 22/04/2017.
  */
class LoggingJob extends Job {

  var logging : Logging = _
  def setLogging(logging: Logging): Unit = this.logging = logging

  override def run(): Unit = this.logging.log
}
