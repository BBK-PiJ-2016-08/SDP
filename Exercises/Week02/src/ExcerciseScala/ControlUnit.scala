package ExcerciseScala

import scala.collection.mutable.ListBuffer


object ControlUnit


class ControlUnit {

  var batterySensors: ListBuffer[SensorBattery] = new ListBuffer[SensorBattery]

  def setSensorList(sensors: ListBuffer[SensorBattery]): Unit ={
    batterySensors = sensors
  }
  def pollSensors() {
    for (sensor <- batterySensors) {
      if (sensor.getBatteryPercentage() > 0) {
        if (sensor.checkTriggered) {
          System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
        }
        else {
          System.out.println("Alarm is triggered = " + sensor.isTriggered + " Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully "
            + "battery remaining = " + sensor.getBatteryPercentage)
        }
      } else {
        System.out.println(sensor.getSensorType + " at " + sensor.getLocation + " has run out of battery, please put new batteries in")
      }
    }

  }

}
