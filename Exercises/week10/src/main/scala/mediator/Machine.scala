package main.scala.mediator

/**
  * Created by jakeholdom on 24/04/2017.
  */

class Machine extends Colleague {

  private var mediator: MachineMediator = _

  override def setMediator(mediator: MachineMediator): Unit = this.mediator = mediator

  def start(): Unit = {
    println("Machine started...")
    this.mediator.open()

  }
  def wash(): Unit = {
    println("Machine washing...")
  }
}