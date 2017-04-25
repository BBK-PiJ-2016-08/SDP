package main.scala.observer

/**
  * Created by jakeholdom on 25/04/2017.
  */
class SMSUsersObserver(obj: CommentaryObjectObservable, subscriber: String) extends Observer {

  override def subscribe: Unit = {
    obj.subscribeObserver(this)

  }

  override def unSubscribe: Unit = {

    obj.unSubscribeObserver(this)
  }

  override def update(desc: String): Unit = obj.description = desc
}
