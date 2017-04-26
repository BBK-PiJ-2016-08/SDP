package main.scala.proxy.remoteproxy

import java.net.ConnectException
import java.rmi.{Naming, RemoteException}

/**
  * Created by jakeholdom on 25/04/2017.
  */

object ReportGeneratorClient extends App {
    new ReportGeneratorClient().generateReport()

}

class ReportGeneratorClient {
  def generateReport(): Unit = {
    try {
      val reportGenerator: ReportGenerator = Naming
        .lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator")
        .asInstanceOf[ReportGenerator]
      println("Generate report being called")
      println(reportGenerator.generateDailyReport())
    } catch {
      case e: Exception => e.printStackTrace()
    }
  }
}
