package main.scala.proxy.protectedproxy

/**
  * Created by jakeholdom on 25/04/2017.
  */
object TestProtectionProxy extends App {
  val owner: Owner = new Owner()
  var reportGenerator: ReportGeneratorProxy =
    new ReportGeneratorProtectionProxy(owner)
  owner.setReportGenerator(reportGenerator)
  val employee: Employee = new Employee()
  reportGenerator = new ReportGeneratorProtectionProxy(employee)
  employee.setReportGenerator(reportGenerator)
  println("For owner:")
  println(owner.generateDailyReport())
  println("For employee:")
  println(employee.generateDailyReport())
}
