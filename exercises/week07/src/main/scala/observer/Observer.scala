package main.scala.observer

/**
  * Created by jakeholdom on 25/04/2017.
  */
trait Observer {
  def update(desc: String)

  def subscribe()

  def unSubscribe()
}
