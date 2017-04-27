package main.scala.mediator

/**
  * Created by jakeholdom on 24/04/2017.
  */
class Heater extends Colleague {
  private var mediator: MachineMediator = _

  override def setMediator(mediator: MachineMediator): Unit = this.mediator = mediator

  def on(temp: Int): Unit = {
    println("Heater is on...")
    if (this.mediator.checkTemperature(temp)){
      println("Temperature reached " + temp + " C")
      println("Temperature is set to " + temp + " C")
      this.mediator.off()

    }

  }

  def off(): Unit = {
    println("Header is off...")
    this.mediator.wash()

  }


}
