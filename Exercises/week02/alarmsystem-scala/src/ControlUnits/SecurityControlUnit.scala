package ControlUnits

import java.text.SimpleDateFormat
import java.util.Calendar

import Sensors.Sensor

import scala.collection.mutable.ListBuffer

/**
  * Created by jakeholdom on 28/01/2017.
  */
class SecurityControlUnit(sensors: ListBuffer[Sensor]) extends ControlUnit(sensors){

  //val currentTime = Calendar.getInstance().getTime


  override def pollSensors(): Unit = {
    if(checkCurrentTime()){
      super.pollSensors()

    }else{

      println("Security sensors will begin polling between the hours 22:00-06:00")
    }
  }

  def checkCurrentTime(): Boolean = {

    val now = Calendar.getInstance().getTime()
    val hourFormat = new SimpleDateFormat("HH")
    val currentHour = Integer.parseInt(hourFormat.format(now))

    if(currentHour >= 15 || currentHour < 6){

      return true
    }

    false
  }


}
