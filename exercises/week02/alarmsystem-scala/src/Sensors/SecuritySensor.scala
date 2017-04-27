package Sensors

import Notifiers.PoliceNotifier
import Notifiers.OwnerNotifier


/**
  * Created by jakeholdom on 28/01/2017.
  */
abstract class SecuritySensor extends Sensor {

  var policeNotifier = new PoliceNotifier
  var ownerNotifier = new OwnerNotifier


  def runNotification(sensor: Sensor): Unit ={

    policeNotifier.notify(sensor)
    ownerNotifier.notify(sensor)
  }

}
