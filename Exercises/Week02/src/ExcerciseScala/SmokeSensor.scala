package ExcerciseScala

import java.util.Random

class SmokeSensor(var sensorType: String) extends SensorBattery {
  var location = ""
  var triggered = false


  def this() {
    this("Smoke")
  }


  def setSensorType(setSensorType : String): Unit = this.sensorType = setSensorType

  def setLocation(setLocation : String): Unit = this.location = setLocation

  def resetTriggered(): Unit = this.triggered = false


  override def isTriggered: Boolean = {
    reduceBattery(this)
    val r = new Random()
    if (r.nextInt(100) < 5){
      this.triggered = true

      return this.triggered
    }

    this.triggered
  }

  override def checkTriggered: Boolean = this.triggered

  override def getLocation = this.location

  override def getSensorType = this.sensorType

  override def getBatteryPercentage = battery

}
