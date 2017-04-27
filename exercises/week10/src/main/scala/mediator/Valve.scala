package main.scala.mediator

/**
  * Created by jakeholdom on 24/04/2017.
  */
class Valve extends Colleague {

  private var mediator: MachineMediator = _

  override def setMediator(mediator: MachineMediator): Unit = this.mediator = mediator

  def open(): Unit = {
    println("Valve is opened...")

    println("Filling water...")

    this.mediator.closed()
  }


  def closed(): Unit = {
    println("Valve is closed...")
    this.mediator.on()
  }

}
