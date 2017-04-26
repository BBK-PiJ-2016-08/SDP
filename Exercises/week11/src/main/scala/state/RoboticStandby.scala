package main.scala.state

case class RoboticStandby(r: Robot) extends RoboticState {
  def walk(): Unit = println("Walking...")
  def cook(): Unit = if(r.state.equals(r.roboticOff)){
    println("Cannot cook at Off state")
  }else{
    println("Cooking...")

  }
  def off(): Unit = println("Robot is switched off")
}
