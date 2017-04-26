package main.scala.state

case class RoboticCook(r: Robot) extends RoboticState {
  def walk(): Unit = println("Walking...")
  def cook(): Unit = println("Cooking...")
  def off(): Unit = println("Robot is switched off")
}
