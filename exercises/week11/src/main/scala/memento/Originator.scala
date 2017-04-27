package main.scala.memento

/**
  * Created by jakeholdom on 25/04/2017.
  */
case class Originator(
                       var x: Double,
                       var y: Double,
                       var careTaker: CareTaker
                     ) {


  private var lastUndoSavepoint: String = _

  createSavepoint("INITIAL")

  def createSavepoint(savepointName: String): Unit = {
    println("Saving state..." + savepointName)
    lastUndoSavepoint = savepointName
    careTaker.saveMemento(Memento(x, y), savepointName)

  }

  def undo(): Unit = {
    println("Undo at ..." + lastUndoSavepoint)
    setOriginatorState(lastUndoSavepoint)

  }

  def undo(savepointName: String): Unit = {
    println("Undo at ..." + savepointName)
    setOriginatorState(savepointName)

  }

  def undoAll(): Unit = {
    println("Undo at ...INITIAL")
    setOriginatorState("INITIAL")
    careTaker.clearSavepoints()

  }

  private def setOriginatorState(savepointName: String): Unit = {
    val memento = careTaker.getMemento(savepointName)

    this.x = memento.x
    this.y = memento.y

  }

  override def toString(): String = "X: " + x + ", Y: " + y
}
