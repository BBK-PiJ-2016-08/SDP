package ExcerciseScala.Notifiers
import ExcerciseScala.Sensors.Sensor

/**
  * Created by jakeholdom on 29/01/2017.
  */
class OwnerNotifier extends Notifier{
  override def notify(sensor: Sensor): Unit = {

    println("Calling owner...")

  }
}
