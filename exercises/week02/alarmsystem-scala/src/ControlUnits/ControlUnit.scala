package ControlUnits

import Sensors.Sensor

import scala.collection.mutable.ListBuffer


object ControlUnit


class ControlUnit (sensors: ListBuffer[Sensor]){


  def pollSensors() {
    for (sensor <- sensors) {
      if (sensor.isTriggered) {
        System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
      }
      else {
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }

  }

}
