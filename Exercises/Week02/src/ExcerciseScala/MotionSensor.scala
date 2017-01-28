package ExcerciseScala

import java.util.Random

/**
  * Created by jakeholdom on 28/01/2017.
  */
class MotionSensor(var sensorType: String) extends SecuritySensor {

  var location = ""
  var triggered = false

  def this() {
    this("Motion")
  }


  def setSensorType(setSensorType : String): Unit = this.sensorType = setSensorType

  def setLocation(setLocation : String): Unit = this.location = setLocation

  def resetTriggered(): Unit = this.triggered = false


  override def isTriggered:Boolean = {
    this.triggered
  }

  override def getLocation = this.location

  override def getSensorType = this.sensorType

  override def checkTriggered: Boolean = ???
}
