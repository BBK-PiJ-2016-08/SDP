package main.scala.proxy.remoteproxy

import java.rmi.Naming
import java.rmi.RemoteException
import java.rmi.server.UnicastRemoteObject
import java.util.Date
/**
  * Created by jakeholdom on 25/04/2017.
  */

object ReportGeneratorImpl extends App {
  try {
    val reportGenerator: ReportGenerator = new ReportGeneratorImpl()
    Naming.rebind("PizzaCoRemoteGenerator", reportGenerator)
  } catch {
    case e: Exception => e.printStackTrace()
  }
}

class ReportGeneratorImpl protected ()
  extends UnicastRemoteObject
    with ReportGenerator {

  override def generateDailyReport(): String = {

    try {
      val report = new StringBuilder
      report.append("********************Location X Daily Report********************")
      report.append("Location ID: 012")
      report.append("Today’s Date: Sun Sep 39 00:11:23 GMT 2016")
      report.append("Total Pizza Sell: 112")
      report.append("Total Sale: $2534")
      report.append("Net Profit: $1985")
      report.append("***************************************************************")

      report.toString()

    }catch{
      case e: RemoteException => e.getMessage

    }
  }
}