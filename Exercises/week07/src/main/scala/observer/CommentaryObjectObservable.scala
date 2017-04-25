package main.scala.observer

import com.sun.tools.javac.util.ListBuffer

/**
  * Created by jakeholdom on 25/04/2017.
  */
class CommentaryObjectObservable(title: String) extends
  Commentary with Subject{

  var description : String = _

  def setDesc(description : String): Unit ={

    this.description = description
  }

  override def subscribeObserver(observer: Observer): Unit = ???

  override def unSubscribeObserver(observer: Observer): Unit = ???

  override def notifyObservers(): Unit = ???

  override def subjectDetails: String = ???
}
