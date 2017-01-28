package ExcerciseScala

import java.io.IOException
import java.util.Scanner
import scala.collection.mutable.ListBuffer


object App {
  private val EXIT = "exit"
  private val POLL = "poll"

  @throws[IOException]
  def main(args: Array[String]) {

    val controlUnit = new ControlUnit()
    controlUnit.setSensorList(addBatterySensors())
    val scanner = new Scanner(System.in)
    var input = ""
    while (input != EXIT) {
      println("Type \"poll\" to poll all sensors once or \"exit\" to exit")
      input = scanner.nextLine
      if (input == POLL) controlUnit.pollSensors()
    }
  }

  def addBatterySensors(): ListBuffer[SensorBattery] = {

    val sensor1 = new FireSensor()
    val sensor2 = new FireSensor()
    val sensor3 = new SmokeSensor()
    val sensor4 = new SmokeSensor()

    sensor1.setLocation("downstairs")
    sensor2.setLocation("upstairs")
    sensor3.setLocation("Kitchen")
    sensor4.setLocation("Dining Room")


    val sensors = ListBuffer[SensorBattery]()

    sensors += sensor1
    sensors += sensor2
    sensors += sensor3
    sensors += sensor4


    sensors

  }

}
