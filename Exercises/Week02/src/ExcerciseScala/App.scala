package ExcerciseScala

import java.io.IOException
import java.util.Scanner

import ExcerciseScala.ControlUnits.{ControlUnit, SecurityControlUnit}
import ExcerciseScala.Sensors.{FireSensor, MotionSensor, Sensor, SmokeSensor}

import scala.collection.mutable.ListBuffer


object App {
  private val EXIT = "exit"
  private val POLL = "poll"

  @throws[IOException]
  def main(args: Array[String]) {

    val controlUnit = new ControlUnit(addBatterySensors())
    val scanner = new Scanner(System.in)
    var input = ""
    val secControlUnit = new SecurityControlUnit(addSecuritySensors())
    secControlUnit.checkCurrentTime()
    while (input != EXIT) {
      println("Type \"poll\" to poll all sensors once or \"exit\" to exit")
      input = scanner.nextLine
      if (input == POLL) controlUnit.pollSensors()
      secControlUnit.pollSensors()
    }



  }

  def addSecuritySensors(): ListBuffer[Sensor] = {

    val sensor1 = new MotionSensor()
    val sensor2 = new MotionSensor()


    sensor1.setLocation("downstairs")
    sensor2.setLocation("upstairs")



    val sensors = ListBuffer[Sensor]()

    sensors += sensor1
    sensors += sensor2



    sensors

  }

  def addBatterySensors(): ListBuffer[Sensor] = {

    val sensor1 = new FireSensor()
    val sensor2 = new FireSensor()
    val sensor3 = new SmokeSensor()
    val sensor4 = new SmokeSensor()

    sensor1.setLocation("downstairs")
    sensor2.setLocation("upstairs")
    sensor3.setLocation("Kitchen")
    sensor4.setLocation("Dining Room")


    val sensors = ListBuffer[Sensor]()

    sensors += sensor1
    sensors += sensor2
    sensors += sensor3
    sensors += sensor4


    sensors

  }

}
