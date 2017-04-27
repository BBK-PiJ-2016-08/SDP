package main.scala.mediator

/**
  * Created by jakeholdom on 24/04/2017.
  */
class Button extends Colleague {

  private var mediator: MachineMediator = _

  override def setMediator(mediator: MachineMediator): Unit = {
    this.mediator = mediator
  }

  def press(): Unit = {
    println("Button pressed.")
    this.mediator.start()
  }

}
