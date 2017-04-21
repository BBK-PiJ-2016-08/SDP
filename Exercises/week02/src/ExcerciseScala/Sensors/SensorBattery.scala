package ExcerciseScala.Sensors

import ExcerciseScala.Notifiers.{FireNotifier, OwnerNotifier, PoliceNotifier}

/**
  * Created by jakeholdom on 28/01/2017.
  */
abstract class SensorBattery extends Sensor{

  protected var battery = 100.00
  var fireNotifier = new FireNotifier
  var ownerNotifier = new OwnerNotifier


  def runNotification(sensor: Sensor): Unit ={

    fireNotifier.notify(sensor)
    ownerNotifier.notify(sensor)
  }

  def reduceBattery(sensorType : Sensor): Double = {

    if (sensorType.isInstanceOf[FireSensor]){
      if (battery <= 10) {
        println("Please put new batteries in")
        battery = 0
      }else {
        battery -= 10
      }

    } else if(sensorType.isInstanceOf[SmokeSensor]){

      if (battery <= 20) {
        println("Please put new batteries in")
        battery = 0
      }else {
        battery -= 20
      }

    }
    battery

  }


  def setBattery(setBattery : Double): Unit = {
    if(setBattery < 100 ||setBattery > 0){
      battery = setBattery
    }
    println("Battery percentage has to be between 1-100")

  }
  def getBatteryPercentage(): Double = battery



}
