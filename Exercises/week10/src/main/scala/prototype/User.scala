package main.scala.prototype

/**
  * Created by jakeholdom on 24/04/2017.
  */
class User(var userName: String,
           var level: String,
           var accessControl: AccessControl) {

  override def toString() =
    s"Name: $userName, Level: $level, Access Control Level:" +
      s"${accessControl.controlLevel}, Access: ${accessControl.access}"

}
