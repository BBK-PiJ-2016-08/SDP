package Notifiers
import Sensors.Sensor

/**
  * Created by jakeholdom on 29/01/2017.
  */
class PoliceNotifier extends Notifier{
  override def notify(sensor: Sensor): Unit = {
    println("Calling police department for sensor " + sensor.getSensorType + " in location " + sensor.getLocation)
  }
}
