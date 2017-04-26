package main.scala.proxy.remoteproxy

import java.rmi.Remote
import java.rmi.RemoteException
/**
  * Created by jakeholdom on 25/04/2017.
  */

trait ReportGenerator extends Remote {
  def generateDailyReport(): String
}