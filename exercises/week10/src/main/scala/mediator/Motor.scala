package main.scala.mediator

/**
  * Created by jakeholdom on 24/04/2017.
  */

class Motor {

  def startMotor(): Unit = println("Start motor...")

  def rotateDrum(rpm: Int): Unit = println("Rotating drum at " + rpm + " rpm")
}
