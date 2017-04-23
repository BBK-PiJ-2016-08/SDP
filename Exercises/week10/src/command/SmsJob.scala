package command

/**
  * Created by jakeholdom on 22/04/2017.
  */
class SmsJob extends Job {

  var sms: Sms = _
  def setSms(sms: Sms): Unit = this.sms = sms

  override def run(): Unit = this.sms.sendSms
}