package main.scala.proxy.protectedproxy

/**
  * Created by jakeholdom on 25/04/2017.
  */
class ReportGeneratorProtectionProxy(var staff: Staff)
  extends ReportGeneratorProxy {

  var reportGenerator: ReportGenerator = _

  override def generateDailyReport(): String =
    if (staff.isOwner) {
      val report = new StringBuilder
      report.append("********************Location X Daily Report********************\n")
      report.append("Location ID: 012\n")
      report.append("Today's Date: Sun Sep 14 13:28:12 IST 2014\n")
      report.append("Total Pizza Sell: 112\n")
      report.append("Total Sale: $2534\n")
      report.append("Net Profit: $1985\n")
      report.append("***************************************************************\n")

      report.toString()
    } else {
      "Not Authorized to view report."
    }
}
