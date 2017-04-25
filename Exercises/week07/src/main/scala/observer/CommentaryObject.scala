package main.scala.observer

import scala.collection.mutable.ListBuffer

/**
  * Created by jakeholdom on 25/04/2017.
  */

class CommentaryObject(var subscribers: ListBuffer[Observer], val title: String) extends Subject {
  def subscribeObserver(observer: Observer) = ???

  def unSubscribeObserver(observer: Observer) = ???

  def notifyObservers() = ???

  def subjectDetails: String = ???
}
