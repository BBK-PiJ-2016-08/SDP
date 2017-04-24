package main.scala.command

/**
  * Created by jakeholdom on 22/04/2017.
  */
class EmailJob extends Job {

  var email:Email = _
  def setEmail(email: Email): Unit = this.email = email

  override def run(): Unit = this.email.sendEmail()
}