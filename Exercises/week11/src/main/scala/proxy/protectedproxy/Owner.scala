package main.scala.proxy.protectedproxy

/**
  * Created by jakeholdom on 25/04/2017.
  */
class Owner extends Staff {
  var isOwner: Boolean = true

  private var reportGenerator: ReportGeneratorProxy = _

  override def setReportGenerator(
                                   reportGenerator: ReportGeneratorProxy
                                 ): Unit = this.reportGenerator = reportGenerator

  def generateDailyReport(): String = this.reportGenerator.generateDailyReport()
}
