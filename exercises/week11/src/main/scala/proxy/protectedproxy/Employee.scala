package main.scala.proxy.protectedproxy

/**
  * Created by jakeholdom on 25/04/2017.
  */
class Employee extends Staff {
  private var reportGenerator: ReportGeneratorProxy = _

  override def setReportGenerator(
                                   reportGenerator: ReportGeneratorProxy
                                 ): Unit = this.reportGenerator = reportGenerator

  override def isOwner(): Boolean = false

  def generateDailyReport(): String = reportGenerator.generateDailyReport()

}