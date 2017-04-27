package main.scala.proxy.virtualproxy

/**
  * Created by jakeholdom on 25/04/2017.
  */
case class Employee(
                     var employeeName: String,
                     var employeeSalary: Double,
                     var employeeDesignation: String
                   ) {

  override def toString(): String = "Employee Name: " + employeeName + ", EmployeeDesignation: " +
  ", Employee Salary: " + employeeSalary
}
